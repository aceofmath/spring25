package test.exam05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/test/exam05/exam05.xml");
		JdbcService service1 = (JdbcService)context.getBean("service");
		JdbcService service2 = (JdbcService)context.getBean("service");
		
		System.out.println("service1 : " + service1);
		System.out.println("service2 : " + service2);
		
		service1.serviceTest();
	}
}
