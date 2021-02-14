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
public class Professor extends Pessoa{

  
    private String CPF;

    public Professor(){
      
        this.CPF = "";
        
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    
    public void copiar(Professor outro){
        super.setNome(outro.getNome());
        super.setIdade(outro.getIdade());
        super.setSexo(outro.getSexo());
        this.CPF = outro.getCPF();
    }
    public void imprimir(){
        System.out.println(super.getNome()+" "+super.getIdade()+" "+super.getSexo()+" "+this.CPF);
    }
}
