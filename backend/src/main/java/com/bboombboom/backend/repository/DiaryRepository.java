package com.bboombboom.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bboombboom.backend.entity.Diary;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long>{

}
