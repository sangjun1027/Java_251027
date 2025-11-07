package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardMapper boardMapper;

	@Override
	public int insertBoard(BoardVO board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		return boardMapper.updateBoard(board);
	}

	@Override
	public int delete(Long bno) {
		return boardMapper.delete(bno);
	}

	@Override
	public BoardVO getBoard(Long bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public List<BoardVO> getListByWriter(BoardVO board) {
		return boardMapper.getListByWriter(board);
	}
	

	
	
}
