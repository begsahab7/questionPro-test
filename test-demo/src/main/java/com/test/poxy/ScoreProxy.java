package com.test.poxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient("https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty")
public interface ScoreProxy {

	@GetMapping
	public String getMaxScore();
}
