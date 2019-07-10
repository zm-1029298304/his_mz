package com.neuedu.his.common.bean;
/*
时间 ：  2019-07-0915:39

作用 ：病例实体类

基本思路 ：
*/


import java.util.Date;

public class CaseHistory extends BaseBean {

    private String patientName;
    private String gender;
    private Integer age;
    private Date birthday;
    private String identityCard;//身份证
    private String homeAddress;//地址
    private Date attendTime;//看诊日期

    private Department department;
    private Employee doctor;//看病医生
}
