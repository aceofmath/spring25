package test.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ExamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam01/exam01.xml");
		ExamTest examTest = (ExamTest)context.getBean("exam");
		
		examTest.getMessage();
	}

}
