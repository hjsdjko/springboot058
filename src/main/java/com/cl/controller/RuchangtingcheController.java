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

import com.cl.entity.RuchangtingcheEntity;
import com.cl.entity.view.RuchangtingcheView;

import com.cl.service.RuchangtingcheService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 入场停车
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
@RestController
@RequestMapping("/ruchangtingche")
public class RuchangtingcheController {
    @Autowired
    private RuchangtingcheService ruchangtingcheService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuchangtingcheEntity ruchangtingche,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shequguanliyuan")) {
			ruchangtingche.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			ruchangtingche.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RuchangtingcheEntity> ew = new EntityWrapper<RuchangtingcheEntity>();

		PageUtils page = ruchangtingcheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruchangtingche), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuchangtingcheEntity ruchangtingche, 
		HttpServletRequest request){
        EntityWrapper<RuchangtingcheEntity> ew = new EntityWrapper<RuchangtingcheEntity>();

		PageUtils page = ruchangtingcheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruchangtingche), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuchangtingcheEntity ruchangtingche){
       	EntityWrapper<RuchangtingcheEntity> ew = new EntityWrapper<RuchangtingcheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruchangtingche, "ruchangtingche")); 
        return R.ok().put("data", ruchangtingcheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuchangtingcheEntity ruchangtingche){
        EntityWrapper< RuchangtingcheEntity> ew = new EntityWrapper< RuchangtingcheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruchangtingche, "ruchangtingche")); 
		RuchangtingcheView ruchangtingcheView =  ruchangtingcheService.selectView(ew);
		return R.ok("查询入场停车成功").put("data", ruchangtingcheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuchangtingcheEntity ruchangtingche = ruchangtingcheService.selectById(id);
		ruchangtingche = ruchangtingcheService.selectView(new EntityWrapper<RuchangtingcheEntity>().eq("id", id));
        return R.ok().put("data", ruchangtingche);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuchangtingcheEntity ruchangtingche = ruchangtingcheService.selectById(id);
		ruchangtingche = ruchangtingcheService.selectView(new EntityWrapper<RuchangtingcheEntity>().eq("id", id));
        return R.ok().put("data", ruchangtingche);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuchangtingcheEntity ruchangtingche, HttpServletRequest request){
    	ruchangtingche.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruchangtingche);
        ruchangtingcheService.insert(ruchangtingche);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuchangtingcheEntity ruchangtingche, HttpServletRequest request){
    	ruchangtingche.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruchangtingche);
        ruchangtingcheService.insert(ruchangtingche);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RuchangtingcheEntity ruchangtingche, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruchangtingche);
        ruchangtingcheService.updateById(ruchangtingche);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruchangtingcheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
