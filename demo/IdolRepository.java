package com.example.test1db.repository;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test1db.entity.Idol;

@Mapper
@Repository
public interface IdolRepository extends  JpaRepository<Idol,Integer> {

}
