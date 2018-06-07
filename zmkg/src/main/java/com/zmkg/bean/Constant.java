package com.zmkg.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里是常量,只需要改这个文件就可以运行
 * @author Administrator
 *
 */
public class Constant {
	private  List<Mei> meiList=new ArrayList<Mei>();
	private  Integer  BLMAX=10;
	public Integer getBLMAX() {
		return BLMAX;
	}
	public void setBLMAX(Integer bLMAX) {
		BLMAX = bLMAX;
	}
	//在这里定义要求精煤的  A S V G 指标的最大值
	private   double[] MAX={10.5,1.30,22.5,82};
	//在这里定义要求精煤的  A S V G 指标的最大值
	private    double[] MIN={9.0,1.00,21.0,77};
	public List<Mei> getMeiList() {
		return meiList;
	}
	public void setMeiList(List<Mei> meiList) {
		this.meiList = meiList;
	}
	public double[] getMAX() {
		return MAX;
	}
	public void setMAX(double[] mAX) {
		MAX = mAX;
	}
	public double[] getMIN() {
		return MIN;
	}
	public void setMIN(double[] mIN) {
		MIN = mIN;
	}
	
	
}
