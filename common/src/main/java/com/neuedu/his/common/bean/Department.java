package com.neuedu.his.common.bean;
/*
时间 ：  2019-07-0915:44

作用 ：

基本思路 ：
*/

import lombok.Data;

import java.util.List;

@Data
public class Department extends BaseBean {

    private String department;
    private String departType;
    private String departLevel;
    private String pid;

    //子部门集合
    private List<Department> children;
}
