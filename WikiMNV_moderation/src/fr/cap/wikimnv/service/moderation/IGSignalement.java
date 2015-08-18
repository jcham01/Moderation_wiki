package fr.cap.wikimnv.service.moderation;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.EtatSignalement;
import fr.cap.wikimnv.domaine.pojo.Signalement;

public interface IGSignalement {
	
	public abstract void changerEtat(EtatSignalement etat, int id);
	public abstract Set<Signalement> lister();
	public abstract Signalement lire(int id);
	public abstract void rejeter(int id);
	public abstract void traiter(int id);
}
