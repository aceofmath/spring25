package test.exam13;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


/*
 * Spring + ibatis 연동
 * SqlMapClientDaoSupport 클래스를 상속받아서 Dao구현 클래스를 작성한다.
 * 	1. support 클래스가 SqlMapClientTemplate 객체를 제공해 준다.
 * 	   => 이런 이유로  dao 구현 클래스에는 순수 CRUD 코드만 남는다. (변수나, setter 메소드가 필요없어짐)
 * 	2. 전제조건 : SqlMapClientDaoSupport를 상속받고
 * 	            Dao 구현 클래스에 SqlMapClient 객체를 주입해줘야 한다. (주입은 설정파일에서)
 */
public class DeptDaoImp extends SqlMapClientDaoSupport implements DeptDao {
	
	@Override
	public Object add(DeptVO vo) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().insert("add", vo);
	}

	@Override
	public DeptVO info(String JOB_ID) {
		// TODO Auto-generated method stub
		//select의 결과가 1개
		return (DeptVO)getSqlMapClientTemplate().queryForObject("info", JOB_ID);
	}

	@Override
	public List<DeptVO> list() {
		// TODO Auto-generated method stub
		//select의 결과가 다수
		return getSqlMapClientTemplate().queryForList("list");
	}

	@Override
	public int remove(String JOB_ID) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().delete("remove", JOB_ID);
	}

	@Override
	public int update(DeptVO vo) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().update("update", vo);
	}

}
