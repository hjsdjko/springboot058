package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShequmingchengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequmingchengView;


/**
 * 社区名称
 *
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface ShequmingchengService extends IService<ShequmingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequmingchengView> selectListView(Wrapper<ShequmingchengEntity> wrapper);
   	
   	ShequmingchengView selectView(@Param("ew") Wrapper<ShequmingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequmingchengEntity> wrapper);
   	

}

