package kr.co.softsoldesk.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	
	public TestBean5() {
		System.out.println("Testbean5의 생성자");
	}
	@PostConstruct
	private void init() {
		System.out.println("Testbean5의 init");
		
	}
	@PreDestroy
	private void destroy() {
		System.out.println("Testbean5의 destroy");
		
	}
}


