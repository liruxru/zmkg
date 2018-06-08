package com.zmkg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Jinmei entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="jinmei"
    ,catalog="xyxmc"
)

public class Jinmei  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Double hui;
     private Double liu;
     private Double huifa;
     private Double zhishu;


    // Constructors

    /** default constructor */
    public Jinmei() {
    }

    
    /** full constructor */
    public Jinmei(String name, Double hui, Double liu, Double huifa, Double zhishu) {
        this.name = name;
        this.hui = hui;
        this.liu = liu;
        this.huifa = huifa;
        this.zhishu = zhishu;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name")

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="hui", precision=11)

    public Double getHui() {
        return this.hui;
    }
    
    public void setHui(Double hui) {
        this.hui = hui;
    }
    
    @Column(name="liu", precision=11)

    public Double getLiu() {
        return this.liu;
    }
    
    public void setLiu(Double liu) {
        this.liu = liu;
    }
    
    @Column(name="huifa", precision=11)

    public Double getHuifa() {
        return this.huifa;
    }
    
    public void setHuifa(Double huifa) {
        this.huifa = huifa;
    }
    
    @Column(name="zhishu", precision=11)

    public Double getZhishu() {
        return this.zhishu;
    }
    
    public void setZhishu(Double zhishu) {
        this.zhishu = zhishu;
    }


	@Override
	public String toString() {
		return "Jinmei [id=" + id + ", name=" + name + ", hui=" + hui + ", liu=" + liu + ", huifa=" + huifa
				+ ", zhishu=" + zhishu + "]";
	}
   








}