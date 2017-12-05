/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import ontology.OntoClass;
import ontology.OntoIndividual;

/**
 *
 * @author Victor
 */
@ManagedBean(name="classBean")
public class ClassBean {

    private String nome;

    public ClassBean() {
    }

    public String getNome() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R7pmm8WpDKzV6uxkTQX8N2r");
        this.nome = ontoClass.getLabel();
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
