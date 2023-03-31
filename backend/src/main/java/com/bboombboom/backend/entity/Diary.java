package com.bboombboom.backend.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;

@Entity
@Getter
public class Diary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dairaId;
	
	private String name;
	
	private String breeds;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	private Float weight;
	
	private String specialNote;	
	
}
