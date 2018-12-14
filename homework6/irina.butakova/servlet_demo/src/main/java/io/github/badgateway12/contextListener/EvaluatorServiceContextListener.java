package io.github.badgateway12.contextListener;

import io.github.badgateway12.service.EvaluatorService;
import io.github.badgateway12.service.components.Calculator;
import io.github.badgateway12.service.components.Tokenizer;
import io.github.badgateway12.service.components.Validator;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class EvaluatorServiceContextListener implements ServletContextListener {
    public EvaluatorServiceContextListener() { }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        var validator = new Validator();
        var tokenizer = new Tokenizer();
        var calculator = new Calculator();
        context.setAttribute("evaluatorService", new EvaluatorService(validator,  tokenizer, calculator));
    }
}
