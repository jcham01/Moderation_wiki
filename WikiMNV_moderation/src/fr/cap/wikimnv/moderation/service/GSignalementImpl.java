package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.domain.dao.IDAOGenric;
import fr.cap.wikimnv.global.service.CrudImpl;
import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.moderation.pojo.Signalement;

public class GSignalementImpl extends CrudImpl implements IGSignalement {


	public GSignalementImpl() {

	}
	
	
	private void changerEtat(EtatSignalement etat, Object key) {
		Signalement sig = (Signalement) lire(key);
		sig.setEtat(etat);
		sauver(sig);		
	}

	@Override
	public void rejeter(Object id) {
		changerEtat(EtatSignalement.REJETE, id);
	}
	
	@Override
	public void traiter(Object id) {
		changerEtat(EtatSignalement.TRAITE, id);
	}
}
