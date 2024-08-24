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


import com.cl.dao.ShequmingchengDao;
import com.cl.entity.ShequmingchengEntity;
import com.cl.service.ShequmingchengService;
import com.cl.entity.view.ShequmingchengView;

@Service("shequmingchengService")
public class ShequmingchengServiceImpl extends ServiceImpl<ShequmingchengDao, ShequmingchengEntity> implements ShequmingchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShequmingchengEntity> page = this.selectPage(
                new Query<ShequmingchengEntity>(params).getPage(),
                new EntityWrapper<ShequmingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShequmingchengEntity> wrapper) {
		  Page<ShequmingchengView> page =new Query<ShequmingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShequmingchengView> selectListView(Wrapper<ShequmingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShequmingchengView selectView(Wrapper<ShequmingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
