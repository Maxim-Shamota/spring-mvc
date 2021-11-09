package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
	@Autowired
	private CarService carService;

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(defaultValue = "5", value = "count", required = false) int count
			,ModelMap model) {

		List<Car> cars = carService.get(count);
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}