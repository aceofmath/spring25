package test.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam02/exam02.xml");
		ExamDao exam = (ExamDao)context.getBean("examDao");
		
		exam.printMessage();
	}
}
