package com.cl.dao;

import com.cl.entity.RuchangtingcheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RuchangtingcheView;


/**
 * 入场停车
 * 
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface RuchangtingcheDao extends BaseMapper<RuchangtingcheEntity> {
	
	List<RuchangtingcheView> selectListView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);

	List<RuchangtingcheView> selectListView(Pagination page,@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	
	RuchangtingcheView selectView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
	

}
