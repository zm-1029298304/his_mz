package com.neuedu.his.common.bean;
/*
时间 ：  2019-07-0915:05

作用 ：

基本思路 ：
*/


import com.neuedu.his.common.util.CommonIdGenerator;
import lombok.Data;

import java.util.Date;
import java.util.UUID;


@Data
public  class BaseBean {

    private String id;
    private Date updateTIme;
    private String delFlag;

    /**
     * 在插入之前的准备工作
     */
   public  void preInsert(){
       //1、生成Id 2、给updateTime赋值
       this.id = CommonIdGenerator.genId();
        this.updateTIme = new Date();
   }
    /**
     * 在更新之前的准备工作
     */
   public void preUpdate(){
       //给updateTime赋值
       this.updateTIme = new Date();
   }
}

