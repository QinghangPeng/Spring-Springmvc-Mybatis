package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.hnust.entity.Sysuser;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author 作者 penghao
 * 
 * @since：2017年10月9日 下午2:59:35
 * 
 */
@Repository
public interface SysuserDao {
	public List<Sysuser> getSysUser();
}
