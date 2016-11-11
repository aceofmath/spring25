package life.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/life/exam02/life02.xml");
		LifeBean lifeBean = (LifeBean)context.getBean("lifeBean");
		
		lifeBean.lifeMessage();
	}
}
