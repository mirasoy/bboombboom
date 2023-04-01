package com.bboombboom.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bboombboom.backend.dto.DailyRecordDTO;
import com.bboombboom.backend.entity.DailyRecord;
import com.bboombboom.backend.entity.Diary;
import com.bboombboom.backend.repository.DailyRecordRepository;
import com.bboombboom.backend.repository.DiaryRepository;

@Service
public class DailyRecordService {

	@Autowired
	DiaryRepository diaryRepository;
	
	@Autowired
	DailyRecordRepository dailyRecordRepository;

	@Transactional
	public void saveRecord(long diaryId, DailyRecordDTO record) {
		Diary diary = diaryRepository.findById(diaryId).get();
        diary.addRecord(record);
        diaryRepository.save(diary);
	}

	public List<DailyRecordDTO> getDailyRecords(long diaryId) {
		
		Diary diary = diaryRepository.findById(diaryId).get();
		List<DailyRecord> records = dailyRecordRepository.findByDiaryOrderByDateDesc(diary);
		List<DailyRecordDTO>  DailyRecordDTOs = new ArrayList<>();
		for(DailyRecord record : records){
			DailyRecordDTOs.add(new DailyRecordDTO(record));
		}
		
		return DailyRecordDTOs;
	}


}
