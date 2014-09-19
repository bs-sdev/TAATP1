/**
 * 
 */
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author benjamin
 *
 */
@Entity
@Table(name = "EVENEMENT")

public class Evenement {
	
	/**
	 * Id 
	 */
	private int id;
	
	
	/**
	 * Attribut permettant de stocker la date de l'évènement 
	 * ainsi que l'heure
	 */
	private Date dateEvtEtHeure;
	
	/**
	 * Attribut permettant de stocker dans une chaine de caractère
	 * le nom du lieu ou se déroulera l'évènement
	 */
	private String lieuEvt;
	
	/**
	 * Constructeur d'évènement qui prendra en paramètre une date (heure et date)
	 * ainsi que le lieu ou se déroulera l'évènement 
	 * 
	 * @param dateEvtEtHeure
	 * @param lieuEvt
	 */
	public Evenement(Date dateEvtEtHeure, String lieuEvt) {
		super();
		this.dateEvtEtHeure = dateEvtEtHeure;
		this.lieuEvt = lieuEvt;
	}

	/**
	 * 
	 * @return
	 */
	public Date getDateEvtEtHeure() {
		return dateEvtEtHeure;
	}
	
	/**
	 * 
	 * @param dateEvtEtHeure
	 */
	public void setDateEvtEtHeure(Date dateEvtEtHeure) {
		this.dateEvtEtHeure = dateEvtEtHeure;
	}

	/**
	 * 
	 * @return
	 */
	public String getLieuEvt() {
		return lieuEvt;
	}
	
	/**
	 * 
	 * @param lieuEvt
	 */
	public void setLieuEvt(String lieuEvt) {
		this.lieuEvt = lieuEvt;
	}

	/**
	 * @return the id
	 */
	@Id
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	
}
