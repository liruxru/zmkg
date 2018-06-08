package com.zmkg.bean;

public class HighJinmei {
	 private Integer highId;
     private String highName;
     private Double highHui;
     private Double highLiu;
     private Double highHuifa;
     private Double highZhishu;
	public Integer getHighId() {
		return highId;
	}
	public void setHighId(Integer highId) {
		this.highId = highId;
	}
	public String getHighName() {
		return highName;
	}
	public void setHighName(String highName) {
		this.highName = highName;
	}
	public Double getHighHui() {
		return highHui;
	}
	public void setHighHui(Double highHui) {
		this.highHui = highHui;
	}
	public Double getHighLiu() {
		return highLiu;
	}
	public void setHighLiu(Double highLiu) {
		this.highLiu = highLiu;
	}
	public Double getHighHuifa() {
		return highHuifa;
	}
	public void setHighHuifa(Double highHuifa) {
		this.highHuifa = highHuifa;
	}
	public Double getHighZhishu() {
		return highZhishu;
	}
	public void setHighZhishu(Double highZhishu) {
		this.highZhishu = highZhishu;
	}
	public HighJinmei() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HighJinmei(Integer highId, String highName, Double highHui, Double highLiu, Double highHuifa,
			Double highZhishu) {
		super();
		this.highId = highId;
		this.highName = highName;
		this.highHui = highHui;
		this.highLiu = highLiu;
		this.highHuifa = highHuifa;
		this.highZhishu = highZhishu;
	}
	@Override
	public String toString() {
		return "HighJinmei [highId=" + highId + ", highName=" + highName + ", highHui=" + highHui + ", highLiu="
				+ highLiu + ", highHuifa=" + highHuifa + ", highZhishu=" + highZhishu + "]";
	}
    

}
