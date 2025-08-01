package tp.mini_spring_app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tp.mini_spring_app.service.CalculService;

@RestController
@RequestMapping(value="/calcul" , headers="Accept=application/json")
public class CalculRestController {
	
	@Autowired
	private CalculService calculService;
	
	
	@GetMapping("/moyenne")
	public double getMoyenne(@RequestParam("x")Double x,@RequestParam("y")Double y) {
		return this.calculService.moyenne(x, y);
	}

}
