package com.ivoyant;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
public class Multiply extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int number1 =Integer.parseInt(request.getParameter("number1"));
        int number2 =Integer.parseInt(request.getParameter("number2"));
        response.getWriter().println(number1*number2);
    }
}