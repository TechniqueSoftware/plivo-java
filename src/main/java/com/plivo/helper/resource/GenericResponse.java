package com.plivo.helper.resource;

import com.google.gson.annotations.SerializedName;

public class GenericResponse {
	@SerializedName("server_code")
	private int serverCode;
	private String error;
	private String message;
	@SerializedName("api_id")
	private String apiId;

	public int getServerCode() {
		return serverCode;
	}

	public String getError() {
		return error;
	}

	public String getMessage() {
		return message;
	}

	public String getApiId() {
		return apiId;
	}

}