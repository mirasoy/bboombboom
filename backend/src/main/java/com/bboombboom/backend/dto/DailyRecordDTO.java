package com.bboombboom.backend.dto;

import java.time.LocalDate;

import com.bboombboom.backend.entity.DailyRecord;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DailyRecordDTO {
	
	private Long recordId;
	
	private LocalDate date;
	
	private int water;
	
	private int feed;
	
	private int feces;
	
	private int urin;
	
	private int vomitin;
	
	private String medication;

	private String specialNote;
	
	private Float weight;

	public DailyRecordDTO(DailyRecord  record) {
		this.recordId = record.getRecordId();
		this.date = record.getDate();
		this.water = record.getWater();
		this.feed = record.getFeed();
		this.feces = record.getFeces();
		this.urin = record.getUrin();
		this.vomitin = record.getVomitin();
		this.medication = record.getMedication();
		this.specialNote = record.getSpecialNote();
		this.weight = record.getWeight();
	}
	


}
