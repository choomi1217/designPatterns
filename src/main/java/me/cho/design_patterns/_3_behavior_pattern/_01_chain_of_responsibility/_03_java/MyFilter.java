package me.cho.design_patterns._3_behavior_pattern._01_chain_of_responsibility._03_java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Hi Filter");
        chain.doFilter(request, response);
    }
}
