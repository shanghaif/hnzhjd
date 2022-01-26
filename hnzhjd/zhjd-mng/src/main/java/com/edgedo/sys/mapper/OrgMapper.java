package com.edgedo.sys.mapper;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Org;
import com.edgedo.sys.queryvo.OrgQuery;
import com.edgedo.sys.queryvo.OrgView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface OrgMapper  extends BaseMapper<Org>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<OrgView> listPage(OrgQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<OrgView> listByObj(OrgQuery query);

	Org selectByOrgId(Integer id);

	/**
	 * 加载所有
	 * @return
	 */
    List<OrgView> listAll();

	Integer selectIdByOrgName(String orgName);

	/**
	 * 逻辑删除
	 * @param param
	 */
    int deleteByIdsLogic(Map<String,Object> param);


}