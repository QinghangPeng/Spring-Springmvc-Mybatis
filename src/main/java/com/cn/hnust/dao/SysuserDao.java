package com.cn.hnust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.hnust.entity.Sysuser;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: openSource</p>
 *
 * @author ���� penghao
 * 
 * @since��2017��10��9�� ����2:59:35
 * 
 */
@Repository
public interface SysuserDao {
	public List<Sysuser> getSysUser();
}
