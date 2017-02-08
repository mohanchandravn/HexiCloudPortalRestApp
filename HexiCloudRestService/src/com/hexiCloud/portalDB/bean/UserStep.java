package com.hexiCloud.portalDB.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserStep implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8187903799798651849L;

	private String userId;
	private String userRole;
	private int curStepId;
	private String curStepCode;
	private int preStepId;
	private String preStepCode;
	private Timestamp createdDate;
	private Timestamp updatedDate;

	public UserStep() {

	}

	public UserStep(String userId, String userRole, int curStepId, String curStepCode, int preStepId,
			String preStepCode, Timestamp createdDate, Timestamp updatedDate) {
		super();
		this.userId = userId;
		this.userRole = userRole;
		this.curStepId = curStepId;
		this.curStepCode = curStepCode;
		this.preStepId = preStepId;
		this.preStepCode = preStepCode;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getCurStepId() {
		return curStepId;
	}

	public void setCurStepId(int curStepId) {
		this.curStepId = curStepId;
	}

	public String getCurStepCode() {
		return curStepCode;
	}

	public void setCurStepCode(String curStepCode) {
		this.curStepCode = curStepCode;
	}

	public int getPreStepId() {
		return preStepId;
	}

	public void setPreStepId(int preStepId) {
		this.preStepId = preStepId;
	}

	public String getPreStepCode() {
		return preStepCode;
	}

	public void setPreStepCode(String preStepCode) {
		this.preStepCode = preStepCode;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}
