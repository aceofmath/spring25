package test.exam03;

public class JdbcService {
	private JdbcDao jdbcDao;
	
	public JdbcService(){}					//constructor
	
	//생성자를 통해 jdbcDao를 전달 받음
	public JdbcService(JdbcDao jdbcDao){
		this.jdbcDao = jdbcDao;
	}
	
	public void serviceTest(){
		jdbcDao.insert();
		jdbcDao.delete();
	}
}
