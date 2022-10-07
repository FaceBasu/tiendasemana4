package com.tienda.controller;

import com.tienda.dominio.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private CleinteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var texto="Estamos en semana 4";
        model.addAttribute("saludo", texto);
        
        Cliente cliente1 = new Cliente("Pedro", "Jimenez Retana", "pjimenez@gmail.com", "88888888");
        Cliente cliente2 = new Cliente("Juan", "Retana Jimenez", "pretana@gmail.com", "88888887");
        Cliente cliente3 = new Cliente("Pablo", "Jerez Rodriguez", "pjerez@gmail.com", "88888886");
        var clientes=Arrays.asList(cliente1, cliente2, cliente3);
        
        
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
    
}
