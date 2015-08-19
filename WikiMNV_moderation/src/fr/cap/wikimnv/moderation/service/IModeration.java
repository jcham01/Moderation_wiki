package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.IGUser;

public interface IModeration {
	//push for nothing
	IGUser getGUser() throws MNVException;
	IGCommentaire getGCommentaire() throws MNVException;
	IGSignalement getGSignalement() throws MNVException;
}
