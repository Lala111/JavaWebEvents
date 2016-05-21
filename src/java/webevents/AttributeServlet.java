package webevents;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttributeServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AttributeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AttributeServlet at " + request.getContextPath() + "</h1>");
            String Name = request.getParameter("name");
            String Value = request.getParameter("value");
            String Scope = request.getParameter("scope");
            String Action = request.getParameter("action");
            if (Scope.equals("application") && Action.equals("add")) {
                getServletContext().setAttribute(Name, Value);
                out.println("Attribute added to application " + Name + " " + Value);
            }
            if (Scope.equals("application") && Action.equals("replace")) {
                getServletContext().setAttribute(Name, Value);
                out.println("Attribute replaced to application " + Name + " " + Value);
            }
            if (Scope.equals("application") && Action.equals("remove")) {
                getServletContext().setAttribute(Name, Value);
                out.println("Attribute removed from application " + Name + " " + Value);
            }
            if (Scope.equals("session") && Action.equals("add")) {
                request.getSession().setAttribute(Name, Value);
                out.println("Attribute added to session " + Name + " " + Value);
            }
            if (Scope.equals("session") && Action.equals("replace")) {
                request.getSession().setAttribute(Name, Value);
                out.println("Attribute replaced to session " + Name + " " + Value);
            }
            if (Scope.equals("session") && Action.equals("remove")) {
                request.getSession().setAttribute(Name, Value);
                out.println("Attribute removed from session " + Name + " " + Value);
            }
            if (Scope.equals("request") && Action.equals("add")) {
                request.setAttribute(Name, Value);
                out.println("Attribute added to request " + Name + Value);
            }
            if (Scope.equals("request") && Action.equals("replace")) {
                request.setAttribute(Name, Value);
                out.println("Attribute replaced to request " + Name + " " + Value);
            }
            if (Scope.equals("request") && Action.equals("remove")) {
                request.setAttribute(Name, Value);
                out.println("Attribute removed from request " + Name + " " + Value);
            }
            out.println("</body>");
            out.println("</html>");
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
