package fi.haagahelia.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "vastaus")
public class Vastaus {
	
	@JsonProperty("vastaus_arvo")
	@Column(name="vastaus_nimi")
	private String nimi;
	
	@JsonProperty("kysymys_id")
	private int kysymysId;
 
	public Vastaus() {
		super();
	}

	public Vastaus(String nimi) {
			this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public int getKysymysId() {
		return kysymysId;
	}

	public void setKysymysId(int id) {
		this.kysymysId = id; 
	}

	public String toString() {
		return "vastaus: " +this.getNimi();
	}

}
