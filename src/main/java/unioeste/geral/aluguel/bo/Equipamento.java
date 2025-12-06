package unioeste.geral.aluguel.bo;

import java.io.Serializable;

public class Equipamento implements Serializable {
    private Long id;
    private String nome;
    private Double valorDiaria;
    private TipoEquipamento tipoEquipamento;

    public Equipamento() {
    }

    public Equipamento(Long id, String nome, Double valorDiaria, TipoEquipamento tipoEquipamento) {
        this.id = id;
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.tipoEquipamento = tipoEquipamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public TipoEquipamento getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }
}
