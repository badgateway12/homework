package io.github.badgateway12.servlet;

import javax.servlet.ServletContext;
import java.io.IOException;

public class TemplateEngine {

    private final ServletContext context;

    public TemplateEngine(ServletContext context) {
        this.context = context;
    }

    String getLayout(String layoutName) throws IOException {
        return new String(context
                .getResourceAsStream("/WEB-INF/" + layoutName + ".html")
                .readAllBytes());
    }
}
