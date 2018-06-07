package com.zmkg.util;

import java.util.ArrayList;
import java.util.List;

import com.zmkg.bean.Constant;
import com.zmkg.bean.Mei;
import com.zmkg.entity.Jinmei;
import com.zmkg.entity.Yuanmei;




public class ConvertMyNeed {
	public static Constant constantGetValue(List<Yuanmei> yuanMeiList, Jinmei jinmei1, Jinmei jinmei2, Integer zuiDaChanShu) {
		Constant c=new Constant();
		List<Mei> meiList=new ArrayList<Mei>();
		for (Yuanmei yuanmei : yuanMeiList) {
			Mei m=new Mei(Integer.valueOf(yuanmei.getChengben()), 
					yuanmei.getHuishou(),
					yuanmei.getHui(), 
					yuanmei.getLiu(), 
					yuanmei.getHuifa(),
					yuanmei.getZhishu(), yuanmei.getName());
			meiList.add(m);
		}
		double[] MAX={jinmei1.getHui(),jinmei1.getLiu(),jinmei1.getHuifa(),jinmei1.getZhishu()};
		//在这里定义要求精煤的  A S V G 指标的最大值
		double[] MIN={jinmei2.getHui(),jinmei2.getLiu(),jinmei2.getHuifa(),jinmei2.getZhishu()};
		c.setMAX(MAX);
		c.setMIN(MIN);
		c.setMeiList(meiList);
		c.setBLMAX(zuiDaChanShu);
		return c;
	}
		
	
}
