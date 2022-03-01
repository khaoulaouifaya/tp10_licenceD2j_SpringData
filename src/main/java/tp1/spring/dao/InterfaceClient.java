package tp1.spring.dao;

import tp1.spring.models.Client;

public interface InterfaceClient {
	
	
	void addClient(Client c);
	Client findClient(int id);
	Client getAllClient();
	void deleteClient(Client c);
    void updateClient(Client c);
    
}
