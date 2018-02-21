package org.wecancodeit.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepository;

	@RequestMapping(value = "reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepository.getAllReviews());
		return "reviews";
	}

	@RequestMapping("review")
	public String getReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", reviewRepository.getReview(id));
		return "reviews";
	}

}
