package com.creat.secret.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/25.
 */
public class CustomDateConverter implements Converter<String,Date> {


    public Date convert(String s) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
