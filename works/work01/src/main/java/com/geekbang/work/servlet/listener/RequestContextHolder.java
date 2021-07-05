package com.geekbang.work.servlet.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * 请求上下文
 *
 * @author liuwei   2021-07-05
 * @since  1.0.0
 */
public class RequestContextHolder implements ServletRequestListener {

    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();

    public static HttpServletRequest getRequest() {
        return requestHolder.get();
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        requestHolder.set((HttpServletRequest) sre.getServletRequest());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        requestHolder.remove();
    }

}
