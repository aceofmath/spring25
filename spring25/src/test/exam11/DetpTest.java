package test.exam11;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DetpTest {

	public static void main(String[] args){
		ApplicationContext context = new FileSystemXmlApplicationContext("src/test/exam11/test.xml");
		
		DeptDao dao = (DeptDao)context.getBean("deptDao2");
		
		//dao.add(new DeptVo(1, "LMS", "서울 강남구"));
		
		DeptVo vo = dao.getDept(20);
		
		List<DeptVo> deptList = dao.getDeptList();
		System.out.println("deptList : " + deptList);
	}
}
