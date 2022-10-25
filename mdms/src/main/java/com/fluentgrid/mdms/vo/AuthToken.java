/**
 * 
 */
package com.fluentgrid.mdms.vo;

import java.util.Date;

/**
 * @author ravi.konada
 * @since 17-May-2021
 *
 */
public class AuthToken {
	
	private String token;
	private Date expiry;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

}
