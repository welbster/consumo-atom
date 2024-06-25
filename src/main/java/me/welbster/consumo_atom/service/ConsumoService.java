package me.welbster.consumo_atom.service;

import me.welbster.consumo_atom.domain.model.Consumo;

public interface ConsumoService {

    Consumo findById(Long numero);

    Consumo create(Consumo consumoToCreate);

}
