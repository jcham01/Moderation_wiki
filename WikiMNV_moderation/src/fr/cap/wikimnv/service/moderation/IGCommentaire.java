package fr.cap.wikimnv.service.moderation;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.Commentaire;
import fr.cap.wikimnv.domaine.pojo.EtatComment;

public interface IGCommentaire {
	public abstract void changerEtat(int id, EtatComment etat);
	public abstract Set<Commentaire> lister();
	public abstract Commentaire lire(int id);
}
