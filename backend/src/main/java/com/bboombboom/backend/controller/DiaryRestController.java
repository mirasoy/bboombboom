package com.bboombboom.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bboombboom.backend.dto.DailyRecordDTO;
import com.bboombboom.backend.dto.DiaryDTO;
import com.bboombboom.backend.entity.DailyRecord;
import com.bboombboom.backend.entity.Diary;
import com.bboombboom.backend.service.DailyRecordService;
import com.bboombboom.backend.service.DiaryService;

@RestController
public class DiaryRestController {

	@Autowired
	DiaryService diaryService;
	
	
	@Autowired
	DailyRecordService dailyRecordService;
	
	@GetMapping("/diaries")
	List<DiaryDTO> getDiaries(){
		
		return diaryService.getDiaries();
	}
	
	@PostMapping("/diary")
	Diary saveDiary(@RequestBody Diary diary){		
		return diaryService.saveDiary(diary);
	}
	
	@GetMapping("/diary/{diaryId}")
	DiaryDTO getDiary(@PathVariable long diaryId){
		return diaryService.getDiary(diaryId);
	}
	
	@GetMapping("/diary/{diaryId}/dailyRecords")
	List<DailyRecordDTO> getDailyRecords(@PathVariable long diaryId){
		return dailyRecordService.getDailyRecords(diaryId);
	}
	
	@PostMapping("/diary/{diaryId}/dailyRecord")
	void saveDailyRecords(@PathVariable long diaryId,@RequestBody DailyRecordDTO record){
		dailyRecordService.saveRecord(diaryId, record);
	}
}
