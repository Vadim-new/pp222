package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    public CarsController(@Autowired CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, HttpServletRequest request) {
        int count = carService.getCarsList().size();
        try {
            count = Integer.parseInt(request.getParameter("count"));
        } catch (Exception e) {
        }
        List<Car> cars = carService.getCarsListByLimit(count);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
