package com.example.test1db.Mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface mapper {
	@Select("SELECT id, name, state, country FROM city WHERE state = #{state}")
	mapper findByState(@Param("state") String state);
}