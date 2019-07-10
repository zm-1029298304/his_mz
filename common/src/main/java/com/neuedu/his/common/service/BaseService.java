package com.neuedu.his.common.service;
/*
时间 ：  2019-07-0915:22

作用 ：

基本思路 ：
*/


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.his.common.bean.BaseBean;
import com.neuedu.his.common.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseBean,D extends BaseDao<T>>{

    @Autowired
    private D dao;

    public void insert(T t){
        t.preInsert();
        dao.insert(t);
    }

    public void insertBatch(List<T> list){
        dao.insertBatch(list);
    }

    public void update(T t){
        t.preUpdate();
        dao.update(t);
    }

    public void delete(T condition){
        dao.delete(condition);
    }

    public  void deleteById(String id){
        dao.deleteById(id);
    }

    public T findById(String id){
        return dao.finfById(id);
    }

    public  T find(T condition){
        return dao.find(condition);
    }

    public List<T> findList(T condition){
        return dao.findList(condition);
    }

    public List<T> findAll(){ return dao.findAll(); }

    /**
     * 根据id是否存在来判断是插入还是更新
     */
    public void save(T t){
        if (t.getId()!=null &&!t.getId().equals("")){
            update(t);
        }else {
            insert(t);
        }
    }
    /**
     * 根据条件查询分页数据
     * @param condition 条件
     * @param pageNum 当前页码
     * @param pageSize 每页多少条
     * @return
     */

    public PageInfo<T> getPage(T condition,Integer pageNum,Integer pageSize){
       return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()-> dao.findList(condition));
    }
}
