package com.bboombboom.backend.dto;

import java.time.LocalDate;

import com.bboombboom.backend.entity.Diary;

import lombok.Getter;

@Getter
public class DiaryDTO {
	
	private Long diaryId;

	private String name;

	private String breeds;

	private LocalDate birthDate;

	private Float weight;

	private String specialNote;
	

	public DiaryDTO(Diary diary) {
		super();
		this.diaryId = diary.getDiaryId();
		this.name = diary.getName();
		this.breeds = diary.getBreeds();
		this.birthDate = diary.getBirthDate();
		this.weight = diary.getWeight();
		this.specialNote = diary.getSpecialNote();
	}

}
