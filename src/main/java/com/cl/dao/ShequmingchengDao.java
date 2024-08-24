package com.cl.dao;

import com.cl.entity.ShequmingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequmingchengView;


/**
 * 社区名称
 * 
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface ShequmingchengDao extends BaseMapper<ShequmingchengEntity> {
	
	List<ShequmingchengView> selectListView(@Param("ew") Wrapper<ShequmingchengEntity> wrapper);

	List<ShequmingchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShequmingchengEntity> wrapper);
	
	ShequmingchengView selectView(@Param("ew") Wrapper<ShequmingchengEntity> wrapper);
	

}
