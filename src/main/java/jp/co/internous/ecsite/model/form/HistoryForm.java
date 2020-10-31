package jp.co.internous.ecsite.model.form;

import java.io.Serializable;


public class HistoryForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
	
	
	//setter & getter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}	
}