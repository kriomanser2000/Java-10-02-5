package com.example.calcu1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
import java.util.*;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        double result = 0;
        switch (operation)
        {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0)
                {
                    result = num1 / num2;
                }
                else
                {
                    result = Double.NaN;
                }
                break;
            case "power":
                result = Math.pow(num1, num2);
                break;
            case "percentage":
                result = (num1 * num2) / 100;
                break;
            default:
                break;
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Result: " + result + "</h2>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body></html>");
        out.println("</body></html>");
    }
}
