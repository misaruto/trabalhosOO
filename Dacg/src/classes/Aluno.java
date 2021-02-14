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
public class Aluno extends Pessoa {

    private String matricula;
    private int anoIngresso;

    public Aluno() {

        this.matricula = "";
        this.anoIngresso = 0;

    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the anoIngresso
     */
    public int getAnoIngresso() {
        return anoIngresso;
    }

    /**
     * @param anoIngresso the anoIngresso to set
     */
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void copiar(Aluno outro) {
        super.setNome(outro.getNome());
        super.setIdade(outro.getIdade());
        super.setSexo(outro.getSexo());
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();
    }

    public void imprimir() {
        System.out.println(super.getNome()+" "+super.getIdade()+" "+super.getSexo()+ this.matricula + " " + this.anoIngresso);

    }

}
