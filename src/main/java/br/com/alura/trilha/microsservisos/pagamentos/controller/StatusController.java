package br.com.alura.trilha.microsservisos.pagamentos.controller;

import br.com.alura.trilha.microsservisos.pagamentos.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {

    public StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }
    @PostMapping ("cadastrar/{nome}")
    public void cadastrar(@PathVariable String nome){
        statusService.criarStatus(nome);
    }
}
