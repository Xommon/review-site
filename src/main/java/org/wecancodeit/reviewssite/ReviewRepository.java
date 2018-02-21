package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review kanto = new Review(1L, "Pokémon Red/Blue",
				"https://assets.pokemon.com/assets/cms2/img/video-games/video-games/pokemon_red_blue/red_blue_boxart.png",
				"Video Game", "Classic but limited in functionality.");
		Review johto = new Review(2L, "Pokémon Gold/Silver",
				"https://venturebeat.com/wp-content/uploads/2016/02/pokemongoldandoslver.jpg?fit=578%2C272&strip=all",
				"Video Game", "Packed with content for its time; great music.");
		Review hoenn = new Review(3L, "Pokémon Ruby/Sapphire",
				"http://static.tvtropes.org/pmwiki/pub/images/pokemonrs_437.jpg", "Video Game",
				"Functionality and multiplayer expansion; improved graphics.");
		Review sinnoh = new Review(4L, "Pokémon Diamond/Pearl",
				"https://i1.wp.com/www.geeksundergrace.com/wp-content/uploads/2015/02/DPP-Cover.png?fit=820%2C683",
				"Video Game", "Major graphics improvement; great music; great story.");

		reviews.put(kanto.getId(), kanto);
		reviews.put(johto.getId(), johto);
		reviews.put(hoenn.getId(), hoenn);
		reviews.put(sinnoh.getId(), sinnoh);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Review getReview(Long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> getAllReviews() {
		return reviews.values();
	}
}
