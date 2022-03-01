package tp1.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tp1.spring.models.Client;                                                                 
import tp1.spring.services.InterfaceService;

@Controller("ctrl1")
public class clientController {

			 
		@Autowired
		private InterfaceService service;

		public clientController() {
			
		}
		
		public void addClient(Client c) {
			
			service.addClient(c);
			
		}
	
	
}
