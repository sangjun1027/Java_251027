package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {
	
		// 조회
		List<ReplyVO> ListReply(Long bno);
		
		
		// 등록
		int insertReply(ReplyVO reply);
		
		// 삭제
		int delete(Long rno);
	
}
