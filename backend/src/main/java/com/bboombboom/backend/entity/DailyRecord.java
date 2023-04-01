package com.bboombboom.backend.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.bboombboom.backend.dto.DailyRecordDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class DailyRecord {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recordId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
	private int water;
	
	private int feed;
	
	private int feces;
	
	private int urin;
	
	private int vomitin;
	
	private String medication;

	private String specialNote;
	
	private Float weight;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diary_id")
    private Diary diary;
	
	public DailyRecord(Diary diary, DailyRecordDTO record) {
		this.date = record.getDate();
	    this.water = record.getWater();
	    this.feed = record.getFeed();
	    this.feces = record.getFeces();
	    this.urin = record.getUrin();
	    this.vomitin = record.getVomitin();
	    this.medication = record.getMedication();
	    this.specialNote = record.getSpecialNote();
	    this.weight = record.getWeight();
	    this.diary = diary;
	}

}


