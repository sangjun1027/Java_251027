package com.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.container.Speaker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
// @AllArgsConstructor	//모든 args초기화
@RequiredArgsConstructor
@Component
public class SamsungTV implements TV {
	
	// 1) feild 주입방법
	// @Autowired	//주입해달라는 것!
	// final Speaker speaker;
	// int model;
	
	
	// 2) setter 주입
	// @Setter(onMethod = {@Autowired})
	// Speakere speaker;	//의존관계 객체
	// int model;
	
	
	// 3) feild주입 => 이게 짱이다!
	@Autowired
	Speaker speaker;	//의존관계 객체
	int model;
	
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}
	
	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}
	
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
/*	
	// lombok을 사용하기때문에 아래방법은 사용안함
	// speaker interface와 의존관계
	// Speaker speaker;	//의존관계 객체
	// 생성자, setter 방식 2가지가 있다.
	
	// 2) 생성자 방식
	// speaker 넣어주는 생성자
	// 바로 아래는 기본생성자(무조건 넣어주는게 좋음)
	public SamsungTV () {
		System.out.println("===> SamsungTv");
	}
	public SamsungTV(Speaker speaker) {
		super();
		System.out.println("생성자방식으로 주입");
		this.speaker = speaker;
	}
	
	// 3) Setter 방식
	public void setSpeaker(Speaker speaker) {
		System.out.println("setter방식 주입");
		this.speaker = speaker;
	}

*/
}
