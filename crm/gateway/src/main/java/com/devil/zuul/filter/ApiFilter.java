package com.devil.zuul.filter;

import com.google.common.base.Strings;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ApiFilter extends ZuulFilter {
    @Override
    //过滤类型 pre:路由之前  routing:路由之时  post:路由之后 error:发生错误调用
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();//获取request
        String token=request.getParameter("token");
        String path=request.getRequestURI();//获取请求路径
        if(!path.equals("/api/login")&&(Strings.isNullOrEmpty(token)||"null".equals(token))){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try{
                context.getResponse().getWriter().write("token is invalid");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}