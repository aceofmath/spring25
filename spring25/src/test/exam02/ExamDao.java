package test.exam02;

public class ExamDao {
	private String msg;
	
	public ExamDao(){};				//생성자
	
	public ExamDao(String msg){		//매개변수가 존재하는 생성자
		this.msg = msg;
	}
	
	public void printMessage(){
		System.out.println("ExamDao.msg : " + msg);
	}
}
