package test.exam00;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam00/test.xml");
		TestDao testDao = (TestDao)context.getBean("testDaoImp");
		
		System.out.println("START.....");
		testDao.printMessage();
		System.out.println("END.....");
	}

}
