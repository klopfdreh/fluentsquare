package com.fluentsquare.web;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.wicket.protocol.http.WicketFilter;

@WebFilter(displayName = "FluentSquare", filterName = "fluentsquare", urlPatterns = "/*", initParams = {
		@WebInitParam(name = "applicationClassName", value = "com.fluentsquare.web.FluentSquareApplication") })
public class WicketInitFilter extends WicketFilter
{
}
