package com.fluentsquare.web.pages;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.resource.CssResourceReference;

public class HomePage extends WebPage
{

	private static final long serialVersionUID = 1L;

	@Override
	public void renderHead(IHeaderResponse response)
	{
		super.renderHead(response);
		response.render(
			CssHeaderItem.forReference(new CssResourceReference(HomePage.class, "main.css")));
	}
}
