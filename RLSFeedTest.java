package com.yahoo.adquality.sve.hio.model;

public class RLSFeedTest {

	private Long vurlId;
	private Long sectionId;
	private String domain;
	private String pageUrl;
	private String crawledLog;
	private Integer adSize;
	private SectionBanCategory banReason;
	private String falsifiedDomain;
	

	public Long getVurlId() {
		return vurlId;
	}

	public void setVurlId(Long vurlId) {
		this.vurlId = vurlId;
	}

	public Long getSectionId() {
		return sectionId;
	}

	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getCrawledLog() {
		return crawledLog;
	}

	public void setCrawledLog(String crawledLog) {
		this.crawledLog = crawledLog;
	}

	public Integer getAdSize() {
		return adSize;
	}

	public void setAdSize(Integer adSize) {
		this.adSize = adSize;
	}

	public SectionBanCategory getBanReason() {
		return banReason;
	}

	public void setBanReason(SectionBanCategory banReason) {
		this.banReason = banReason;
	}

	public String getFalsifiedDomain() {
		return falsifiedDomain;
	}

	public void setFalsifiedDomain(String falsifiedDomain) {
		this.falsifiedDomain = falsifiedDomain;
	}

}
