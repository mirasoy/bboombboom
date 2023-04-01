package com.bboombboom.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bboombboom.backend.dto.DiaryDTO;
import com.bboombboom.backend.entity.Diary;
import com.bboombboom.backend.repository.DiaryRepository;

@Service
public class DiaryService {

	
	@Autowired
	DiaryRepository diaryRepository;

	@Transactional
	public List<DiaryDTO> getDiaries() {
		List<Diary> diaries = diaryRepository.findAll();
		List<DiaryDTO> diaryDTOs = new ArrayList<>();
		for(Diary diary : diaries) {
			diaryDTOs.add(new DiaryDTO(diary));
		}
		
		return diaryDTOs;
	}

	public Diary saveDiary(Diary diary) {

		return diaryRepository.save(diary);
	}

	public DiaryDTO getDiary(long diaryId) {

		Diary diary = diaryRepository.findById(diaryId).get();
		return new DiaryDTO(diary);
	}

}
