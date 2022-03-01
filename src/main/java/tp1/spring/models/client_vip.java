package tp1.spring.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class client_vip extends Client{
	
	private String typeClient;
	
	
	public client_vip(String type) {
		this.typeClient=type;
	}
	
	public client_vip() {
	}
	
}
