package com.bryan2.dao;

import com.bryan2.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.HashMap;

public interface UserMapper {

    /*
     *   查询指定 id 的用户信息
     *
     *   SQL语句:
     *
     *   SELECT *
     *   FROM tb_user
     *   WHERE `id` = #{id}
     *
     *   给参数添加 @Param 注解
     *
     *   注解的功能：会把注解的名字和注解修饰的参数值，放到一个 map 中 <注解名, 注解修饰的参数值>
     */
    User selectUserById(@Param("id") int id);

    /*
     *   验证用户的用户名和密码
     *
     *   SQL语句:
     *
     *   SELECT *
     *   FROM tb_user
     *   WHERE `username` = #{username}
     *     AND `password` = #{passwd}
     *
     *   存在多个参数 第一种方法: 都放到 MyBatis 提供的 Map 中
     */
    User selectUserByUsernameAndPasswd
    (@Param("username") String username, @Param("passwd") String passwd);

    /*
     *   添加一条用户记录
     *
     *   SQL语句:
     *
     *   INSERT INTO tb_user
     *   VALUES (NULL, #{username}, #{password}, #{account}, #{permission})
     *
     *   存在多个参数 第二种方法：自己创建 Map 对象，并用 Map 对象封装这些参数
     */
    int insertUserByMap(HashMap<String, Object> map);

    /*
     *   修改用户信息
     *
     *   SQL语句：
     *
     *   UPDATE tb_user
     *   SET password   = #{password},
     *       account    = #{account},
     *       permission = #{permission}
     *   WHERE username = #{username}
     *
     *   存在多个参数 第三种方法：使用 User 实体类对象封装这些参数
     */
    int updateUserByPassingInstance(User user);

    /*
    *   查询用户数量
    *
    *   SQL语句：
    *
    *   SELECT COUNT(*)
    *   FROM tb_user
    */
    Integer selectCount();

    /*
    *
    *   模糊查询姓张的用户
    *
    *   SQL语句：
    *
    *   SELECT *
    *   FROM tb_user
    *   WHERE username LIKE '${username}%'
    */
    List<User> selectUserByName(@Param("username") String username);

    /*
    *   动态显示列
    *
    *   SQL语句：
    *
    *   SELECT ${cols}
    *   FROM tb_user;
    *
    */
    List<User> selectUserByCols(@Param("cols") String cols);

    /*
    *   获得主键自增的数据
    *
    *   SQL语句：
    *
    *   INSERT INTO tb_user
    *    VALUES (NULL, #{username}, #{password}, #{account}, #{permission})
    */
    int insertByUserIns(User user);
}
