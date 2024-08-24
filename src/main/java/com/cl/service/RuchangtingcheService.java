package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.RuchangtingcheEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RuchangtingcheView;


/**
 * 入场停车
 *
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface RuchangtingcheService extends IService<RuchangtingcheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuchangtingcheView> selectListView(Wrapper<RuchangtingcheEntity> wrapper);
   	
   	RuchangtingcheView selectView(@Param("ew") Wrapper<RuchangtingcheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuchangtingcheEntity> wrapper);
   	

}

