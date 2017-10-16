package com.cn.hnust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.SysuserDao;
import com.cn.hnust.entity.Sysuser;
import com.cn.hnust.service.SysuserService;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: openSource</p>
 *
 * @author 作者 penghao
 * 
 * @since：2017年10月9日 下午2:50:00
 * 
 */
@Service("sysuserService") 
public class SysuserServiceImpl implements SysuserService {
	
	@Autowired
	private SysuserDao sysUserDao;
	public List<Sysuser> getSysUser() {
		List<Sysuser> list = sysUserDao.getSysUser();
		return list;
	}

}
