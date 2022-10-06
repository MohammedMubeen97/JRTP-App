package in.me.mbn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class Contact {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private	int cid;
	
	@Column(name = "contact_Name")
	private	String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "PhNo")
	private	long phno;
	
	@Column(name = "")
	private String activeSw;
}
