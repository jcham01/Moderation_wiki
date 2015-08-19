package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.domain.dao.IDAOGenric;
import fr.cap.wikimnv.global.service.CrudImpl;
import fr.cap.wikimnv.moderation.pojo.EtatSignalement;
import fr.cap.wikimnv.moderation.pojo.Signalement;

public class GSignalementImpl extends CrudImpl implements IGSignalement {

	IDAOGenric dao;
	
	public GSignalementImpl(IDAOGenric dao) {
		this.dao = dao;
	}
	
	
	private void changerEtat(EtatSignalement etat, Object id) {
		Signalement sig = (Signalement)dao.get(id);
		sig.setEtat(etat);
		dao.saveOrUpdate(sig);		
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
