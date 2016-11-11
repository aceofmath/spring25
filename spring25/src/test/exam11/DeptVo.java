package test.exam11;

import java.io.Serializable;

public class DeptVo implements Serializable{
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptVo(){}
	public DeptVo(int deptno, String deptname, String loc){
		super();
		this.deptno = deptno;
		this.dname = deptname;
		this.loc = loc;
		
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String deptname) {
		this.dname = deptname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
