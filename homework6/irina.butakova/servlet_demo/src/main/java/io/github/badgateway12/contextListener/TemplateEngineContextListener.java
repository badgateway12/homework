package io.github.badgateway12.contextListener;

import io.github.badgateway12.servlet.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TemplateEngineContextListener implements ServletContextListener {
    public TemplateEngineContextListener() { }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.setAttribute("templateEngine", new TemplateEngine(context));
    }
}

