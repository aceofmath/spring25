package test.exam12;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class DeptApp {

	public static void main(String[] args) throws Exception {
		
		Reader reader = Resources.getResourceAsReader("test/exam12/SqlMapConfig.xml");
		SqlMapClient client = SqlMapClientBuilder.buildSqlMapClient(reader);
		
		//INSERT
		/*Dept dept1 = new Dept();
		dept1.setJobId("test");
		dept1.setJobTitle("HRD");
		dept1.setMinSalary(100);
		dept1.setMaxSalary(10000);
		
		client.insert("DEPT.add", dept1);		//mapper�� ����� id, parameter ��ü
*/		
		
		//SELECT - namespace�� ����ϵ��� �������� ��� => namespacename.id
		//SELECT�� ����� 1���� ���� queryForObject�� ���
		Dept dept2 = (Dept)client.queryForObject("DEPT.info", "AD_VP");
		System.out.println("dept2 : " + dept2 + "\n");
		
		
		//SELECT�� ����� �������� ��� queryForList�� ���
		List<Dept> deptList = client.queryForList("DEPT.infoAll");
		for(int i=0; i<deptList.size(); i++){
			System.out.println("deptList : " + deptList.get(i));
		}
	}
}
