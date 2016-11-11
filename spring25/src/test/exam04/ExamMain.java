package test.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new FileSystemXmlApplicationContext("/src/test/exam04/exam04_01.xml");
		IbatisService service = (IbatisService)context.getBean("service");
		
		service.daoTest();
	}
}
