package org.wecancodeit.reviewssite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReviewTest {
	Review review = new Review(1234L, "Test Review", "URL", "Movie", "This movie sucked ass.");

	@Test
	public void shouldGetTitle() {
		String check = review.getTitle();
		assertEquals("Test Review", check);
	}

	@Test
	public void shouldGetImageUrl() {
		String check = review.getImageUrl();
		assertEquals("URL", check);
	}

	@Test
	public void shouldGetReviewCategory() {
		String check = review.getReviewCategory();
		assertEquals("Movie", check);
	}

	@Test
	public void shouldGetContent() {
		String check = review.getContent();
		assertEquals("This movie sucked ass.", check);
	}
}
