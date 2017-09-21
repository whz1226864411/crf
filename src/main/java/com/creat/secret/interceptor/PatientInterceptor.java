package com.creat.secret.interceptor;

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
 * Created by Administrator on 2017/9/4.
 */
public class PatientInterceptor extends LoginInterceptor{

    @Override
    public boolean alreadyLogin(HttpServletRequest httpServletRequest) {
        HttpSession session = httpServletRequest.getSession();
        PatientAccount patientAccount = (PatientAccount) session.getAttribute("patientAccount");
        if(patientAccount != null){
            return true;
        }else {
            return false;
        }
    }
}
