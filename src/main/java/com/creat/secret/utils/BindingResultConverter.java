package com.creat.secret.utils;

import com.creat.secret.po.Message;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/**
 * Created by Administrator on 2017/9/8.
 */
public class BindingResultConverter {

    public static Message wrapErrors(BindingResult result){
        Message message = new Message();
        message.setSuccess(false);
        StringBuilder errors = new StringBuilder();
        for(ObjectError error : result.getAllErrors()){
            errors.append(error.getDefaultMessage()+";");
        }
        message.setMessage(errors.toString());
        return message;
    }
}
