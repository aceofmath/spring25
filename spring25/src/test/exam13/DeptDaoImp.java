package test.exam13;

import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


/*
 * Spring + ibatis ����
 * SqlMapClientDaoSupport Ŭ������ ��ӹ޾Ƽ� Dao���� Ŭ������ �ۼ��Ѵ�.
 * 	1. support Ŭ������ SqlMapClientTemplate ��ü�� ������ �ش�.
 * 	   => �̷� ������  dao ���� Ŭ�������� ���� CRUD �ڵ常 ���´�. (������, setter �޼ҵ尡 �ʿ������)
 * 	2. �������� : SqlMapClientDaoSupport�� ��ӹް�
 * 	            Dao ���� Ŭ������ SqlMapClient ��ü�� ��������� �Ѵ�. (������ �������Ͽ���)
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
		//select�� ����� 1��
		return (DeptVO)getSqlMapClientTemplate().queryForObject("info", JOB_ID);
	}

	@Override
	public List<DeptVO> list() {
		// TODO Auto-generated method stub
		//select�� ����� �ټ�
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
