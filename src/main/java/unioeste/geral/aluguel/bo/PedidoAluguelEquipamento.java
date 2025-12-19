package unioeste.geral.aluguel.bo;

import java.io.Serializable;
import java.time.LocalDate;

public class PedidoAluguelEquipamento implements Serializable {
    private Long id;
    private String nroAluguel;
    private LocalDate dataPedido;
    private LocalDate dataInicioLocacao;
    private LocalDate dataPrevistoDevolucao;
    private Double valorDiaria;
    private Double valorLocacao;

    private Equipamento equipamento;
    private Cliente cliente;

    public PedidoAluguelEquipamento() {
    }

    public PedidoAluguelEquipamento(Long id, String nroAluguel, LocalDate dataPedido, LocalDate dataInicioLocacao, LocalDate dataPrevistoDevolucao, Double valorDiaria, Double valorLocacao, Equipamento equipamento, Cliente cliente) {
        this.id = id;
        this.nroAluguel = nroAluguel;
        this.dataPedido = dataPedido;
        this.dataInicioLocacao = dataInicioLocacao;
        this.dataPrevistoDevolucao = dataPrevistoDevolucao;
        this.valorDiaria = valorDiaria;
        this.valorLocacao = valorLocacao;
        this.equipamento = equipamento;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNroAluguel() {
        return nroAluguel;
    }

    public void setNroAluguel(String nroAluguel) {
        this.nroAluguel = nroAluguel;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataInicioLocacao() {
        return dataInicioLocacao;
    }

    public void setDataInicioLocacao(LocalDate dataInicioLocacao) {
        this.dataInicioLocacao = dataInicioLocacao;
    }

    public LocalDate getDataPrevistoDevolucao() {
        return dataPrevistoDevolucao;
    }

    public void setDataPrevistoDevolucao(LocalDate dataPrevistoDevolucao) {
        this.dataPrevistoDevolucao = dataPrevistoDevolucao;
    }

    public Double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
