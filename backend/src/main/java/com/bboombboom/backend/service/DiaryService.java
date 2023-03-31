package com.bboombboom.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bboombboom.backend.entity.Diary;
import com.bboombboom.backend.repository.DiaryRepository;

@Service
public class DiaryService {

	@Autowired
	DiaryRepository diaryRepository;
	
	public List<Diary> getDiaries() {

		return diaryRepository.findAll();
	}

	public Diary saveDiary(Diary diary) {
		
		return diaryRepository.save(diary);
	}

}
