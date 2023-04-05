package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.beans.TestBean4;
import kr.co.softsoldesk.beans.TestBean5;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("====================================JAVA=======================================");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		//type
		System.out.println("--------------------type--------------------");
		TestBean1 t1=ctx2.getBean(TestBean1.class);
		System.out.println("t1 : "+t1);
		
		//singleton
		TestBean1 t2=ctx2.getBean(TestBean1.class);
		System.out.println("t2 : "+t2);
		
		//이름
		System.out.println("--------------------name--------------------");
		TestBean2 t3=ctx2.getBean("t3",TestBean2.class);
		System.out.println("t3 : "+t3);
		
		//singleton
		TestBean2 t4=ctx2.getBean("t3",TestBean2.class);
		System.out.println("t4 : "+t4);
		
		//이름여러개
		System.out.println("--------------------names-------------------");
		TestBean2 t5=ctx2.getBean("t5",TestBean2.class);
		System.out.println("t5 : "+t5);
		
		//singleton
		TestBean2 t6=ctx2.getBean("t6",TestBean2.class);
		System.out.println("t6 : "+t6);
		
		//Lazy 사용하여 생성자 가져오기
		System.out.println("--------------------Lazy 사용하여 생성자 가져오기-------------------");
		TestBean3 t7 = ctx2.getBean(TestBean3.class);
		System.out.printf("t7 : %s\n", t7);
		// Singleton이므로 같은 주소 반환
		TestBean3 t8 = ctx2.getBean(TestBean3.class);
		System.out.printf("t8 : %s\n", t8);
		
		//
		System.out.println("--------------------Lazy 사용하여 생성자 가져오기-------------------");
		TestBean4 t9 = ctx2.getBean(TestBean4.class);		
		System.out.println(t9);
		// Singleton이므로 같은 주소 반환
		TestBean4 t10 = ctx2.getBean(TestBean4.class);
		System.out.printf("t10 : %s\n", t10);
		//@PostConstruct @PreDestroy
		TestBean5 t11 = ctx2.getBean(TestBean5.class);
		System.out.printf("t11 : %s\n", t11);
		ctx2.close();
	}

}
