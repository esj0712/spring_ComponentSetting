package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	
}
// IOC 컨테이너 객체를 생성할떄 자동으로 객체가 생성된다
// 기본형은 타입 주입 [name으로 변경가능]
// Singleton으로 주입되며 config에 @Bean으로 등록한것과 같다