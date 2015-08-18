package fr.cap.wikimnv.service.moderation;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.EtatSignalement;
import fr.cap.wikimnv.domaine.pojo.Signalement;

public interface IGSignalement {
	
	public void changerEtat(EtatSignalement etat, Object id);
	public Set<Signalement> lister();
	public Signalement lire(Object id);
	public void rejeter(Object id);
	public void traiter(Object id);
}
