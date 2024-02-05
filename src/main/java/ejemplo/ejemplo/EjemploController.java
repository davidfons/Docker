package ejemplo.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;

public class EjemploController {

    @GetMapping("")
    public String index() {
        return "Ejemplo";
    }
    
}
