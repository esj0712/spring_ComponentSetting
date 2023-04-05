package kr.co.softsoldesk.beans;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
public class TestBean4 {
	
	
}
// IOC 컨테이너 객체를 생성할떄 자동으로 객체가 생성된다
// 기본형은 타입 주입
// Singleton으로 주입되며 config에 @Bean으로 등록한것과 같다

