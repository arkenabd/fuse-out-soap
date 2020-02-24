package com.netty.fuse.util;

public class Email {
	public String strEmailAddrTo;
	public String strPasswordPDF;
	public String strCrdContent;
	public String strContent;
	public String strCustName;
	public String strGradeCdID;
	public String strGradeCdEN;

	public Email() {
	}

	public Email(String strEmailAddrTo, String strPasswordPDF, String strCrdContent, String strContent,
			String strCustName, String strGradeCdID, String strGradeCdEN) {
		this.strEmailAddrTo = strEmailAddrTo;
		this.strPasswordPDF = strPasswordPDF;
		this.strCrdContent = strCrdContent;
		this.strContent = strContent;
		this.strCustName = strCustName;
		this.strGradeCdID = strGradeCdID;
		this.strGradeCdEN = strGradeCdEN;
	}

	public String getStrEmailAddrTo() {
		return strEmailAddrTo;
	}

	public void setStrEmailAddrTo(String strEmailAddrTo) {
		this.strEmailAddrTo = strEmailAddrTo;
	}

	public String getStrPasswordPDF() {
		return strPasswordPDF;
	}

	public void setStrPasswordPDF(String strPasswordPDF) {
		this.strPasswordPDF = strPasswordPDF;
	}

	public String getStrCrdContent() {
		return strCrdContent;
	}

	public void setStrCrdContent(String strCrdContent) {
		this.strCrdContent = strCrdContent;
	}

	public String getStrContent() {
		return strContent;
	}

	public void setStrContent(String strContent) {
		this.strContent = strContent;
	}

	public String getStrCustName() {
		return strCustName;
	}

	public void setStrCustName(String strCustName) {
		this.strCustName = strCustName;
	}

	public String getStrGradeCdID() {
		return strGradeCdID;
	}

	public void setStrGradeCdID(String strGradeCdID) {
		this.strGradeCdID = strGradeCdID;
	}

	public String getStrGradeCdEN() {
		return strGradeCdEN;
	}

	public void setStrGradeCdEN(String strGradeCdEN) {
		this.strGradeCdEN = strGradeCdEN;
	}

}
