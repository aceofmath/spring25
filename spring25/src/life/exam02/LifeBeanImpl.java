package life.exam02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeBeanImpl implements LifeBean, BeanNameAware, ApplicationContextAware{
	private String beanName;
	private ApplicationContext context;

	@Override
	//빈 객체가 자기 자신의 이름을 알아야 할 경우에 사용
	//객체가 생성될 때 해당 객체의 id값을 전달(주입)받는 메서드
	public void setBeanName(String beanName) {
		System.out.println("setBeanName(...) 실행...");
		this.beanName = beanName;
	}

	@Override
	//객체가 생성될 때 스프링의 ApplicationContext를 전달받는 메소드
	//ApplicationContext를 빈에 전달할 때 사용
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("setApplicationContext(...) 실행...");
		this.context = context;
	}
	
	@Override
	public void lifeMessage() {
		System.out.println("life 비지니스 로직 수행 중...");
		OtherBean other = (OtherBean)context.getBean("otherBean");
		other.otherMessage();
	}
}
