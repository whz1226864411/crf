package com.creat.secret.utils;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/25.
 */
public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
