package com.nineleaps.foodtechapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	
	@Column(name = "rating")
	private Integer rating;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vendor_id")
	private User user;
	
	public Review() {
		
	}

	public Review(Integer rating, String comment, User user) {
		super();
		this.rating = rating;
		this.comment = comment;
		this.user = user;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setFeedbackId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", comment=" + comment + ", user="
				+ user + "]";
	}
	
	
}

