package fi.haagahelia.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"kysymys_arvo", "kysymys_id", "tyyppi_id", "vastaukset"})
@Entity
@Table(name = "kysymys")
public class Kysymys {
	
	@JsonProperty("kysymys_arvo")
	@Column(name="kysymys_nimi")
	private String nimi;
	
	@Id
	@JsonProperty("kysymys_id")
	@Column(name="kysymys_id")
	private int id;
	
	private List<Vastaus> vastaukset = new ArrayList<Vastaus>();
	
	@JsonIgnore
	private Kysely kysely;
	
	@JsonProperty("tyyppi_id")
	@Column(name="tyyppi_id")
	private int tyyppiId;
	

	public Kysymys() {
	super();
	}
	
	public Kysymys(int id) {
		this.id = id;
	}
	
	public Kysymys(int id, String nimi) {
		this.id = id;
		this.nimi = nimi;
	}

	public List<Vastaus> getVastaukset() {
		return vastaukset;
	}


	public void setVastaukset(List<Vastaus> vastaukset) {
		this.vastaukset = vastaukset;
	}
	
	public void addToList(Vastaus v) {
		vastaukset.add(v);
	}


	public String getNimi() {
		return nimi;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public Kysely getKysely() {
		return kysely;
	}


	public void setKysely(Kysely kysely) {
		this.kysely = kysely;
	}
	
	public int getTyyppiId() {
		return tyyppiId;
	}

	public void setTyyppiId(int tyyppiId) {
		this.tyyppiId = tyyppiId;
	}

	public String toString() {
		return "kysymys: "+ this.getNimi();
	}
	
	
}
