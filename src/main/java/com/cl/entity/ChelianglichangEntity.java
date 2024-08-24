package com.cl.entity;

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
 * 车辆离场
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
@TableName("chelianglichang")
public class ChelianglichangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChelianglichangEntity() {
		
	}
	
	public ChelianglichangEntity(T t) {
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
	 * 车位编号
	 */
					
	private String cheweibianhao;
	
	/**
	 * 车位位置
	 */
					
	private String cheweiweizhi;
	
	/**
	 * 社区名称
	 */
					
	private String shequmingcheng;
	
	/**
	 * 车位类型
	 */
					
	private String cheweileixing;
	
	/**
	 * 车牌号码
	 */
					
	private String chepaihaoma;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 入场时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date ruchangshijian;
	
	/**
	 * 出场时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chuchangshijian;
	
	/**
	 * 计费时长
	 */
					
	private Double jifeishizhang;
	
	/**
	 * 小时价格
	 */
					
	private Double xiaoshijiage;
	
	/**
	 * 收费金额
	 */
					
	private Double shoufeijine;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	 * 设置：车位编号
	 */
	public void setCheweibianhao(String cheweibianhao) {
		this.cheweibianhao = cheweibianhao;
	}
	/**
	 * 获取：车位编号
	 */
	public String getCheweibianhao() {
		return cheweibianhao;
	}
	/**
	 * 设置：车位位置
	 */
	public void setCheweiweizhi(String cheweiweizhi) {
		this.cheweiweizhi = cheweiweizhi;
	}
	/**
	 * 获取：车位位置
	 */
	public String getCheweiweizhi() {
		return cheweiweizhi;
	}
	/**
	 * 设置：社区名称
	 */
	public void setShequmingcheng(String shequmingcheng) {
		this.shequmingcheng = shequmingcheng;
	}
	/**
	 * 获取：社区名称
	 */
	public String getShequmingcheng() {
		return shequmingcheng;
	}
	/**
	 * 设置：车位类型
	 */
	public void setCheweileixing(String cheweileixing) {
		this.cheweileixing = cheweileixing;
	}
	/**
	 * 获取：车位类型
	 */
	public String getCheweileixing() {
		return cheweileixing;
	}
	/**
	 * 设置：车牌号码
	 */
	public void setChepaihaoma(String chepaihaoma) {
		this.chepaihaoma = chepaihaoma;
	}
	/**
	 * 获取：车牌号码
	 */
	public String getChepaihaoma() {
		return chepaihaoma;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：入场时间
	 */
	public void setRuchangshijian(Date ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	/**
	 * 获取：入场时间
	 */
	public Date getRuchangshijian() {
		return ruchangshijian;
	}
	/**
	 * 设置：出场时间
	 */
	public void setChuchangshijian(Date chuchangshijian) {
		this.chuchangshijian = chuchangshijian;
	}
	/**
	 * 获取：出场时间
	 */
	public Date getChuchangshijian() {
		return chuchangshijian;
	}
	/**
	 * 设置：计费时长
	 */
	public void setJifeishizhang(Double jifeishizhang) {
		this.jifeishizhang = jifeishizhang;
	}
	/**
	 * 获取：计费时长
	 */
	public Double getJifeishizhang() {
		return jifeishizhang;
	}
	/**
	 * 设置：小时价格
	 */
	public void setXiaoshijiage(Double xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	/**
	 * 获取：小时价格
	 */
	public Double getXiaoshijiage() {
		return xiaoshijiage;
	}
	/**
	 * 设置：收费金额
	 */
	public void setShoufeijine(Double shoufeijine) {
		this.shoufeijine = shoufeijine;
	}
	/**
	 * 获取：收费金额
	 */
	public Double getShoufeijine() {
		return shoufeijine;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
