package fr.cap.wikimnv.test.moderation.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.moderation.service.IModeration;
import fr.cap.wikimnv.moderation.service.impl.ModerationImpl;

public class IModerationTest {
	IModeration moderation= new ModerationImpl();
	@Test
	public void testGetGUser() {
		try {
			moderation.getGUser();
		} catch (MNVException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetGCommentaire() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetGSignalement() {
		//fail("Not yet implemented");
	}

}
