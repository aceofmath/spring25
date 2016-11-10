package test.exam12;

public class Dept {
	//JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY
	private String JOB_ID;
	private String JOB_TITLE;
	private int MIN_SALARY;
	private int MAX_SALARY;
	
	public String getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public String getJOB_TITLE() {
		return JOB_TITLE;
	}

	public void setJOB_TITLE(String jOB_TITLE) {
		JOB_TITLE = jOB_TITLE;
	}

	public int getMIN_SALARY() {
		return MIN_SALARY;
	}

	public void setMIN_SALARY(int mIN_SALARY) {
		MIN_SALARY = mIN_SALARY;
	}

	public int getMAX_SALARY() {
		return MAX_SALARY;
	}

	public void setMAX_SALARY(int mAX_SALARY) {
		MAX_SALARY = mAX_SALARY;
	}

	
	@Override
	public String toString() {
		return "JOBS [JOB_ID=" + JOB_ID + ", JOB_TITLE=" + JOB_TITLE + ", MIN_SALARY=" + MIN_SALARY + ", MAX_SALARY=" + MAX_SALARY
				+ ", toString()=" + super.toString() + "]";
	}
}
