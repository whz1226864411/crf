package com.creat.secret.utils;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

/**
 * Created by Administrator on 2017/8/25.
 */
public class UuidUtilTest {

    @Test
    public void getUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-","");
        System.out.println(uuid);
    }

    @Test
    public void test(){
        int one = (int) Math.round(1.0/7.0*100);
        System.out.println(one);
        int two = (int) Math.round((one /100.0*7+1.015)/7.0*100);
        System.out.println(two);
        int three = (int) Math.round((two /100.0*7+1.015)/7.0*100);
        System.out.println(three);
        int four = (int) Math.round((three /100.0*7+4.015)/7.0*100);
        System.out.println(four);
    }

}
