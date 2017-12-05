/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
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
    private List<OntoIndividual> acoes;
    private List<OntoIndividual> condicoes;
    private List<OntoIndividual> mapas;
    private List<OntoIndividual> personagens;

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
    
    public List<OntoIndividual> getAcoes(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R9fbSoZ8jtVpMIREteazOyc");
        this.acoes = ontoClass.getIndividuals();
        return this.acoes;
    }
    
    public List<OntoIndividual> getCondicoes(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RCnktEYsOF1yGqvhWobfdlK");
        this.condicoes = ontoClass.getIndividuals();
        return this.condicoes;
    }
    
    public List<OntoIndividual> getMapas(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R7pmm8WpDKzV6uxkTQX8N2r");
        this.mapas = ontoClass.getIndividuals();
        return this.mapas;
    }
    
    public List<OntoIndividual> getPersonagens(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R9qKrbUMVakzRjJlgJQcVor");
        this.personagens = ontoClass.getIndividuals();
        return this.personagens;
    }
}
