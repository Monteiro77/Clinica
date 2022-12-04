 package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    public static int contador = 709;
    private Integer codigo;
    private String nomeMedico;
    private ArrayList<Especialidade> especialidades;
    private String telefoneMedico;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    
    
    
    
    //Contrutores
    
    public Medico(){
       gerarCodigo();
   }
    
    public Medico(String nome, String telefone, String email, String crm, ArrayList<Especialidade> especialidades, LocalDate dataDeNascimento) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

        this.nomeMedico = nome;
        this.telefoneMedico = telefone;
        this.email = email;
        this.crm = crm;
        this.especialidades = especialidades;
        gerarCodigo();
    }
    
    public Medico(String crm, String nome, String telefone, Integer codigo){
        
        this.crm = crm;
        this.nomeMedico = nome;
        this.telefoneMedico = telefone;
        this.codigo = codigo;
        
    }
    public Medico(String nome, String telefone, String email, String crm, String dataDeNascimento, Integer codigo, ArrayList<Especialidade> especialidades) {

        this.nomeMedico = nome;
        this.telefoneMedico = telefone;
        this.email = email;
        this.crm = crm;
        this.dataFormatada = dataDeNascimento;
        this.especialidades = especialidades;
        this.codigo = codigo;
        this.contador = codigo;
        
    }
    
   public void gerarCodigo(){
       this.contador++;
       this.codigo = contador;
   }

   
   //Getter e Setters
   
   
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public void setTelefoneMedico(String telefoneMedico) {
        this.telefoneMedico = telefoneMedico;
    }

    public String getTelefoneMedico() {
        return telefoneMedico;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getDataFormatada() {
        return dataFormatada;
    }
    
    public String arrayParaString(ArrayList<Especialidade> array) {
        ArrayList<String> codigos = new ArrayList<String>();
        for(Especialidade e : array){
            codigos.add(e.getCodigo().toString());
        }
        
        return String.join(";", codigos);
        
    }
    
    public String getDadosDoMedicoComPontoEVirgula() {

        return this.codigo + ";"
                + this.crm + ";"
                + this.nomeMedico + ";"
                + this.telefoneMedico + ";"
                + this.email + ";"
                + this.dataFormatada + ";"
                + arrayParaString(this.especialidades);
        
     }
    
    

}
