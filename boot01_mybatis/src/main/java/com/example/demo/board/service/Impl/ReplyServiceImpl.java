package com.example.demo.board.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

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
