package me.welbster.consumo_atom.controller;

import me.welbster.consumo_atom.domain.model.Consumo;
import me.welbster.consumo_atom.service.ConsumoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/atom")
public class ConsumoController {

    private final ConsumoService consumoService;

    public ConsumoController(ConsumoService consumoService) {
        this.consumoService = consumoService;
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Consumo> findById(@PathVariable Long numero){
        Consumo consumo = consumoService.findById(numero);
        return ResponseEntity.ok(consumo);
    }

    @PostMapping
    public ResponseEntity<Consumo> create(@RequestBody Consumo consumoToCreate){
        Consumo consumoCreated = consumoService.create(consumoToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{numero}")
                .buildAndExpand(consumoCreated.getNumero())
                .toUri();
        return ResponseEntity.created(location).body(consumoCreated);
    }
}
