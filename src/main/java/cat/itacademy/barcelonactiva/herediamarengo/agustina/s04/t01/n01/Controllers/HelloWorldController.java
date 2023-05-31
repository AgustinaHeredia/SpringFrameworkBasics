package cat.itacademy.barcelonactiva.herediamarengo.agustina.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
	    return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
	}

	@GetMapping("/HelloWorld2/{nombre}")
	public String saluda2(@PathVariable(required = false) String nombre) {
	    if (nombre == null) {
	        nombre = "UNKNOWN";
	    }
	    return "Hola, " + nombre + ". Estás ejecutando un proyecto Maven";
	}


}
