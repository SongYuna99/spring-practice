package com.poscodx.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.poscodx.container.user.User;

public class XmlConfigTest {
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
//		testApplicationContext01();

		// XML Bean Configuration(Explicit Configuration)
		testApplicationContext02();

		// XML Auto Configuration(Annotation Scanning)
//		testBeanFactory01();

		// XML Bean Configuration(Explicit Configuration)
//		testBeanFactory02();
	}

	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/poscodx/container/user/applicationContext02.xml");

		User user = null;

		// ------- 기본 생성자로 Bean 생성된 가져오기 -------
		// id로 Bean 가져오기 -> 자동으로 만들어지지 않음(명시적)
		user = (User) ac.getBean("user");
		System.out.println(user.getName());

		// name으로 Bean 가져오기
		user = (User) ac.getBean("usr");
		System.out.println(user.getName());

		// type으로 Bean 가져오기
		// 같은 타입의 bean이 2개이상 있으면 type으로 가져오기는 실패
		user = ac.getBean("user", User.class);
		System.out.println(user.getName());

		// ------- Parameter가 1개인 생성자로 생성된 Bean 가져오기 -------
		user = (User) ac.getBean("user2");
		System.out.println(user.getName());

		user = ac.getBean("user2", User.class);
		System.out.println(user.getName());

		// ------- Parameter가 2개인 생성자로 생성된 Bean 가져오기 I -------
		user = (User) ac.getBean("user3");
		System.out.println(user);
		
		// ------- Parameter가 2개인 생성자로 생성된 Bean 가져오기 II -------
		user = (User) ac.getBean("user4");
		System.out.println(user);
		
		// ------- setter로 생성된 Bean 가져오기 I -------
		user = (User) ac.getBean("user5");
		System.out.println(user);
		
		// ------- setter로 생성된 Bean 가져오기 II : DI 사용 -------
		user = (User) ac.getBean("user6");
		System.out.println(user);
		
		// ------- setter로 생성된 Bean 가져오기 III : Collection Porperty -------
		user = (User) ac.getBean("user7");
		System.out.println(user);
	}

	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/poscodx/container/user/applicationContext01.xml");

		User user = null;

		user = ac.getBean(User.class);
		System.out.println(user.getName());

		// Annotation Scan(Auto Configuration)에서는 Bean id가 자동으로 부여된다.
		user = (User) ac.getBean("user");
		System.out.println(user.getName());
	}

	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscodx/container/user/applicationContext02.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}

	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscodx/container/user/applicationContext01.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}
}
