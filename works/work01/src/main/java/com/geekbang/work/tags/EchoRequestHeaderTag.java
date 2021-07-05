package com.geekbang.work.tags;

import com.geekbang.work.servlet.listener.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * 请求头标签
 *
 * @author liuwei   2021-07-05
 * @since  1.0.0
 */
public class EchoRequestHeaderTag extends SimpleTagSupport {

    private String name;

    @Override
    public void doTag() throws IOException {
        HttpServletRequest request = RequestContextHolder.getRequest();
        String header = request.getHeader(name);
        JspWriter out = getJspContext().getOut();
        out.println(name + "=" + header);
    }

    public void setName(String name) {
        this.name = name;
    }

}
