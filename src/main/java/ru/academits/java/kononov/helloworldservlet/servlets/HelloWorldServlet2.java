package ru.academits.java.kononov.helloworldservlet.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

public class HelloWorldServlet2 extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        resp.getWriter().println("""
                            <!DOCTYPE html>
                            <head>
                                <meta charset="UTF-8">
                                <title>Hello World Servlet 2</title>
                            </head>
                            <body>
                            <table>
                                <thead>
                                <tr>
                                    <th>Parameter name</th>
                                    <th>Parameter value</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>%s</td>
                                    <td>%s</td>
                                </tr>
                                <tr>
                                    <td>%s</td>
                                    <td>%s</td>
                                </tr>
                                <tr>
                                    <td>%s</td>
                                    <td>%s</td>
                                </tr>
                                <tr>
                                    <td>%s</td>
                                    <td>%s</td>
                                </tr>
                                </tbody>
                            </body>
                """.formatted(
                "name3",
                getInitParameter("name3"),
                "name4",
                getInitParameter("name4"),
                "name5",
                getServletContext().getInitParameter("name5"),
                "name6",
                getServletContext().getInitParameter("name6")
        ));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
