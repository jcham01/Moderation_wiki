package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.service.global.IGUser;

public interface IModeration {

	IGUser getGUser();
	IGCommentaire getGCommentaire();
	IGSignalement getGSignalement();
}
