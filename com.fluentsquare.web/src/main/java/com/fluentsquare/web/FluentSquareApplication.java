package com.fluentsquare.web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.fluentsquare.web.pages.HomePage;

public class FluentSquareApplication extends WebApplication
{

	@Override
	public Class<? extends Page> getHomePage()
	{
		return HomePage.class;
	}
}
