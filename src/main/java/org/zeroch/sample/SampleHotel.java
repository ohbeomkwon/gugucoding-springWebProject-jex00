package org.zeroch.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor // 모든 args에 대해 생성자를 만든다.
// @RequiredArgsConstructor 는 @NotNull이나 final이 붙은 인서튼스 변수에 대한 생성자를 만들어낸다. 
public class SampleHotel {

	// 생성자를 이용하여 주입
	private Chef chef;
	
//	public SampleHotel(Chef chef) { 
//	this.chef = chef;
//	}
}
