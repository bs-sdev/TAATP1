/**
 * 
 */
package domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author benjamin
 *
 */
@Entity
@Table(name = "CONDUCTEUR")
public class Conducteur extends Covoitureur {

	private Vehicule vehicule;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Conducteur() {}

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Conducteur(String nom, String prenom, Date dateNaissance, Vehicule vehicule) {
		super(nom, prenom, dateNaissance);
		this.vehicule = vehicule;
	}
	
	/**
	 * @return the vehicule
	 * 
	 * Voir avec Max pour ce qui est des véhicules, est-ce qu'un conducteur à plusieurs véhicule ou pas ...
	 */
	@OneToMany
	public Vehicule getVehicule() {
		return vehicule;
	}

	/**
	 * @param vehicule the vehicule to set
	 */
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	
	
}
