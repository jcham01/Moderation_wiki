package fr.cap.wikimnv.moderation.pojo;

import java.util.Date;
import java.util.Random;

import fr.cap.wikimnv.domain.pojo.Contenu;
import fr.cap.wikimnv.domain.pojo.User;

public class Signalement {
	String reference;
	Date date;
	Contenu contenu;
	EtatSignalement etat;
	User user;
	public Signalement() {
		try {
			this.reference=Random.class.newInstance().nextLong()+"";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Contenu getContenu() {
		return contenu;
	}
	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}
	public EtatSignalement getEtat() {
		return etat;
	}
	public void setEtat(EtatSignalement etat) {
		this.etat = etat;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getReference() {
		return reference;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
