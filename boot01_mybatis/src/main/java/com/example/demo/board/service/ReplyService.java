package com.example.demo.board.service;

import java.util.List;

public interface ReplyService {
	
	
	// 조회
	List<ReplyVO> ListReply(Long bno);
	
	
	// 등록
	int insertReply(ReplyVO reply);
	
	// 삭제
	int delete(Long rno);
	
	
	
}
