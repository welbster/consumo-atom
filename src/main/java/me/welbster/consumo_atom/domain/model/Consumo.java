package me.welbster.consumo_atom.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_consumo")
public class Consumo {

    @Id
    @Column(name = "numero_atomizador")
    private Long numero;

    @Column(name = "aplicador")
    private String aplicador;

    @Column(name = "gasolina")
    private Integer gasolina;

    @Column(name = "inseticida")
    private Integer inseticida;

    // Getters and Setters
    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getAplicador() {
        return aplicador;
    }

    public void setAplicador(String aplicador) {
        this.aplicador = aplicador;
    }

    public Integer getGasolina() {
        return gasolina;
    }

    public void setGasolina(Integer gasolina) {
        this.gasolina = gasolina;
    }

    public Integer getInseticida() {
        return inseticida;
    }

    public void setInseticida(Integer inseticida) {
        this.inseticida = inseticida;
    }
}
