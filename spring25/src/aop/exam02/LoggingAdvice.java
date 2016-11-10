package aop.exam02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {

	//��� �����Ͻ����� �޼ҵ尡 ������ ���� ��ɱ���
	//Spring���κ��� method, target, �Ű��������� ������ ���� joinPoint��ü�� ���޹޴´�.
	//��, �Ű������� ���� �� ���⸸ �ϸ� ������ ��븸 �ϸ� ��
	public void logging(JoinPoint joinPoint){
		Signature method = joinPoint.getSignature();
		
		String methodName = method.getName();
		System.out.println("methodName : " + methodName);
	}
}
