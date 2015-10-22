package com.internetitem.logback.elasticsearch.config;

public class Property {
	private String name;
	private String value;
	private boolean allowEmpty;
	private boolean rawJson;

	public Property() {
	}

	public Property(String name, String value, boolean allowEmpty, boolean rawJson) {
		this.name = name;
		this.value = value;
		this.allowEmpty = allowEmpty;
		this.rawJson = rawJson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isAllowEmpty() {
		return allowEmpty;
	}

	public void setAllowEmpty(boolean allowEmpty) {
		this.allowEmpty = allowEmpty;
	}

	public boolean isRawJson() {
		return rawJson;
	}

	public void setRawJson(boolean rawJson) {
		this.rawJson = rawJson;
	}
}
