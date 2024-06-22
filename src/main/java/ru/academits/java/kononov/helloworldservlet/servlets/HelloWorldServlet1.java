package ru.academits.java.kononov.helloworldservlet.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;

@WebServlet(
        value = "/servlet1",
        initParams = {
                @WebInitParam(name = "name1", value = "value1"),
                @WebInitParam(name = "name2", value = "value2")
        }
)
public class HelloWorldServlet1 extends HttpServlet {
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
                "name1",
                getInitParameter("name1"),
                "name2",
                getInitParameter("name2"),
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
