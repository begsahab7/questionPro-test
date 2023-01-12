package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.test.*")
@EnableCaching
@EnableScheduling
public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDemoApplication.class, args);
	}

	@CacheEvict(value = "top-story", allEntries = true)
	@Scheduled(fixedRateString = "${caching.spring.storiesListTTL}")
	public void emptyHotelsCache() {
	    System.out.println("deelting top stories...");
	}
}
