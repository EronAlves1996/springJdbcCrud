package io.eronalves1996.spring.springjdbccrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("io/eronalves1996/spring/springjdbccrud/config.xml");
		PassengerDAO dao = (PassengerDAO) ctx.getBean("dao");
		dao.create(new Passenger(1, "Eron", "Alves"));
		dao.create(new Passenger(2, "Raquel", "Cunha"));
		System.out.println(dao.readAll());
		System.out.println(dao.readOne(1));
		dao.update(new Passenger(1, "Leandro", "José"));
		System.out.println(dao.readAll());
		dao.delete(2);
		System.out.println(dao.readAll());
	}
}
