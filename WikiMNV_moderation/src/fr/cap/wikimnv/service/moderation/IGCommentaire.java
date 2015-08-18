package fr.cap.wikimnv.service.moderation;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.Commentaire;

public interface IGCommentaire {
	public void changerEtat(Object id, EtatComment etat);
	public Set<Commentaire> lister();
	public Commentaire lire(Object id);
}
