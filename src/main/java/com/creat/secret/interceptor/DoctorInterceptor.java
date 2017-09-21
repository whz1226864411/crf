package com.creat.secret.interceptor;

import com.creat.secret.po.Doctor;
import com.creat.secret.po.Message;
import com.creat.secret.po.PatientAccount;
import net.sf.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/9/5.
 */
public class DoctorInterceptor extends LoginInterceptor{

    @Override
    public boolean alreadyLogin(HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession();
        Doctor doctor = (Doctor) session.getAttribute("doctor");
        String url = httpServletRequest.getRequestURI();
        if(url.contains("/doctor/login")){
            return true;
        }
        if(doctor != null){
            return true;
        }else {
            return false;
        }
    }
}
