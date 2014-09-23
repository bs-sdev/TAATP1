/**
 * 
 */
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author benjamin
 *
 */

@Entity
@Table(name = "PERSONNE")
public class Personne {

	/**
	 * 
	 */
	private int Id;
	
	/**
	 * 
	 */
	private String nom;
	
	/**
	 * 
	 */
	private String prenom;
	
	/**
	 * 
	 */
	private Date dateNaissance;
	
	/**
	 * 
	 */
	private Vehicule vehicule;

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param vehicule
	 */
	public Personne(String nom, String prenom, Date dateNaissance,
			Vehicule vehicule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.vehicule = vehicule;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the vehicule
	 */
	@Transient
	public Vehicule getVehicule() {
		return vehicule;
	}

	/**
	 * @param vehicule the vehicule to set
	 */
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
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
