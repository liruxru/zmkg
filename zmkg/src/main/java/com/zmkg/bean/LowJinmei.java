package com.zmkg.bean;

public class LowJinmei {
	 private Integer lowId;
     private String lowName;
     private Double lowHui;
     private Double lowLiu;
     private Double lowHuifa;
     private Double lowZhishu;
	public LowJinmei(Integer lowId, String lowName, Double lowHui, Double lowLiu, Double lowHuifa, Double lowZhishu) {
		super();
		this.lowId = lowId;
		this.lowName = lowName;
		this.lowHui = lowHui;
		this.lowLiu = lowLiu;
		this.lowHuifa = lowHuifa;
		this.lowZhishu = lowZhishu;
	}
	public LowJinmei() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getLowId() {
		return lowId;
	}
	public void setLowId(Integer lowId) {
		this.lowId = lowId;
	}
	public String getLowName() {
		return lowName;
	}
	public void setLowName(String lowName) {
		this.lowName = lowName;
	}
	public Double getLowHui() {
		return lowHui;
	}
	public void setLowHui(Double lowHui) {
		this.lowHui = lowHui;
	}
	public Double getLowLiu() {
		return lowLiu;
	}
	public void setLowLiu(Double lowLiu) {
		this.lowLiu = lowLiu;
	}
	public Double getLowHuifa() {
		return lowHuifa;
	}
	public void setLowHuifa(Double lowHuifa) {
		this.lowHuifa = lowHuifa;
	}
	public Double getLowZhishu() {
		return lowZhishu;
	}
	public void setLowZhishu(Double lowZhishu) {
		this.lowZhishu = lowZhishu;
	}
	@Override
	public String toString() {
		return "LowJinmei [lowId=" + lowId + ", lowName=" + lowName + ", lowHui=" + lowHui + ", lowLiu=" + lowLiu
				+ ", lowHuifa=" + lowHuifa + ", lowZhishu=" + lowZhishu + "]";
	}
     
}
