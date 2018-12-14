package io.github.badgateway12.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class AppServlet extends HttpServlet {
    private TemplateEngine templateEngine;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.templateEngine = (TemplateEngine) config.getServletContext().getAttribute("templateEngine");
    }

    String getLayout(String layoutName) throws IOException {
        return templateEngine.getLayout(layoutName);
    }

    void renderView(HttpServletResponse resp, String view) throws IOException {
        PrintWriter writer = resp.getWriter();
        writer.print(view);
    }
}
