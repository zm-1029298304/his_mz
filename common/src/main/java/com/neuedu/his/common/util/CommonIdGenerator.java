package com.neuedu.his.common.util;
/*
时间 ：  2019-07-0916:46

作用 ：

基本思路 ：
*/


import java.util.UUID;

public class CommonIdGenerator  {

    public static String genId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
