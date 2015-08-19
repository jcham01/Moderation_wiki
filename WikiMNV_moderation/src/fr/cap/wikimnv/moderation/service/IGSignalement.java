package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.global.service.ICRUD;

public interface IGSignalement extends ICRUD{
	public void rejeter(Object id);
	public void traiter(Object id);
}
