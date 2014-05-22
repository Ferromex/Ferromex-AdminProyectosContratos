package com.ferromex.proyectos.web.util;

import java.io.Serializable;

public class Checkbox implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2339654291213700333L;
	private String id;
	private String label;
	private String value;
	private String checked;
	private String disabled;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getDisabled() {
		return disabled;
	}
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}
