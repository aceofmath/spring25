package test.exam11;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


//JdbcDaoSupport는 dataSource를 필요로 함-API참조
public class DeptDaoimp2 extends JdbcDaoSupport implements DeptDao {

	@Override
	public void add(DeptVo dept) {
		// TODO Auto-generated method stub
	}

	@Override
	public DeptVo getDept(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeptVo> getDeptList() {
		// TODO Auto-generated method stub
//		String sql = "select deptno, dname, loc from dept";
		String sql = "select JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY from JOBS";
		
		return getJdbcTemplate().query(sql, new RowMapper(){
			@Override
			public Object mapRow(ResultSet rs, int index) throws SQLException {
				// TODO Auto-generated method stub
				DeptVo dept = new DeptVo();
				dept.setDeptno(rs.getInt("MAX_SALARY"));
				dept.setDname(rs.getString("JOB_TITLE"));
				dept.setLoc(rs.getString("MIN_SALARY"));
				
				return dept;
			}
		});
	}

	@Override
	public void remove(int deptno) {
		// TODO Auto-generated method stub
	}
}
