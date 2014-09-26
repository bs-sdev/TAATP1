/**
 * 
 */
package domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author benjamin
 *
 */

@Entity
@Table(name = "COVOITUREUR")
public class Covoitureur {

	/**
	 * 
	 */
	private int id;
	
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
	
	private List<Covoiturage> covoiturages;
	
	
	private List<Commentaire> commentaires;

	private String mail;
	
	/**
	 * 
	 */
	public Covoitureur() {}

	/**
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param vehicule
	 */
	public Covoitureur(String nom, String prenom, Date dateNaissance) 
	{
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
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
	 * @return the covoiturages
	 */
	@OneToMany
	public List<Covoiturage> getCovoiturages() {
		return covoiturages;
	}

	/**
	 * @param covoiturages the covoiturages to set
	 */
	public void setCovoiturages(List<Covoiturage> covoiturages) {
		//this.covoiturages = covoiturages;
	}

	/**
	 * @return the commentaires
	 */
	@OneToMany
	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	/**
	 * @param commentaires the commentaires to set
	 */
	public void setCommentaires(List<Commentaire> commentaires) {
		//this.commentaires = commentaires;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
