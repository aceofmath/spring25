package aop.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/aop/exam02/aop01.xml");
		
		Service service = (Service)context.getBean("service");
		
		service.getBoard();
		
	}

}
