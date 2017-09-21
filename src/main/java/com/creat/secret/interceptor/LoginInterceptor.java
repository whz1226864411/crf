package com.creat.secret.interceptor;

import com.creat.secret.po.Message;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/9/6.
 */
public abstract class LoginInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        if(alreadyLogin(httpServletRequest)){
            return true;
        }else {
            sendLoginMessage(httpServletResponse);
            return false;
        }
    }

    private void sendLoginMessage(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter printWriter = httpServletResponse.getWriter();
        Message message = new Message();
        message.setSuccess(false);
        message.setMessage("您还未登录!");
        printWriter.write(JSONObject.fromObject(message).toString());
        printWriter.flush();
        printWriter.close();
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
    protected abstract boolean alreadyLogin(HttpServletRequest httpServletRequest);
}
