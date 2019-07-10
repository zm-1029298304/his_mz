package com.neuedu.his.common.util;
/*
时间 ：  2019-07-0916:53

作用 ：给病例数据生成主键

基本思路 ：
*/


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.SimpleFormatter;

public class CaseHistoryIdGenerator {
//原子int
    private static  AtomicInteger seq = new AtomicInteger(0);
    //dateformat
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    //原子引用类型（String）
    private  static AtomicReference<String> strRef=new AtomicReference<>(sdf.format(new Date()));

/**
 * 生成id方法
 */
 public static String genId(){
     updateTime();
     return strRef.get()+seq.getAndIncrement();
 }

    /**
     * 判断当前时间是否和datestr相等，不想等，就更新日期并且将seq设置为0
     */
    private static void updateTime(){
     String curr = sdf.format(new Date());
     if(curr.equals(strRef.get())){
         //更新时间
         strRef.set(curr);
         //重新建seq设置为0
         seq.set(0);
     }
}

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            for (; ;){
            System.out.println(CaseHistoryIdGenerator.genId());
            }
        });

        Thread t2 = new Thread(()-> {
            for (; ;){
                System.out.println(CaseHistoryIdGenerator.genId());
            }
        });

        Thread t3 = new Thread(()-> {
            for (; ;){
                System.out.println(CaseHistoryIdGenerator.genId());
            }
        });

        Thread t4 = new Thread(()-> {
            for (; ;){
                System.out.println(CaseHistoryIdGenerator.genId());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    }

