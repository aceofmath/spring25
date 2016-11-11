package test.exam06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/test/exam06/exam06.xml");
		BeanTest beanTest1 = (BeanTest)context.getBean("beanTest");
		BeanTest beanTest2 = (BeanTest)context.getBean("beanTest");
		
		System.out.println("beanTest1 : " + beanTest1);
		System.out.println("beanTest2 : " + beanTest2);
		
	}
}
