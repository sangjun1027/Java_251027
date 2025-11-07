package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
 
	private final ReplyMapper replyMapper;

	@Override
	public List<ReplyVO> ListReply(Long bno) {
		
		return replyMapper.ListReply(bno);
	}

	@Override
	public int insertReply(ReplyVO reply) {
		
		return 0;
	}

	@Override
	public int delete(Long rno) {
		
		return 0;
	}
	

	
	
}
