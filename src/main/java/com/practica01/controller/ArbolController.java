
package com.practica01.controller;

import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequestMapping("/arbol")
public class ArbolController {
    
    @Autowired
    ArbolService arbolservice;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        log.info("consumiendo el recurso /arbol/listado");
        List<Arbol> arboles = arbolservice.getarboles(false);
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalarboles",arboles.size());
        return "/arbol/listado";
    }
    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }

    }


