package com.bboombboom.backend.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.bboombboom.backend.dto.DailyRecordDTO;

import lombok.Getter;

@Entity
@Getter
public class Diary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long diaryId;

	private String name;

	private String breeds;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;

	private Float weight;

	private String specialNote;

	@OneToMany(mappedBy = "diary", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DailyRecord> records = new ArrayList<>();
	
	public void addRecord(DailyRecordDTO record) {
	    this.records.add(new DailyRecord(this, record));
	}
	
}
