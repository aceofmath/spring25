package test.exam04;

public class IbatisService {
	
	private IbatisDao ibatisDao;
	
	//setXXX( ) 형태의 메소드를 통해 객체를 주입받음
	public void setIbatisDao(IbatisDao ibatisDao){
		this.ibatisDao = ibatisDao;
	}
	
	public void daoTest(){
		System.out.println("START");
		ibatisDao.insertDB();
		ibatisDao.updateDB();
		System.out.println("END");
	}
}
