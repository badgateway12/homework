package io.github.badgateway12.servlet;

import io.github.badgateway12.stringHelper.StringHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ErrorServlet extends AppServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String errorMessage = (String) request.getAttribute("errorMessage");
        String layout = getLayout("error");
        String view = StringHelper.replace(layout, getReplacement(errorMessage));
        renderView(response, view);
    }

    private Map<String, String> getReplacement(String errorMessage) {
        Map<String, String> map = new HashMap<>();
        map.put("errorTitle", "Sorry, an error occurred");
        map.put("errorMessage", errorMessage);
        return map;
    }
}
