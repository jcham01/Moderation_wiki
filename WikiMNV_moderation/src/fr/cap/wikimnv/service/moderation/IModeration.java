package fr.cap.wikimnv.service.moderation;

import fr.cap.wikimnv.service.global.IGUser;

public interface IModeration {

	IGUser getGUser();
	IGCommentaire getGCommentaire();
	IGSignalement getGSignalement();
}
