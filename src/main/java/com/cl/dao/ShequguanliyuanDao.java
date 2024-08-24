package com.cl.dao;

import com.cl.entity.ShequguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequguanliyuanView;


/**
 * 社区管理员
 * 
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface ShequguanliyuanDao extends BaseMapper<ShequguanliyuanEntity> {
	
	List<ShequguanliyuanView> selectListView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);

	List<ShequguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
	
	ShequguanliyuanView selectView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
	

}
