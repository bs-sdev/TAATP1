/**
 * 
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.sql.Date;

/**
 * @author benjamin
 *
 */
@Entity
@Table(name = "COMMENTAIRE")
public class Commentaire {

	private int id;
	private Covoitureur auteur;
	private Covoiturage covoiturage;
	private Date date;
	private String texte;
	


	/**
	 * 
	 */
	public Commentaire() {}

	/**
	 * @param id
	 * @param auteur
	 * @param covoiturage
	 * @param date
	 */
	public Commentaire(int id, Covoitureur auteur, Covoiturage covoiturage,
			Date date) {
		this.id = id;
		this.auteur = auteur;
		this.covoiturage = covoiturage;
		this.date = date;
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
	 * @return the auteur
	 */
	@OneToOne
	public Covoitureur getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(Covoitureur auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the covoiturage
	 */
	@OneToOne
	public Covoiturage getCovoiturage() {
		return covoiturage;
	}

	/**
	 * @param covoiturage the covoiturage to set
	 */
	public void setCovoiturage(Covoiturage covoiturage) {
		this.covoiturage = covoiturage;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	/**
	 * @return the texte
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * @param texte the texte to set
	 */
	public void setTexte(String texte) {
		this.texte = texte;
	}
	
}
