package com.main;

import java.math.BigDecimal;
import java.util.Date;

public class Report {

	private int id;
	private String impressions;
	private int clicks;
	private String date;
	private Double earning;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImpressions() {
		return impressions;
	}
	public void setImpressions(String impressions) {
		this.impressions = impressions;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getEarning() {
		return earning;
	}
	public void setEarning(Double earning) {
		this.earning = earning;
	}
	
	
	

}