package tp1.spring.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tp1.spring.controllers.clientController;
import tp1.spring.models.Client;
import tp1.spring.models.client_vip;

public class runner {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context = new ClassPathXmlApplicationContext("spring.xml");
		clientController controller=(clientController) context.getBean("ctrl1");
		Client c=new Client("khaoula","abdolwafi",22);
		
		
		
		
	}

}
