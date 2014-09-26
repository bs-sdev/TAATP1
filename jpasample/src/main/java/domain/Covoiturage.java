/**
 * 
 */
package domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author benjamin
 *
 */
@Entity
@Table(name = "COVOITURAGE")
public class Covoiturage {
	
	/**
	 * 
	 */
	private int id;
	
	 /**
	  * Objet Personne permettant de stocker le conducteur du covoiturage
	  */
	private Conducteur conducteur;
	
	/**
	 * Liste de Personnes étant passagères du covoiturage
	 */
	private List<Covoitureur> covoitureurs;
	
	private List<Commentaire> commentaires;
	
	/**
	 * Variable permettant de stocker le lieu de départ selon le format 
	 * Adresse /  Ville / Code Postal (serializer/deserializer)
	 */
	private String lieuDepart;
	
	/**
	 * Objet date permettant de stocker la date de départ 
	 */
	private Date dateDepart;
	
	private Evenement evenement;
		
	/**
	 * 
	 */
	public Covoiturage() {}


	/**
	 * @param conducteur
	 * @param covoitureurs
	 * @param lieuDepart
	 * @param dateDepart
	 */
	public Covoiturage(Conducteur conducteur, List<Covoitureur> covoitureurs,
			String lieuDepart, Date dateDepart) {
		super();
		this.conducteur = conducteur;
		this.covoitureurs = covoitureurs;
		this.lieuDepart = lieuDepart;
		this.dateDepart = dateDepart;
	}


	/**
	 * @return the conducteur
	 */
	@OneToOne
	public Covoitureur getConducteur() {
		return conducteur;
	}


	/**
	 * @param conducteur the conducteur to set
	 */
	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}

	public void reserver(Covoitureur covoitureur) throws Exception {
		if (getPlacesRestantes() == 0) throw new Exception("Plus de place disponible.");
		if (covoitureur.equals(conducteur)) throw new Exception("Le conducteur fait parti du covoiturage.");
		covoitureurs.add(covoitureur);
	}

	/**
	 * @return the passagers
	 */
	@OneToMany
	public List<Covoitureur> getCovoitureurs() {
		return covoitureurs;
	}


	/**
	 * @param covoitureurs the passagers to set
	 */
	public void setPassagers(List<Covoitureur> covoitureurs) {
		this.covoitureurs = covoitureurs;
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

	/**
	 * @return the placesRestantes
	 */
	@Transient
	public short getPlacesRestantes() {
		return (short) (conducteur.getVehicule().getNbPlace() - covoitureurs.size());
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
	 * @return the evenement
	 */
	@OneToOne
	public Evenement getEvenement() {
		return evenement;
	}

	/**
	 * @param evenement the evenement to set
	 */
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}	
	
}
