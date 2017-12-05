/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import ontology.OntoIndividual;

/**
 *
 * @author Pichau
 */
@Named(value = "classBean")
@Dependent
public class ClassBean {

    private String nome;

    public ClassBean() {
    }

    public String getNome() {
        OntoIndividual ontoInd = new OntoIndividual("AWM");
        this.nome = ontoInd.getIdentifier();    
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
