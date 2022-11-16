/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.reto10a;

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
@WebServlet("/NFT")
public class NftServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Jaime Andres Muñoz, Juan David Vasquez</title>");            
            out.println(" <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">	");
             out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />");
              out.println("</head>");
            out.println("<body>");
            out.println(" <style>");
            out.println("body{\n" +
            "    background-color: beige;\n" +
            "}");
            out.println("h1{\n" +
            "  color: blueviolet;\n" +
            "}");
            out.println("a{\n" +
            "    color: darkblue;\n" +
            "}");
            out.println("</style>");
            
            
            out.println("<h1>NFT</h1>");
            out.println(" <form action=\"Hola\" method=\"get\">");
            out.println("<p> Los NFTs o tokens no fungibles (Non Fungible Token en inglés) son representaciones inequívocas de activos,\n" +
"                 tanto digitales como físicos, en la red blockchain. </p>");
            out.println("<p> Usan la misma tecnología que las criptomonedas,\n" +
"            pero al contrario que estas, no se pueden dividir ni intercambiar entre sí, pero sí se pueden comprar y vender.</p>");
            out.println("  <a href=\"https://www.santander.com/es/stories/que-son-los-nft\" target=\"_blank\">click aqui</a>");
            out.println("<p><strong>si quieres saber mas del origen de los nft dar clic en el siguiente enlace</strong></p>");
            out.println("<a href=\"https://www.telefonica.com/es/sala-comunicacion/el-origen-de-los-nfts-y-por-que-estan-cambiando-el-mundo-digital/#:~:text=Estos%20activos%20digitales%20nacieron%20hacia,NFTs%20y%20comerciar%20con%20ellos.\" target=\"_blank\">click aqui</a>");
            out.println("<h1>¿Para que sirven?</h1>");
            out.println("<p>Los nfts estan en cosas que no nos imaginamos, un ejemplo de esto seria el arte</p>");
            out.println("<p>para esta rama los nfts tienen la funcion de facilitar la venta obras de arte ya que puede ser transformado facilmente y vender como cualquier obra fisica</p>");
            out.println("<p><strong>si quieres saber mas sobre la funcion de los nft en el arte dar clic en el siguiente enlace</strong></p>");
            out.println("<a href=\"https://blogthinkbig.com/que-son-sirven-nfts\" target=\"_blank\">click aqui</a>");
            out.println("<p>Los NFTs tambien han influenciado en el mundo de los videojuegos</p>");
            out.println(" <p>trayendolo de forma divertida una manera de generar ingresos a los amantes de estos.  </p>");
            out.println("<p>Hay una increible cantidad de juegos que implementan los NFTs y se busca que en el futuro hallan muhos mas</p>");
            
            out.println("<p><strong>si quieres saber mas sobre la funcion de los nft en los videojuegos dar clic en el siguiente enlace</strong></p>");
            out.println("<a href=\"https://academy.binance.com/es/articles/what-are-nft-games-and-how-do-they-work?utm_campaign=googleadsxacademy&utm_source=googleadwords_int&utm_medium=cpc&ref=HDYAHEES&gclid=CjwKCAiA68ebBhB-EiwALVC-No5cyJF54Ka_x2H9JQCNfdhz3EkTEJpoWCTick034sbw0vS5_YMeHhoCE7IQAvD_BwE\" target=\"_blank\">click aqui</a>");
            out.println(" <p><strong>si quieres saber mas sobre los mejores videojuegos que implementa NFTs dar clic en el siguiente enlace</strong></p>");
            out.println(" <a href=\"https://www.binance.com/es/nft/game-offering?ads=true&utm_source=googleadwords_int&utm_medium=cpc&utm_campaign=paid_NFT&ref=HDYAHEES&gclid=CjwKCAiA68ebBhB-EiwALVC-NnnSYWOND4hPObggOlYKUW0LmL0fRKefapj2JCt9uPh8WLdR6Ox84hoCEqcQAvD_BwE\" target=\"_blank\">click aqui</a>");
            out.println("<h1>¿Se puede generar mucho dinero con los NFTs?</h1>");
            out.println("<p>A lo largo de la historia de los NFTs siempre ha surgido esta duda en torno a estos, ya que la desconfianza con el dinero virtual siempre han estado en la sociedad,</p>");
            
            out.println(" <p>pero se ha mostrado que es una forma de inversion como cualquier otra, comparandolas con las criptomonedas que tambien han sido tema polemico entre las personas.</p>");
            out.println("<p><strong>por eso en el proximo link te mostrare algunos de los NFTs mejores vendidos en la actualidad</strong></p>");
            out.println("<a href=\"https://criptoinforme.com/nft/los-10-nft-mas-caros-de-la-historia/\" target=\"_blank\">click aqui</a>");
            out.println(" </form>");
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
