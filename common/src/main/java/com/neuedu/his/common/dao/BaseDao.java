package com.neuedu.his.common.dao;
/*
时间 ：  2019-07-0915:12

作用 ：用了泛型
      增删改查

基本思路 ：
*/


import com.neuedu.his.common.bean.BaseBean;

import java.util.List;

public interface BaseDao<T extends BaseBean> {
    //增删改查
    void insert(T t);

    void insertBatch(List<T> list);//批量插入数据

    void update(T t);

    void delete(T condition);//作为condition作为删除的条件对象

    void deleteById(String id);//根据id删除数据
    T finfById(String id);//根据id查询
    T find(T condition);//根据条件对象查询
    List<T> findList(T condition);//根据条件对象查询集合
    List<T> findAll();//查询所有

}
