package com.hyl.Mybatis.Annotation;

import com.hyl.Entities.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author HuangYL
 * @desc ${DESC}
 * @create 03-03-2018  下午7:48.
 */
public interface UserMapper {

    @Insert("insert into users(NAME,age) values(#{name},#{age})")
    public int add(User user);

    @Delete("DELETE from users where id = #{id}")
    public int deleteById(int id);

    @Update("update users set NAME=#{name},age=#{age} where id = #{id}")
    public int update(User user);

    @Select("select * from users  where id = #{id}")
    public User getById(int id);

    @Select(" select * from users")
    public List<User> getAll();


}
