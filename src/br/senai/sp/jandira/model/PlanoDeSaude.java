package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PlanoDeSaude {

    private String operadora;
    private String categoria;
    private LocalDate validade;
    private String numero;
    private Integer codigo = 0001;
    private static int quantidade;
    
    

    //criar construtores
    public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
        this.operadora = operadora;
        this.numero = numero;
        this.validade = validade;
        this.categoria = categoria;
        this.quantidade++;
        
    }

    public PlanoDeSaude() {
        this.quantidade++;
    }

    //Setter and getters
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
  

}
