package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 813793
 */
@WebServlet(urlPatterns = {"/ArithmeticCalculatorSevlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ArithmeticCalculatorSevlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ArithmeticCalculatorSevlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        System.out.println("ArithmeticCalculatorServlet is running");
        
        
        String firstValue = request.getParameter("first");
        String secondValue = request.getParameter("second");
        System.out.println("first value: " + firstValue);
        System.out.println("second value: " + secondValue);
        int firstValue2 = 0;
        int secondValue2 = 0; 
        int result = 0;
        
        
        
        if(firstValue != null && secondValue != null && firstValue !="" && secondValue !="" ){
            request.setAttribute("firstValue", firstValue);
            request.setAttribute("secondValue", secondValue);
            String btnVal = request.getParameter("mathematic");
            
            try
            {
            firstValue2 = Integer.parseInt(firstValue);
            secondValue2 = Integer.parseInt(secondValue);
            }
            catch(NumberFormatException e)
            {
                request.setAttribute("result","<p>Result: invalid</p>");
                getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            }
                    
            if(btnVal.compareTo("add") == 0)
                    {
                        result = firstValue2 + secondValue2;
                    }
            else if(btnVal.compareTo("sub") == 0)
                    {
                        result = firstValue2 - secondValue2;
                    }
            else if(btnVal.compareTo("mult") == 0)
                    {
                        result = firstValue2*secondValue2;
                    }
            else if(btnVal.compareTo("div") == 0)
                    {
                        result = firstValue2/secondValue2;
                    }
            
            
            
           request.setAttribute("result","<p>Result: "+ result + "</p>");
           getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
            
            
            
 
        }
        else if (firstValue == null && secondValue == null)
        {
            
            request.setAttribute("result","<p>Result: --</p>");
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }else if (firstValue == null || secondValue == null || firstValue == "" || secondValue == "")
        {
            request.setAttribute("firstValue", firstValue);
            request.setAttribute("secondValue", secondValue);
            request.setAttribute("result","<p>Result: invalid</p>");
            getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        }
        
      
        
        
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}


