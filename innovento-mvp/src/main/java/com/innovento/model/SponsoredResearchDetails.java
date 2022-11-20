package com.innovento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "sponsored_research_details")
public class SponsoredResearchDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false, precision = 10)
	private long id;
	@Column(name = "research_details_id", precision = 10)
	public long researchDetailsId;
	@Column(name = "2020_2021_count", precision = 10)
	public long _2020_2021_count;
	@Column(name = "2019_2020_count", precision = 10)
	public long _2019_2020_count;
	@Column(name = "2018_2019_count", precision = 10)
	public long _2018_2019_count;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getResearchDetailsId() {
		return researchDetailsId;
	}
	public void setResearchDetailsId(long researchDetailsId) {
		this.researchDetailsId = researchDetailsId;
	}
	public long get_2020_2021_count() {
		return _2020_2021_count;
	}
	public void set_2020_2021_count(long _2020_2021_count) {
		this._2020_2021_count = _2020_2021_count;
	}
	public long get_2019_2020_count() {
		return _2019_2020_count;
	}
	public void set_2019_2020_count(long _2019_2020_count) {
		this._2019_2020_count = _2019_2020_count;
	}
	public long get_2018_2019_count() {
		return _2018_2019_count;
	}
	public void set_2018_2019_count(long _2018_2019_count) {
		this._2018_2019_count = _2018_2019_count;
	}

}
