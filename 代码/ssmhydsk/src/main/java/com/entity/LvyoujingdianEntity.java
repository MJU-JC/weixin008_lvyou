package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 旅游景点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 17:34:28
 */
@TableName("lvyoujingdian")
public class LvyoujingdianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LvyoujingdianEntity() {
		
	}
	
	public LvyoujingdianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 景点名称
	 */
					
	private String jingdianmingcheng;
	
	/**
	 * 景点分类
	 */
					
	private String jingdianfenlei;
	
	/**
	 * 景点图片
	 */
					
	private String jingdiantupian;
	
	/**
	 * 景点星级
	 */
					
	private String jingdianxingji;
	
	/**
	 * 景点地址
	 */
					
	private String jingdiandizhi;
	
	/**
	 * 门票价格
	 */
					
	private Integer menpiaojiage;
	
	/**
	 * 营业时间
	 */
					
	private String yingyeshijian;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 景点介绍
	 */
					
	private String jingdianjieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：景点名称
	 */
	public void setJingdianmingcheng(String jingdianmingcheng) {
		this.jingdianmingcheng = jingdianmingcheng;
	}
	/**
	 * 获取：景点名称
	 */
	public String getJingdianmingcheng() {
		return jingdianmingcheng;
	}
	/**
	 * 设置：景点分类
	 */
	public void setJingdianfenlei(String jingdianfenlei) {
		this.jingdianfenlei = jingdianfenlei;
	}
	/**
	 * 获取：景点分类
	 */
	public String getJingdianfenlei() {
		return jingdianfenlei;
	}
	/**
	 * 设置：景点图片
	 */
	public void setJingdiantupian(String jingdiantupian) {
		this.jingdiantupian = jingdiantupian;
	}
	/**
	 * 获取：景点图片
	 */
	public String getJingdiantupian() {
		return jingdiantupian;
	}
	/**
	 * 设置：景点星级
	 */
	public void setJingdianxingji(String jingdianxingji) {
		this.jingdianxingji = jingdianxingji;
	}
	/**
	 * 获取：景点星级
	 */
	public String getJingdianxingji() {
		return jingdianxingji;
	}
	/**
	 * 设置：景点地址
	 */
	public void setJingdiandizhi(String jingdiandizhi) {
		this.jingdiandizhi = jingdiandizhi;
	}
	/**
	 * 获取：景点地址
	 */
	public String getJingdiandizhi() {
		return jingdiandizhi;
	}
	/**
	 * 设置：门票价格
	 */
	public void setMenpiaojiage(Integer menpiaojiage) {
		this.menpiaojiage = menpiaojiage;
	}
	/**
	 * 获取：门票价格
	 */
	public Integer getMenpiaojiage() {
		return menpiaojiage;
	}
	/**
	 * 设置：营业时间
	 */
	public void setYingyeshijian(String yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	/**
	 * 获取：营业时间
	 */
	public String getYingyeshijian() {
		return yingyeshijian;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：景点介绍
	 */
	public void setJingdianjieshao(String jingdianjieshao) {
		this.jingdianjieshao = jingdianjieshao;
	}
	/**
	 * 获取：景点介绍
	 */
	public String getJingdianjieshao() {
		return jingdianjieshao;
	}

}
