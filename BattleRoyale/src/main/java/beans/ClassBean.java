/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import ontology.OntoIndividual;

/**
 *
 * @author Pichau
 */
@ManagedBean(name="classBean")
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
