package com.bboombboom.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bboombboom.backend.entity.DailyRecord;
import com.bboombboom.backend.entity.Diary;

@Repository
public interface DailyRecordRepository extends JpaRepository<DailyRecord, Long>{

	List<DailyRecord> findByDiaryOrderByDateDesc(Diary diary);
	
}
