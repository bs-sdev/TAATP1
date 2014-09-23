/**
 * 
 */
package domain;

import javax.persistence.Entity;
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
	private int Id;
	
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
	private int nbPlace;

	/**
	 * 
	 * @param modele
	 * @param marque
	 * @param nbPlace
	 */
	public Vehicule(String modele, String marque, int nbPlace) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.nbPlace = nbPlace;
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
	public int getNbPlace() {
		return nbPlace;
	}

	/**
	 * @param nbPlace the nbPlace to set
	 */
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	/**
	 * @return the id
	 */
	@Id
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
}
