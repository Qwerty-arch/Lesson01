package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/show_products")
public class Servlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Servlet.class);
    private List<Product> products;

    public Servlet() {
        products = new ArrayList<>();
    }

    // GET http://localhost:8080/jee/show_products
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        products.add(new Product(1,340,"apple"));
        products.add(new Product(2,440,"water"));
        products.add(new Product(3,990,"juice"));
        products.add(new Product(4,30,"gum"));
        products.add(new Product(5,300,"meat"));
        products.add(new Product(6,100,"onion"));
        products.add(new Product(7,900,"rice"));
        products.add(new Product(8,800,"fish"));
        products.add(new Product(9,370,"sausages"));
        products.add(new Product(10,110,"beer"));

      //  for (int j = 1; j <= 10; j++) {
            out.println("<html><body><h1>" + String.format("[ %d, %d, %s ]\n", products.get(2).getId(), products.get(2).getCost(), products.get(2).getTitle()) + "</h1></body></html>");
      //  }
        out.close();
    }


}
