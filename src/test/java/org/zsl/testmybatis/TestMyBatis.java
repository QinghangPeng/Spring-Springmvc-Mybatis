package org.zsl.testmybatis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith; 
import org.junit.Test;

import com.alibaba.fastjson.JSON;
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
 * @since：2017年10月9日 下午3:10:39
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);  
   
	@Autowired 
    private SysuserService sysUserService = null;  
  
  
    @Test  
    public void test1() {  
        List<Sysuser> list = sysUserService.getSysUser();
        for (Sysuser sysuser : list) {
        	logger.info(JSON.toJSONString(sysuser));
        	//System.out.println(JSON.toJSONString(sysuser));
		}
    }  
}
