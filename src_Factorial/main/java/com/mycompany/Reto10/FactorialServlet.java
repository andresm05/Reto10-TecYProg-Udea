/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.Reto10;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Toshiba
 */

@WebServlet("/Hola")

public class FactorialServlet extends HttpServlet {
  
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    
    @Override
    
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    try{
    String numeros = request.getParameter("numero");
   if (numeros == null || numeros.isEmpty()) { try(PrintWriter out = response.getWriter())
{System.out.println("Imprimiendo HTML"); 
       out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
          out.println(" <title>Start Page</title>");
           out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
           out.println(" </head>");
             out.println("<body>");
             out.println("<h1>error, Valor invalido!</h1>");
               out.println(" </body>");
                 out.println("</html>");
                 }
}else{
    
    int numero = Integer.valueOf(request.getParameter("numero"));
    if(numero<0){ try(PrintWriter out = response.getWriter())
{System.out.println("Imprimiendo HTML"); 
       out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
          out.println(" <title>Start Page</title>");
           out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
           out.println(" </head>");
             out.println("<body>");
             out.println("<h1>error, el numero no puede ser negativo!</h1>");
               out.println(" </body>");
                 out.println("</html>");
                 }}else{
      
int n = factorial(numero);
response.setContentType("text/html;charset=UTF-8");
try(PrintWriter out = response.getWriter()){
System.out.println("Imprimiendo HTML");
out.println("<!DOCTYPE html>");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
         out.println("<title>Mi página de ejemplo</title>");   
         out.println("</head>");
         out.println("<body>");
         out.println(" <h1>Aquí va el contenido</h1>");
         out.println("<p> el numero " + numero + " en factorial es " + n + "</p>");
         out.println("</body>");
         out.println("</html>");
         }

}
  }
}

         catch(NumberFormatException e){ 
    try(PrintWriter out = response.getWriter())
{System.out.println("Imprimiendo HTML"); 
       out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
          out.println(" <title>Start Page</title>");
           out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
           out.println(" </head>");
             out.println("<body>");
             out.println("<h1>error, Valor invalido!</h1>");
               out.println(" </body>");
                 out.println("</html>");
                 }
       

        


}
}   


    
     
public static int factorial(int n) {
    double x;
       if(n==0){
       x=1;
   }else{ 
    x= n* factorial(n-1);
    }
   return (int) x;
}
}
