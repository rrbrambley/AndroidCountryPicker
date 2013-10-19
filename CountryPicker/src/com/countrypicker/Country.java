package com.countrypicker;

/**
 * POJO
 *
 */
public class Country {
	private String code;
	private String name;
    private String calling_code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getCallingCode() { return calling_code; }

    public void setCallingCode(String calling_code) { this.calling_code = calling_code; }
}