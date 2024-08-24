package com.cl.entity.view;

import com.cl.entity.ShequmingchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 社区名称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
@TableName("shequmingcheng")
public class ShequmingchengView  extends ShequmingchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShequmingchengView(){
	}
 
 	public ShequmingchengView(ShequmingchengEntity shequmingchengEntity){
 	try {
			BeanUtils.copyProperties(this, shequmingchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
