package com.example.weather.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="general")
public class ConfiguratorProperties {

	private String appid;
	private String path;
	private String standardFormatDate;
	private String ampmFormatDate;
	private String twoDecimalFormat;
	private String error404;
	private String error500;

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the appid
	 */
	public String getAppid() {
		return appid;
	}
	/**
	 * @param appid the appid to set
	 */
	public void setAppid(String appid) {
		this.appid = appid;
	}
	/**
	 * @return the standardFormatDate
	 */
	public String getStandardFormatDate() {
		return standardFormatDate;
	}
	/**
	 * @param standardFormatDate the standardFormatDate to set
	 */
	public void setStandardFormatDate(String standardFormatDate) {
		this.standardFormatDate = standardFormatDate;
	}
	/**
	 * @return the ampmFormatDate
	 */
	public String getAmpmFormatDate() {
		return ampmFormatDate;
	}
	/**
	 * @param ampmFormatDate the ampmFormatDate to set
	 */
	public void setAmpmFormatDate(String ampmFormatDate) {
		this.ampmFormatDate = ampmFormatDate;
	}
	/**
	 * @return the twoDecimalFormat
	 */
	public String getTwoDecimalFormat() {
		return twoDecimalFormat;
	}
	/**
	 * @param twoDecimalFormat the twoDecimalFormat to set
	 */
	public void setTwoDecimalFormat(String twoDecimalFormat) {
		this.twoDecimalFormat = twoDecimalFormat;
	}
	/**
	 * @return the error404
	 */
	public String getError404() {
		return error404;
	}
	/**
	 * @param error404 the error404 to set
	 */
	public void setError404(String error404) {
		this.error404 = error404;
	}
	/**
	 * @return the error500
	 */
	public String getError500() {
		return error500;
	}
	/**
	 * @param error500 the error500 to set
	 */
	public void setError500(String error500) {
		this.error500 = error500;
	}
	
}
