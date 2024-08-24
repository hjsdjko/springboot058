package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShequmingchengEntity;
import com.cl.entity.view.ShequmingchengView;

import com.cl.service.ShequmingchengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 社区名称
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
@RestController
@RequestMapping("/shequmingcheng")
public class ShequmingchengController {
    @Autowired
    private ShequmingchengService shequmingchengService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShequmingchengEntity shequmingcheng,
		HttpServletRequest request){
        EntityWrapper<ShequmingchengEntity> ew = new EntityWrapper<ShequmingchengEntity>();

		PageUtils page = shequmingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequmingcheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShequmingchengEntity shequmingcheng, 
		HttpServletRequest request){
        EntityWrapper<ShequmingchengEntity> ew = new EntityWrapper<ShequmingchengEntity>();

		PageUtils page = shequmingchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shequmingcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShequmingchengEntity shequmingcheng){
       	EntityWrapper<ShequmingchengEntity> ew = new EntityWrapper<ShequmingchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shequmingcheng, "shequmingcheng")); 
        return R.ok().put("data", shequmingchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShequmingchengEntity shequmingcheng){
        EntityWrapper< ShequmingchengEntity> ew = new EntityWrapper< ShequmingchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shequmingcheng, "shequmingcheng")); 
		ShequmingchengView shequmingchengView =  shequmingchengService.selectView(ew);
		return R.ok("查询社区名称成功").put("data", shequmingchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShequmingchengEntity shequmingcheng = shequmingchengService.selectById(id);
		shequmingcheng = shequmingchengService.selectView(new EntityWrapper<ShequmingchengEntity>().eq("id", id));
        return R.ok().put("data", shequmingcheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShequmingchengEntity shequmingcheng = shequmingchengService.selectById(id);
		shequmingcheng = shequmingchengService.selectView(new EntityWrapper<ShequmingchengEntity>().eq("id", id));
        return R.ok().put("data", shequmingcheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShequmingchengEntity shequmingcheng, HttpServletRequest request){
    	shequmingcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequmingcheng);
        shequmingchengService.insert(shequmingcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShequmingchengEntity shequmingcheng, HttpServletRequest request){
    	shequmingcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shequmingcheng);
        shequmingchengService.insert(shequmingcheng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShequmingchengEntity shequmingcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shequmingcheng);
        shequmingchengService.updateById(shequmingcheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shequmingchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
