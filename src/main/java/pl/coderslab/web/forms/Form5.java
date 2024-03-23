package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello post5");
        String tempConversion = req.getParameter("conversionType");
        double degrees = Double.parseDouble( req.getParameter("degrees"));
        if (tempConversion.equals("celcToFahr")){
            double tempFahrenheit = 32 + (1.8 * degrees);
            resp.getWriter().write(String.format("Temperatura Fahrenheit: %f", tempFahrenheit));
        } else if (tempConversion.equals("fahrToCelc")){
            double tempCelsius = (5d/9d) * (degrees - 32);
            resp.getWriter().write(String.format("Temperatura Celsius: %f", tempCelsius));
        }
    }
}


// od wykladowcy
//package pl.coderslab.web.post;
//
//        import javax.servlet.annotation.WebServlet;
//        import javax.servlet.http.HttpServlet;
//        import javax.servlet.http.HttpServletRequest;
//        import javax.servlet.http.HttpServletResponse;
//        import java.io.IOException;
//
//@WebServlet("/post5")
//public class Form5 extends HttpServlet {
//    private static final String FAHRENHEIT_TO_CELSIUS = "fahrToCelc";
//    private static final String CELSIUS_TO_FAHRENHEIT = "celcToFahr";
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        double temp = Double.parseDouble(req.getParameter("degrees"));
//        String conversionType = req.getParameter("conversionType");
//
//        switch (conversionType) {
//            case FAHRENHEIT_TO_CELSIUS:
//                double celsius = 5d/9 * (temp - 32);
//                resp.getWriter().write(String.format("Temp in celsius: %f", celsius));
//                break;
//            case CELSIUS_TO_FAHRENHEIT:
//                double fahrenheit = 32d + 9d/5 * temp;
//                resp.getWriter().write(String.format("Temp in fahrenheit: %f", fahrenheit));
//                break;
//            default:
//                resp.getWriter().write("Invalid conversion type");
//                break;
//        }
//    }
//}
