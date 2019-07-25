package com.revature.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * A filter's purpose is to yank requests away from their intended destinations in order
 * to perform some sort of authentication. For instance, you might want to make sure
 * that a user has a specific role before the request is sent to the intended servlet or
 * resource on your server.
 * 
 * In order for this to work, we have to map our filter to some resource in our web.xml.
 */
/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	/*
	 * Our filter's logic should go in our doFilter() method.
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/*
		 * We're casting the generic ServletRequest and ServletResponse objects as HttpServletRequest
		 * and HttpServletResponse objects.
		 */
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		/*
		 * Be careful here. If you don't pass in the boolean value "false", you're just
		 * handing a session to the user, which is NOT what we want to do in an
		 * authentication filter.
		 */
		HttpSession s = req.getSession(false);
		
		/*
		 * If the user doesn't have a session (in other words, the return session is null),
		 * let's just redirect them to the home page.
		 */
		if(s == null) {
			resp.sendRedirect("../index.html");
		}

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
