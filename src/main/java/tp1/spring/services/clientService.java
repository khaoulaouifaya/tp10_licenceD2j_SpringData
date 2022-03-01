package tp1.spring.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tp1.spring.dao.InterfaceClient;
import tp1.spring.models.Client;

@Service
@Transactional
public class clientService implements InterfaceService{
	public clientService() {
	}
	
	@Autowired
	InterfaceClient daoClient;

	public void addClient(Client c) {
		// TODO Auto-generated method stub
		
		daoClient.addClient(c);
		
	}

	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		daoClient.updateClient(c);
	}

	public void deleteClient(Client c) {
		// TODO Auto-generated method stub
		daoClient.deleteClient(c);
	}

	public Client findClient(int id) {
		// TODO Auto-generated method stub
	
		Client c=daoClient.findClient(id);
		return c;
	}

	public List<Client> getAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
}
