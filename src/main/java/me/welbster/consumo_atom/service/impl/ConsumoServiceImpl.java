package me.welbster.consumo_atom.service.impl;

import me.welbster.consumo_atom.domain.model.Consumo;
import me.welbster.consumo_atom.domain.repository.ConsumoRepository;
import me.welbster.consumo_atom.service.ConsumoService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ConsumoServiceImpl implements ConsumoService {

    private final ConsumoRepository consumoRepository;

    public ConsumoServiceImpl(ConsumoRepository consumoRepository) {
        this.consumoRepository = consumoRepository;
    }

    @Override
    public Consumo findById(Long numero) {
        return consumoRepository.findById(numero)
                .orElseThrow(() -> new NoSuchElementException("Consumo não encontrado com o número: " + numero));
    }

    @Override
    public Consumo create(Consumo consumoToCreate) {
        if(consumoRepository.existsByNumero(consumoToCreate.getNumero())) {
            throw new IllegalArgumentException("Este Consumo ID já existe.");
        }
        return consumoRepository.save(consumoToCreate);
    }
}
