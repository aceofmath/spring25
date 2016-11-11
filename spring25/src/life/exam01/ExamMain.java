package life.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/life/exam01/life.xml");
		LifeBean bean = (LifeBean)context.getBean("lifeBean");
		
		bean.lifeMethod();
	}
}
