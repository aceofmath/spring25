package test.exam01;

public class ExamTest {
	private static ExamTest instance;
	
	//싱글턴패턴
	public static ExamTest getInstance(){		
		if(instance == null){
			instance = new ExamTest();
		}
		return instance;
	}
	
	//기본생성자의 접근을 막아버림
	private ExamTest(){}

	public void getMessage(){
		System.out.println("ExamTest.getMessage().....");
	}
}
