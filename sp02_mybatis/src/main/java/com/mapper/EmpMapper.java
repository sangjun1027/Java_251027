package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmpMapper {
	List<Map>  select();		// 여러건 조회
	Map selectone(int id);			// 단 건 조회
}
