package test.exam13;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DeptApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam13/test.xml");
		
		DeptDao dao = (test.exam13.DeptDao)context.getBean("deptDao");
		
		DeptVO vo = dao.info("AD_VP");
		System.out.println("1 : " + vo.toString());
		
		DeptVO inVo = new DeptVO();
		inVo.setJOB_ID("TEACHER");
		inVo.setJOB_TITLE("TEACHER1");
		inVo.setMIN_SALARY(100);
		inVo.setMAX_SALARY(10000);
		
		Object obj = dao.add(inVo);
		System.out.println("2 : " + obj);
		
		List<DeptVO> list = dao.list();
		System.out.println("3 : " + list.toString());

		int removeSuccess = dao.remove("TEACHER");
		System.out.println("4 : "+ ((removeSuccess == 1) ? "삭제성공":"삭제실패"));
		
	}
}
