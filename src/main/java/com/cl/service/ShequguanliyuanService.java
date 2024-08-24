package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShequguanliyuanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShequguanliyuanView;


/**
 * 社区管理员
 *
 * @author 
 * @email 
 * @date 2024-04-10 00:10:59
 */
public interface ShequguanliyuanService extends IService<ShequguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShequguanliyuanView> selectListView(Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	ShequguanliyuanView selectView(@Param("ew") Wrapper<ShequguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShequguanliyuanEntity> wrapper);
   	

}

