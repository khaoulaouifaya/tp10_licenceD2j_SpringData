package tp1.spring.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import tp1.spring.models.Client;


@Repository
public class clientDao implements InterfaceClient  {
	
	public clientDao() {
	}

	@PersistenceContext
	private EntityManager manager;

	public void addClient(Client c) {
		// TODO Auto-generated method stub
		manager.persist(c);
		
	}

	public Client findClient(int id) {
		Client c=manager.find(Client.class,id);
		return c;
	}

	public Client getAllClient() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteClient(Client c) {
		// TODO Auto-generated method stub
		manager.remove(c);
		
	}

	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		manager.merge(c);
		
	}

}
