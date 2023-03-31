package com.bboombboom.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bboombboom.backend.entity.Diary;
import com.bboombboom.backend.service.DiaryService;

@RestController
public class DiaryRestController {

	@Autowired
	DiaryService diaryService;
	
	@GetMapping("/diaries")
	List<Diary> getDiaries(){
		
		List<Diary> diaries = diaryService.getDiaries();
		
		return diaries;
	}
	
	@PostMapping("/diary")
	Diary saveDiary(@RequestBody Diary diary){		
		return diaryService.saveDiary(diary);
	}
		
}
