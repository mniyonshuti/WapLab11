package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet(name = "calculate", urlPatterns = {"/", "/index"})
public class CalculatorNumberTwo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sum = 0;
        int product = 0;
        PrintWriter out = resp.getWriter();
        String firstNumber = req.getParameter("firstNumber");
        String secondNumber = req.getParameter("secondNumber");
        String firstNumber2 = req.getParameter("firstNumber2");
        String secondNumber2 = req.getParameter("secondNumber2");

        String htmlResponse = "<html><!DOCTYPE html>\n <html lang=\"en\">\n <head>\n  <meta charset=\"UTF-8\">\n" +
                "<title>CalculatorNumberTwo</title>\n </head><body><form action=\"home\" method=\"get\"><p>";
        if(firstNumber != "" || secondNumber != ""){
            sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            htmlResponse += "<input type=\"number\" name=\"firstNumber\" value=" + firstNumber+ "> + ";
            htmlResponse += "<input type=\"number\" name=\"secondNumber\" value=" + secondNumber + "><span> = ";
            htmlResponse += "<input type=\"number\" name=\"sum\" value=" + sum + " readonly></span></p>";
        }
        else {
            htmlResponse += "<input type=\"number\" name=\"firstNumber\" value=" + firstNumber+ "> + ";
            htmlResponse += "<input type=\"number\" name=\"secondNumber\" value=" + secondNumber + "><span> = ";
            htmlResponse += "<input type=\"number\" name=\"sum\" value=\" \" readonly></span></p>";
        }
        if(firstNumber2 != "" || secondNumber2 != ""){
            product = Integer.parseInt(firstNumber2) * Integer.parseInt(secondNumber2);
            htmlResponse += "<input type=\"number\" name=\"firstNumber2\" value=" + firstNumber2+ "> * ";
            htmlResponse += "<input type=\"number\" name=\"secondNumber2\" value=" + secondNumber2 + "><span> = ";
            htmlResponse += "<input type=\"number\" name=\"sum\" value=" + product + " readonly></span></p>";
        }
        else {
            htmlResponse += "<input type=\"number\" name=\"firstNumber\" value=" + firstNumber2+ "> * ";
            htmlResponse += "<input type=\"number\" name=\"secondNumber\" value=" + secondNumber2 + "><span> = ";
            htmlResponse += "<input type=\"number\" name=\"sum\" value=\" \" readonly></span></p>";
        }
        if((firstNumber == "" || secondNumber == "") && (firstNumber2 == "" || secondNumber2 == "") ){
            htmlResponse += "<p> You did not enter any value </p>";
        }
        htmlResponse += "<p><input type=\"submit\" value=\"Calculate\"></p> </form></body></html>";
        out.println(htmlResponse);
    }

}
