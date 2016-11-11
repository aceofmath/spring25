package test.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/test/exam03/exam03.xml");
		JdbcService service = (JdbcService)context.getBean("service");
		
		service.serviceTest();
	}

}
