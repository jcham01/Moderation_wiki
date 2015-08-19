package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.service.global.ICRUD;

public interface IGSignalement extends ICRUD{
	public void changerEtat(EtatSignalement etat, Object id);
	public void rejeter(Object id);
	public void traiter(Object id);
}
