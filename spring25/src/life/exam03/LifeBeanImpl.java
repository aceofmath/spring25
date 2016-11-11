package life.exam03;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeBeanImpl implements LifeBean, InitializingBean, DisposableBean{

	@Override
	public void getMessage() {
		// TODO Auto-generated method stub
		System.out.println("getMessage() 출력...");
	}

	@Override
	//InitializingBean 인터페이스 메소드 <= 스프링에서 제공하는 초기화 메소드
	//스프링컨테이너에 의해서 빈 객체가 생성되고, 빈 객체에 프로퍼티에 의존하는 객체, 혹은 값의 주입이 완료된 후 수행된다.
	//따라서, 프로퍼티에 값들이 제대로 주입되었는지 확인할 목적으로 사용할 수 있다.
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet() 실행...");
	}

	@Override
	//DisposableBean 인터페이스 메소드 <= 스프링에서 제공하는 소멸 메소드
	//빈 객체가 소멸되기 전에 자원 해제와 관련된 코드를 기술할 목적으로 사용할 수 있다.
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy() 실행...");
	}
}
