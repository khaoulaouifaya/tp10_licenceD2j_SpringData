package tp1.spring.services;

import tp1.spring.models.Client;

public interface InterfaceService {

	
	void addClient(Client c);
	void updateClient(Client c);
	void deleteClient(Client c);
	Client findClient(int id);
	java.util.List<Client> getAllClient();
	
	
}
