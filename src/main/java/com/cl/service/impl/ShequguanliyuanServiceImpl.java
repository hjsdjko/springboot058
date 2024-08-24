package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShequguanliyuanDao;
import com.cl.entity.ShequguanliyuanEntity;
import com.cl.service.ShequguanliyuanService;
import com.cl.entity.view.ShequguanliyuanView;

@Service("shequguanliyuanService")
public class ShequguanliyuanServiceImpl extends ServiceImpl<ShequguanliyuanDao, ShequguanliyuanEntity> implements ShequguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequguanliyuanEntity> page = this.selectPage(
                new Query<ShequguanliyuanEntity>(params).getPage(),
                new EntityWrapper<ShequguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequguanliyuanEntity> wrapper) {
		  Page<ShequguanliyuanView> page =new Query<ShequguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShequguanliyuanView> selectListView(Wrapper<ShequguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequguanliyuanView selectView(Wrapper<ShequguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
