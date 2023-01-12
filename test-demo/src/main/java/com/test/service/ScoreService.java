package com.test.service;

import java.util.List;

import com.test.dto.ItemDto;

public interface ScoreService {

	public List<ItemDto> getMaxScore();
	public ItemDto getStory(String id);
}
