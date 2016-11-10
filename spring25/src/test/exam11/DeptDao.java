package test.exam11;

import java.util.List;

public interface DeptDao {
	void add(DeptVo dept);
	DeptVo getDept(int deptno);
	List<DeptVo> getDeptList();
	void remove(int deptno);
}
