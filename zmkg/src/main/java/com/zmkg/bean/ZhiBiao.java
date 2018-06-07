package com.zmkg.bean;

public class ZhiBiao {
	private String key;
	private Double value;
	public ZhiBiao() {
		// TODO Auto-generated constructor stub
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public ZhiBiao(String key, Double value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "ZhiBiao [key=" + key + ", value=" + value + "]";
	}
}
