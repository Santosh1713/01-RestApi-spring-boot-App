package com.bikkadit.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	private int userid;
	private String userName;
	private String userAdrress;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAdrress() {
		return userAdrress;
	}
	public void setUserAdrress(String userAdrress) {
		this.userAdrress = userAdrress;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userAdrress=" + userAdrress + "]";
	}
	
	

}
