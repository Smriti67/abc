package com.cg.movies.responses;

public class CustomResponse {
	@Override
	public String toString() {
		return "CustomResponse [errorMessage=" + errorMessage + ", statusCode=" + statusCode + "]";
	}
	public CustomResponse() {
		
	}
	private String errorMessage;
	public CustomResponse(String errorMessage, int statusCode) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
	}
	private int statusCode;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
