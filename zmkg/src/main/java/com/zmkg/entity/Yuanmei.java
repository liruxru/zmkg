package com.zmkg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Yuanmei entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "yuanmei", catalog = "xyxmc")
public class Yuanmei implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Double hui;
	private Double liu;
	private Double huifa;
	private Integer zhishu;
	private Double huishou;
	private Integer chengben;
	private Integer status;
	// Constructors

	/** default constructor */
	public Yuanmei() {
	}

	/** full constructor */
	public Yuanmei(String name, Double hui, Double liu, Double huifa,
			Integer zhishu, Double huishou, Integer chengben,Integer status) {
		this.name = name;
		this.hui = hui;
		this.liu = liu;
		this.huifa = huifa;
		this.zhishu = zhishu;
		this.huishou = huishou;
		this.chengben = chengben;
		this.status = status;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "hui", precision = 11)
	public Double getHui() {
		return this.hui;
	}

	public void setHui(Double hui) {
		this.hui = hui;
	}

	@Column(name = "liu", precision = 11)
	public Double getLiu() {
		return this.liu;
	}

	public void setLiu(Double liu) {
		this.liu = liu;
	}

	@Column(name = "huifa", precision = 11)
	public Double getHuifa() {
		return this.huifa;
	}

	public void setHuifa(Double huifa) {
		this.huifa = huifa;
	}

	@Column(name = "zhishu")
	public Integer getZhishu() {
		return this.zhishu;
	}

	public void setZhishu(Integer zhishu) {
		this.zhishu = zhishu;
	}

	@Column(name = "huishou", precision = 11)
	public Double getHuishou() {
		return this.huishou;
	}

	public void setHuishou(Double huishou) {
		this.huishou = huishou;
	}

	@Column(name = "chengben")
	public Integer getChengben() {
		return this.chengben;
	}

	public void setChengben(Integer chengben) {
		this.chengben = chengben;
	}
	@Column(name = "status")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}