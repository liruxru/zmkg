package com.zmkg.bean;
//方案类
public class JinMei implements Comparable<JinMei>{
	
	private double chengben; //生产一吨精煤所需要的原煤价格
	private ZhiBiao[] zhibiao=new ZhiBiao[4]; //ASVG
	private String peibiFangAn;
	public JinMei() {
		zhibiao[0]=new ZhiBiao("灰份", null);
		zhibiao[1]=new ZhiBiao("硫份", null);
		zhibiao[2]=new ZhiBiao("挥发", null);
		zhibiao[3]=new ZhiBiao("粘结", null);
	}
	public double getChengben() {
		return chengben;
	}
	public void setChengben(double chengben) {
		this.chengben = chengben;
	}
	public ZhiBiao[] getZhibiao() {
		return zhibiao;
	}
	public void setZhibiao(ZhiBiao[] zhibiao) {
		this.zhibiao = zhibiao;
	}
	public String getPeibiFangAn() {
		return peibiFangAn;
	}
	public void setPeibiFangAn(String peibiFangAn) {
		this.peibiFangAn = peibiFangAn;
	}
	//实现排序
	@Override
	public int compareTo(JinMei o) {
		return o.getChengben()-this.getChengben()<0?1:-1;
	}
	
	
}
