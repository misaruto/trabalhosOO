/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author misael
 */
public class Disciplina {

    private String nome;
    private int semestre;
    private String horario;
    private String diasDaSemana;
    private String horaInicio;
    private String duracao;

    public Disciplina() {
        this.nome = "";
        this.semestre = 0;
        this.horario = "";//Manhã tarde ou noite
        this.diasDaSemana = "";
        this.horaInicio = "";
        this.duracao = "";
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the diasDaSemana
     */
    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    /**
     * @param diasDaSemana the diasDaSemana to set
     */
    public void setDiasDaSemana(String diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void copiar(Disciplina outra) {
        this.nome = outra.getNome();
        this.semestre = outra.getSemestre();
        this.diasDaSemana = outra.getDiasDaSemana();
        this.duracao = outra.getDuracao();
        this.horaInicio = outra.getHoraInicio();
        this.horario = outra.getHorario();
    }

}
