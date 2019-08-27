package cn.yzkj.controller;

import cn.yzkj.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

//获取保存在ThreadLocal中的用户信息
public class LeadUser {
    public User getUserDetails() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        System.out.println(auth);
        return (User)auth.getPrincipal();
    }
}
