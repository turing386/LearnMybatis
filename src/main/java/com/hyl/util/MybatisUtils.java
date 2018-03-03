package com.hyl.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author HuangYL
 * @desc ${DESC}
 * @create 03-03-2018  下午7:07.
 */
public class MybatisUtils {
    public static SqlSessionFactory getFactory(){

        String resource = "conf.xml";

        //加载mybatis的配置文件（它也加载关联的映射文件)
        InputStream is = MybatisUtils.class.getClassLoader().getResourceAsStream(resource);

        //构建SqlSessionFactory
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sessionFactory;
    }
}
