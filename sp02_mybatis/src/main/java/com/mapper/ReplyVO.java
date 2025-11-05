package com.mapper;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class ReplyVO {

	private Long rno;
	private Long bno;
	private String reply;
	private String replyer;
	private Date replydate;
	private Date updatedate;
	
}
