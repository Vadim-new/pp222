package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, HttpServletRequest request) {
        int count = carService.listCars().size();
        try {
            count = Integer.parseInt(request.getParameter("count"));
        } catch (Exception e) {
        }
        List<Car> cars = carService.listCarsByLimit(count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
