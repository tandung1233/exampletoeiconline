package vn.tandung.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Home-servlet")
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        List<String> listStudent = new ArrayList<>();
        listStudent.add("Student 1");
        listStudent.add("Student 2");
        listStudent.add("Student 3");
        out.print("<table>");
        for(String item:listStudent){
            out.println("<tr>");
            out.println("<td>");
            out.println("<h1>"+item+"</h1>");
            out.println("</td>");
            out.println("</tr>");
        }
        out.print("</table>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Hello</h1>");
    }

}
