/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author misael
 */
public class Turmas {

    private Professor professor;
    private List<Aluno> lstAlunos;
    private Disciplina disciplina;

    public Turmas() {
        this.professor = new Professor();
        this.disciplina = new Disciplina();
        this.lstAlunos = new ArrayList<>();
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the lstAlunos
     */
    public List<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    /**
     * @param lstAlunos the lstAlunos to set
     */
    public void setLstAlunos(List<Aluno> lstAlunos) {
        this.lstAlunos = lstAlunos;
    }

    public void copiar(Turmas outra) {
        this.professor = outra.getProfessor();
        this.lstAlunos = outra.getLstAlunos();
        this.disciplina = outra.getDisciplina();

    }

    public void imprimir() {
        System.out.print(this.professor + " " + this.disciplina);
        for (int i = 0; i < lstAlunos.size(); i++) {
            this.lstAlunos.get(i).imprimir();
        }
    }
}
