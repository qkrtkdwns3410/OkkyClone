package kr.or.bit.user.service;

import kr.or.bit.user.action.Action;
import kr.or.bit.user.action.ActionForward;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.attribute.FileOwnerAttributeView;

/*
 
 */
public class memberDetailGoService implements Action{
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response){
        ActionForward forward = new ActionForward();
    
        forward.setRedirect(false);
        forward.setPath("/WEB-INF/views/memberDetail.jsp");
        return forward;
    }
    
}

























