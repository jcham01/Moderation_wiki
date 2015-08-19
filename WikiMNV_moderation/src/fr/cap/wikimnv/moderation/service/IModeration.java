package fr.cap.wikimnv.moderation.service;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.service.global.IGUser;

public interface IModeration {
	IGUser getGUser() throws MNVException;
	IGCommentaire getGCommentaire() throws MNVException;
	IGSignalement getGSignalement() throws MNVException;
}
