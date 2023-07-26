package com.example.lanshan_homework6.dao;

import com.example.lanshan_homework6.lostGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserService {
    public String usersLogin(String username);
    //    全部查询
    public List<lostGoods> lostQuery();
    //    增加失物
    public int lostAdd(lostGoods l);
    //    删除失物
    public int lostDel(int id);
    //    修改自己发布的物品
    public List<lostGoods> lostQueryChange(String lostName);

}
