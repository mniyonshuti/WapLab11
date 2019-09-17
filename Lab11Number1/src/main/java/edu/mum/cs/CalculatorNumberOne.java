package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CalculatorNumberOne  extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sum = 0;
        int product = 0;
        PrintWriter out = resp.getWriter();
        String firstNumber = req.getParameter("firstNumber");
        String secondNumber = req.getParameter("secondNumber");
        if(firstNumber != "" || secondNumber != ""){
            sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            out.println(firstNumber + " + " + secondNumber + " = " + sum);
        }
        else {
            out.println("");
        }
        String firstNumber2 = req.getParameter("firstNumber2");
        String secondNumber2 = req.getParameter("secondNumber2");

        if(firstNumber2 != "" || secondNumber2 != ""){
            product = Integer.parseInt(firstNumber2) * Integer.parseInt(secondNumber2);
            out.println(firstNumber2 + " * " + secondNumber2 + " = " + product);
        }
        else {
            out.println("");
        }
        if((firstNumber == "" || secondNumber == "") && (firstNumber2 == "" || secondNumber2 == "") ){
            out.println("No values entered");
        }
    }
}
