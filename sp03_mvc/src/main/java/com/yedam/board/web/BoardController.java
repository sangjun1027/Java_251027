package com.yedam.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.board.BoardVO;
import com.yedam.board.mapper.BoardMapper;


@Controller
public class BoardController {
	
	@Autowired BoardMapper boardMapper;
	
	// 전체조회
	@GetMapping("/board")
	public String selectall(Model model) {
		model.addAttribute("list", boardMapper.getList());
		return "board/list";
	}
	
	// 등록 / 등록화면 출현
	@GetMapping("/board/register")
	public String registerpage(Model model) {
	    model.addAttribute("board", new BoardVO());
		return "board/register";
	}
	
	// 등록처리 / 실제등록처리
	@PostMapping("/board/register")
	public String register(BoardVO board) {
		boardMapper.insertBoard(board);
		return "redirect:/board";
	}
	
	//  수정페이지로 이동
	@GetMapping("/board/update")	// board/update?bno=1 or /board.update1
	public String modifypage(Model model,
							 @RequestParam("bno") Long bno) {
		BoardVO vo = boardMapper.getBoard(bno);
		
		model.addAttribute("board", vo);
		
		return "board/register";
	}
	
	// 수정처리
	@PostMapping("/board/update")
	public String modify(BoardVO board) {
		boardMapper.updateBoard(board);		
		return "redirect:/board";
	}
	
	
	// 삭제처리
	@PostMapping("/board/delete")	//board/update?bno=1 or /board/update/1
	public String updatepage(@RequestParam Map<String, Object> map) {
		boardMapper.delete(map);
		return "redirect:/board";
	}
	
	
	
}
