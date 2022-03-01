package tp1.spring.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ligneClient {
	
	@EmbeddedId
	primaryKey pk;
	

}
