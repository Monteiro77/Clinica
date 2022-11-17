 package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    public static int contador = 709;
    private Integer codigo;
    private String nomeMedico;
    private Especialidade[] especialidades;
    private String telefoneMedico;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    
    
    
    //Contrutores
    
    public Medico(String crm, String nomeMedico, String telefoneMedico, String email, LocalDate dataDeNascimento){
        
        this.crm = crm;
        this.nomeMedico = nomeMedico;
        this.telefoneMedico = telefoneMedico;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        
        gerarCodigo();
    }
    
   public Medico(){
       gerarCodigo();
   }
   
   public void gerarCodigo(){
       this.contador++;
       this.codigo = contador;
   }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public Especialidade[] getEspecialidades() {
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
    
    

}
