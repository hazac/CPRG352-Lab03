package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazco
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        request.setAttribute("message", "Result: ---");
        request.getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        int num1 = 0;
        int num2 = 0;
        
        try{
            request.setAttribute("nm1", n1);
            request.setAttribute("nm2", n2);
            
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            
            if(request.getParameter("sum") != null){
            request.setAttribute("message", "Result: " + (num1 + num2));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else if (request.getParameter("subs") != null){
                request.setAttribute("message", "Result: " + (num1 - num2));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else if (request.getParameter("mult") != null){
                request.setAttribute("message", "Result: " + ( num1 * num2));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            else if (request.getParameter("mod") != null){
                request.setAttribute("message", "Result: " + (num1 % num2));
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
        catch(Exception e){
            request.setAttribute("message", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
        
        
    }

}
