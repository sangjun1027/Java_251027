package com.example.demo.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardService {
	// 등록
	// (call by reference)
	int insertBoard(BoardVO board);

	// 수정
	int updateBoard(BoardVO board);

	// 삭제
	int delete(Long bno);

	// 단건조회
	BoardVO getBoard(Long bno);

	// 전체조회
	List<BoardVO> getList();

	// 전체조회(검색)
	List<BoardVO> getListByWriter(BoardVO board);

}
