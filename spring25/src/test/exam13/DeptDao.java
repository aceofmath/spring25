package test.exam13;

import java.util.List;

public interface DeptDao {

	Object add(DeptVO vo);
	int remove(String JOB_ID);
	int update(DeptVO vo);
	DeptVO info(String JOB_ID);
	List<DeptVO> list();
	
}
