package io.github.badgateway12.servlet;

import io.github.badgateway12.service.EvaluatorService;
import io.github.badgateway12.stringHelper.StringHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EvaluatorServlet extends AppServlet {
    private EvaluatorService service;

    public EvaluatorServlet() { }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.service = (EvaluatorService) config.getServletContext().getAttribute("evaluatorService");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String expression = request.getParameter("expression");
            String result = service.evaluate(expression);
            String layout = getLayout("result");
            Map<String, String> patternReplacement = new HashMap<>();
            patternReplacement.put("expression", expression);
            patternReplacement.put("result",result);
            String view = StringHelper.replace(layout, patternReplacement);
            renderView(response, view);
        } catch (IllegalArgumentException e) {
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("/error").forward(request, response);
        }
    }
}
