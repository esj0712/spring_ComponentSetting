package kr.co.softsoldesk.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // getBean으로 호출할때 객체가 생김 
public class TestBean3 {
	
	
}
// IOC 컨테이너 객체를 생성할떄 자동으로 객체가 생성된다
// 기본형은 타입 주입
// Singleton으로 주입되며 config에 @Bean으로 등록한것과 같다

