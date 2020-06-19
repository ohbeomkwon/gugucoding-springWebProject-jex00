package org.zeroch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// web.xml을 대신하는 클래스 작성
// pom.xml의 경우는 maven을 이용하여 프로그램에 의존성을 추가하는데 사용된다.
// web.xml은 이와는 별개로 웹 프로그래밍을 할 경우에 이용되는 초기 설정들을 부여하는 곳이다.
// DispatcherServlet을 설정하는 추상클래스를 상속받은 후에 root-context.xml을 대신하는 메서드와
// servlet-context.xml을 대신하는 메서드를 오버로드해서 이용한다.
@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
