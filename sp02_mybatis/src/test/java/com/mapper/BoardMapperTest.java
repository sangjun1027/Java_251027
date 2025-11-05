package com.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/datasource-context.xml")
public class BoardMapperTest {

	
	@Autowired BoardMapper boardMapper;
	
	@Disabled
	@Test
	void 전체조회() {
		// given => 테스트가 의존할 데이터를 명시적으로 주입
		
		//when => 오직 "행동 1개"에 집중 (테스트 이름도 행동중심으로)
		List<BoardVO> list = boardMapper.getList();
		
		//then
		assertEquals(list.get(0).getWriter(), "user00");
		System.out.println(list);
		
		for(BoardVO board : list ) {
			System.out.println(board.getBno() + ":" + board.getTitle());
			for(ReplyVO reply : board.getReply()) {
				System.out.println(reply.getReply());
			}
		}
	} 
// end of test
	
	@Disabled
	@Test
	public void insertTest() {
		// given
		BoardVO board = new BoardVO();
		board.setTitle("스프링");
		board.setContent("등록테스트");
		board.setWriter("user05");
		
		// when
		int result = boardMapper.insertBoard(board);
		long bno = board.getBno();
		System.out.println(bno);
		
		// then
		// 등록된 번호로 단건조회
		assertEquals(result, 1);
	}
	
	@Disabled
	@Test
		void updateTest() {
		// given
		BoardVO board = new BoardVO();
		board.setTitle("수정이될까요");
		board.setContent("업데이트테스트");
		board.setBno((long)1);
		
		// when
		int result = boardMapper.updateBoard(board);
		
		// then
		assertEquals(result, 1);
	}
		
	@Disabled
	@Test
		void deleteTest() {
			// given
			Long bno = 4l;
			
			// when
			int result = boardMapper.delete(bno);
			
			// then
			assertEquals(result, 1);
	}
	
	@Test
	void searchTest() {
		BoardVO board = BoardVO.builder()
				.title("test")
				.writer("user00")
				.build();
		
		List<BoardVO> list = boardMapper.getListByWriter(board);
	}
		
		
} // end of class