package fr.cap.wikimnv.moderation.service;

import java.util.Set;

import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import CrudImpl;

public class GSignalementImpl extends CrudImpl implements IGSignalement {


	@Override
	public void changerEtat(EtatSignalement etat, Object id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rejeter(Object id) {
		changerEtat(EtatSignalement.REJETE, id);
	}
	
	public void traiter(Object id) {
		changerEtat(EtatSignalement.TRAITE, id);
	}
}
