package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.ItemDto;
import com.test.service.ScoreService;

import feign.Param;

@RestController
@RequestMapping("/")
public class ScoreController {

	@Autowired
	ScoreService sService;
	
	@GetMapping("/top-stories")
	public List<ItemDto> getMaxScore() {
		System.out.println("Inside Score Controller");
		return sService.getMaxScore();
	}
	
	@GetMapping("getStory/{id}")
	public ItemDto getStory(@PathVariable("id") String id) {
		return sService.getStory(id);
	
	}
	
}