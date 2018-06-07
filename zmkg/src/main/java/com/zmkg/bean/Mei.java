package com.zmkg.bean;

import java.util.Arrays;

public class Mei {
	private int chengben;//成本
	private double huishou;//ASVG
	private ZhiBiao[] zhibiao=new ZhiBiao[4];
	private String name;
	public Mei() {
		zhibiao[0]=new ZhiBiao("灰份", null);
		zhibiao[1]=new ZhiBiao("硫份", null);
		zhibiao[2]=new ZhiBiao("挥发", null);
		zhibiao[3]=new ZhiBiao("粘结", null);
	}
	public Mei(int chengben, double huishou, double a, double s, double v,
			double g, String name) {
		super();
		this.chengben = chengben;
		this.huishou = huishou;
		zhibiao[0]=new ZhiBiao("灰份", a);
		zhibiao[1]=new ZhiBiao("硫份", s);
		zhibiao[2]=new ZhiBiao("挥发", v);
		zhibiao[3]=new ZhiBiao("粘结", g);
		this.name = name;
	}
	public int getChengben() {
		return chengben;
	}
	public void setChengben(int chengben) {
		this.chengben = chengben;
	}
	public double getHuishou() {
		return huishou;
	}
	public void setHuishou(double huishou) {
		this.huishou = huishou;
	}
	
	public ZhiBiao[] getZhibiao() {
		return zhibiao;
	}
	public void setZhibiao(ZhiBiao[] zhibiao) {
		this.zhibiao = zhibiao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mei [chengben=" + chengben + ", huishou=" + huishou
				+ ", zhibiao=" + Arrays.toString(zhibiao) + ", name=" + name
				+ "]";
	}
	
}


