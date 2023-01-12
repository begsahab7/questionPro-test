package com.test.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.dto.ItemDto;
import com.test.poxy.ScoreProxy;

@Service
public class ScoreServiceImpl implements ScoreService {

//	@Autowired
//	ScoreProxy scoreProxy;
	
	@Override
	@Cacheable(cacheNames = "top-story")
	public List<ItemDto> getMaxScore() {
		System.out.println("Hello Inside Get MAx Score");
		RestTemplate rt = new RestTemplate();
		String url = "https://hacker-news.firebaseio.com/v0/topstories.json?print=pretty";
		Object[] result = rt.getForObject(url,Object[].class);
		System.out.println(result);
		List<Object> st = Arrays.asList(result);
		List<ItemDto> iList = new ArrayList<>();
		for(Object t : st) {
			System.out.println(t);
			iList.add(getStory(t.toString()));
			
		}
		List<ItemDto> finalResult = iList.stream().sorted().limit(10).collect(Collectors.toList());
		return finalResult ;
	}

	@Override
	@Cacheable(cacheNames = "story", key = "#id")
	public ItemDto getStory(String id) {
		System.out.println("Hello Inside Get story");
		RestTemplate rt = new RestTemplate();
		String url = "https://hacker-news.firebaseio.com/v0/item/"+id+".json?print=pretty";
		ItemDto result = rt.getForObject(url,ItemDto.class);
		System.out.println(result);
		
		return result;
	}
	
	

}
