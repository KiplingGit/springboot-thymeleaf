package me.kipling.springboot.thymeleaf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.kipling.springboot.thymeleaf.domain.User;

public interface UserDao {

	List<User> findByNameLike(@Param("strLike")String strLike);
}
