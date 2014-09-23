/**
 * 
 */
package domain;

import java.util.Date;
import java.util.List;

/**
 * @author benjamin
 *
 */
public class Covoiturage {
	 /**
	  * Objet Personne permettant de stocker le conducteur du covoiturage
	  */
	private Personne conducteur;
	
	/**
	 * Liste de Personnes étant passagères du covoiturage
	 */
	private List<Personne> passagers;
	
	/**
	 * Variable permettant de stocker le lieu de départ selon le format 
	 * Adresse /  Ville / Code Postal (serializer/deserializer)
	 */
	private String lieuDepart;
	
	/**
	 * Objet date permettant de stocker la date de départ 
	 */
	private Date dateDepart;

	
	/**
	 * @param conducteur
	 * @param passagers
	 * @param lieuDepart
	 * @param dateDepart
	 */
	public Covoiturage(Personne conducteur, List<Personne> passagers,
			String lieuDepart, Date dateDepart) {
		super();
		this.conducteur = conducteur;
		this.passagers = passagers;
		this.lieuDepart = lieuDepart;
		this.dateDepart = dateDepart;
	}


	/**
	 * @return the conducteur
	 */
	public Personne getConducteur() {
		return conducteur;
	}


	/**
	 * @param conducteur the conducteur to set
	 */
	public void setConducteur(Personne conducteur) {
		this.conducteur = conducteur;
	}


	/**
	 * @return the passagers
	 */
	public List<Personne> getPassagers() {
		return passagers;
	}


	/**
	 * @param passagers the passagers to set
	 */
	public void setPassagers(List<Personne> passagers) {
		this.passagers = passagers;
	}


	/**
	 * @return the lieuDepart
	 */
	public String getLieuDepart() {
		return lieuDepart;
	}


	/**
	 * @param lieuDepart the lieuDepart to set
	 */
	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}


	/**
	 * @return the dateDepart
	 */
	public Date getDateDepart() {
		return dateDepart;
	}


	/**
	 * @param dateDepart the dateDepart to set
	 */
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
}
