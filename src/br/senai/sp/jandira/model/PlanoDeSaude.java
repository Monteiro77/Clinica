package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlanoDeSaude {

    public static int contador = 10100;
    private String operadora;
    private String categoria;
    private LocalDate validade;
    private Integer codigo ;
    private String numero; 
    private DateTimeFormatter formatador;
    private String dataFormatada;
    
    
    

    //criar construtores
    public PlanoDeSaude(String operadora, String categoria, LocalDate validade,String numero) {
        this.operadora = operadora;
        this.validade = validade;
        this.categoria = categoria;
        this.numero = numero;
        
        gerarCodigo();
        
    }

    public PlanoDeSaude() {
        
        gerarCodigo();
    }
    
    public void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
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
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static int getContador() {
        return contador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }
    
    
}
