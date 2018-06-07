package com.zmkg.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zmkg.bean.Constant;
import com.zmkg.bean.JinMei;
import com.zmkg.bean.Mei;
import com.zmkg.bean.ZhiBiao;
import com.zmkg.dao.YuanmeiDAO;
import com.zmkg.entity.Jinmei;
import com.zmkg.entity.Yuanmei;
import com.zmkg.util.ConvertMyNeed;



@Service
public class YuanmeiService {
	@Autowired
	private YuanmeiDAO yuanmeiDAO;

	/**
	 * 查看所有
	 * @return
	 */
	public List<Yuanmei> listAll() {
	
		return yuanmeiDAO.findAll();
	}
	/**
	 * 查看全部隐藏的
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Yuanmei> findByStatus() {
		return yuanmeiDAO.findByStatus(0);
	}
	/**
	 * 查看全部未隐藏的
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Yuanmei> findAllUse() {
		return yuanmeiDAO.findAllUse();
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public Yuanmei getOneById(Integer id) {
		// TODO Auto-generated method stub
		return yuanmeiDAO.findById(id);
	}
	
	
	public void update(Yuanmei yuanmei) {
		yuanmeiDAO.attachDirty(yuanmei);
	}

	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<JinMei> jisuan(Integer[] ids, Jinmei jinmei1, Jinmei jinmei2, Integer zuiDaChanShu) {
		List<Yuanmei> yuanMeiList = yuanmeiDAO.getYuanMeiByIds(ids);
		jmList=new ArrayList<JinMei>();
		Constant constant = ConvertMyNeed.constantGetValue(yuanMeiList,jinmei1,jinmei2,zuiDaChanShu);
		BLMAX=constant.getBLMAX();
		meiList= constant.getMeiList();
		a=new int[yuanMeiList.size()];
		MAX=constant.getMAX();
		MIN=constant.getMIN();
		ori=0;
		//任意种数量的计算  第一种 递归计算
		fff();
		return jmList;
	}
	
	public void add(Yuanmei yuanmei) {
		yuanmeiDAO.save(yuanmei);
	}
	private Integer BLMAX;
	private int[] a;
	private DecimalFormat df=new DecimalFormat("0.00");
	private List<Mei> meiList ;
	private int ori=0;//用作比例数组的下角标
	private   double[] MAX;
	private    double[] MIN;
	List<JinMei> jmList;
	private void fff(){
		for(int i=1;i<=BLMAX;i++){
			if(ori<meiList.size()-1){
				a[ori++]=i;
				fff();
			}else{
				a[ori]=i;
				addListOk(a);
			}
		}
		ori--;
	}
	
	//计算指标
	private void addListOk(int[] array){
		JinMei jm=new JinMei();
		//四个指标
		ZhiBiao[] zhibiao=jm.getZhibiao();
		for (int j = 0; j < zhibiao.length; j++) {
			double sum=0;
			for (int i = 0; i < array.length; i++) {
				sum+=array[i]*(meiList.get(i).getHuishou()*meiList.get(i).getZhibiao()[j].getValue());
			}
			zhibiao[j].setValue(sum/getDetail2(array));
			if(Double.isNaN(zhibiao[j].getValue()) || Double.isInfinite(zhibiao[j].getValue()))return;
			if(zhibiao[j].getValue()>MAX[j]||zhibiao[j].getValue()<MIN[j])
			return;
		}
		//合格 输出比例 计算成本
		StringBuilder sb=new StringBuilder();
		for (Mei mei : meiList) {
			sb.append(mei.getName()+":");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append(" = ");
		for (int l : array) {
			sb.append(l+":");
		}
		sb.deleteCharAt(sb.length()-1);
		jm.setPeibiFangAn(sb.toString());
		double huishou=getHuishou(array);
		jm.setChengben(Double.valueOf(df.format(1/huishou*100*getChengBen(array))));
		jmList.add(jm);
		
	}
	//计算回收
	private double getHuishou(int[] array){
		int sum=0;int count=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i]*meiList.get(i).getHuishou();
			count+=array[i];
		}		
		return sum/count;
		
	}
	private int getChengBen(int[] array) {
		int sum=0;int count=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i]*meiList.get(i).getChengben();
			count+=array[i];
		}		
		return sum/count;
	}
	private Double getDetail2(int[] array){
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i]*meiList.get(i).getHuishou();
		}
		return sum;
	}

	

	
	

	

	
	
	

}
