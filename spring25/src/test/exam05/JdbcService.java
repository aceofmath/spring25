package test.exam05;

public class JdbcService {
	private JdbcDao jdbcDao;
	
	public void setJdbcDao(JdbcDao jdbcDao) {
		this.jdbcDao = jdbcDao;
	}
	
	public void serviceTest(){
		jdbcDao.messagePrt();
	}
}
