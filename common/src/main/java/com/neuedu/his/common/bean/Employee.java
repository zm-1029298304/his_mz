package com.neuedu.his.common.bean;
/*
时间 ：  2019-07-0915:44

作用 ：

基本思路 ：
*/

import lombok.Data;

@Data
public class Employee extends BaseBean {

    private String emloyeeName;
    private String phone;
    private String gender;
    private Integer age;
    private String emloyeeType;

}
