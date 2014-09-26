/**
 * 
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

/**
 * @author benjamin
 *
 */
@Entity
@Table(name = "VEHICULE")
public class Vehicule {
	
	/**
	 * 
	 */
	private int id;
	
	/**
	 * 
	 */
	private String modele;
	
	/**
	 * 
	 */
	private String marque;
	
	/**
	 * 
	 */
	private short nbPlace;
	
	private Conducteur proprietaire;
	
	/**
	 * 
	 */
	public Vehicule() {}

	/**
	 * 
	 * @param modele
	 * @param marque
	 * @param nbPlace
	 */
	public Vehicule(String modele, String marque, short nbPlace, Conducteur proprietaire) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.nbPlace = nbPlace;
		this.proprietaire = proprietaire;
	}

	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the nbPlace
	 */
	public short getNbPlace() {
		return nbPlace;
	}

	/**
	 * @param nbPlace the nbPlace to set
	 */
	public void setNbPlace(short nbPlace) {
		this.nbPlace = nbPlace;
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

	/**
	 * @return the proprietaire
	 */
	@OneToOne
	public Conducteur getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Conducteur proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
