package com.indibu.indiBuserver.core;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class SessionUtil {
    public long getUserId(HttpServletRequest httpServletRequest) {
        return (long) httpServletRequest.getSession().getAttribute(Constants.USER_ID_SESSION_ATTRIBUTE);
    }
}
