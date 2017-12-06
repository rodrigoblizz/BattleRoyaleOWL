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
    private List<OntoIndividual> aquaticos;
    private List<OntoIndividual> aereos;
    private List<OntoIndividual> terrestres;
    private List<OntoIndividual> pistolas;
    private List<OntoIndividual> revolveres;
    private List<OntoIndividual> espingardas;
    private List<OntoIndividual> riflesDeAssalto;
    private List<OntoIndividual> riflesDePrecisao;
    private List<OntoIndividual> submetralhadoras;
    private List<OntoIndividual> armasDeArremesso;
    private List<OntoIndividual> granadas;
    private List<OntoIndividual> acessorios;
    private List<OntoIndividual> calcas;
    private List<OntoIndividual> calcados;
    private List<OntoIndividual> camisas;
    private List<OntoIndividual> jaquetas;
    private List<OntoIndividual> cintosDeUtilidade;
    private List<OntoIndividual> mochilas;
    private List<OntoIndividual> capacetes;
    private List<OntoIndividual> coletes;
    private List<OntoIndividual> itensDeCura;
    private List<OntoIndividual> municoes;

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
    
    public List<OntoIndividual> getAquaticos(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/Rnkh7m14CS0cD3S25tXzJu");
        this.aquaticos = ontoClass.getIndividuals();
        return this.aquaticos;
    }
    
    public List<OntoIndividual> getAereos(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RBMrGoNcweUffXW0Hf9fVpu");
        this.aereos = ontoClass.getIndividuals();
        return this.aereos;
    }
    
    public List<OntoIndividual> getTerrestres(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R8QGPuFraTEspwmIorFuDO5");
        this.terrestres = ontoClass.getIndividuals();
        return this.terrestres;
    }
    
    public List<OntoIndividual> getPistolas(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RBpwhlSUFrsvlCE4AAupIYh");
        this.pistolas = ontoClass.getIndividuals();
        return this.pistolas;
    }
    
    public List<OntoIndividual> getRevolveres(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R94DvEDYPuqthjvAR1ITuE");
        this.revolveres = ontoClass.getIndividuals();
        return this.revolveres;
    }
    
    public List<OntoIndividual> getEspingardas(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RDGycl9R1Fs1rNKhkWJMm2T");
        this.espingardas = ontoClass.getIndividuals();
        return this.espingardas;
    }
    
    public List<OntoIndividual> getRiflesDeAssalto(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R8H98mWKZBN1T81e03GzWb");
        this.riflesDeAssalto = ontoClass.getIndividuals();
        return this.riflesDeAssalto;
    }
    
    public List<OntoIndividual> getRiflesDePrecisao(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RDxUIztyVKz973tS0C9NsMG");
        this.riflesDePrecisao = ontoClass.getIndividuals();
        return this.riflesDePrecisao;
    }
    
    public List<OntoIndividual> getSubmetralhadoras(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R5YBJtjoUOltxyq4zfwaXm");
        this.submetralhadoras = ontoClass.getIndividuals();
        return this.submetralhadoras;
    }
    
    public List<OntoIndividual> getArmasDeArremesso(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RiSupK1yu5Xn5IcHaLx0wG");
        this.armasDeArremesso = ontoClass.getIndividuals();
        return this.armasDeArremesso;
    }
    
    public List<OntoIndividual> getGranadas(){
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RBzVE5RO00Jr7EE999gVXlh");
        this.granadas = ontoClass.getIndividuals();
        return this.granadas;
    }

    public List<OntoIndividual> getAcessorios() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R80PSILEKHwGbYajCDCAmcn");
        this.acessorios = ontoClass.getIndividuals();
        return acessorios;
    }

    public List<OntoIndividual> getCalcas() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RbaauFKyViRZgHS02TQZKs");
        this.calcas = ontoClass.getIndividuals();
        return calcas;
    }

    public List<OntoIndividual> getCalcados() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R9ZsLUySpegVZ1esr6ISmBY");
        this.calcados = ontoClass.getIndividuals();
        return calcados;
    }

    public List<OntoIndividual> getCamisas() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R873qT8aAbUP3sbKepopunV");
        this.camisas = ontoClass.getIndividuals();
        return camisas;
    }

    public List<OntoIndividual> getJaquetas() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RgwT7tXjig5wnOnLyVEDRe");
        this.jaquetas = ontoClass.getIndividuals();
        return jaquetas;
    }

    public List<OntoIndividual> getCintosDeUtilidade() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RDaIXYgDzxDUgNY7nUCRdYI");
        this.cintosDeUtilidade = ontoClass.getIndividuals();
        return cintosDeUtilidade;
    }

    public List<OntoIndividual> getMochilas() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R8tpO1bC6klcimJz3SoaJ9R");
        this.mochilas = ontoClass.getIndividuals();
        return mochilas;
    }

    public List<OntoIndividual> getCapacetes() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/R7izfzwjTI5bvlPft3i0lpN");
        this.capacetes = ontoClass.getIndividuals();
        return capacetes;
    }

    public List<OntoIndividual> getColetes() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RD1lLEbuSzhVNLDjBinzriC");
        this.coletes = ontoClass.getIndividuals();
        return coletes;
    }

    public List<OntoIndividual> getItensDeCura() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RCVUGH38HgwHTzUElROx363");
        this.itensDeCura = ontoClass.getIndividuals();
        return itensDeCura;
    }

    public List<OntoIndividual> getMunicoes() {
        OntoClass ontoClass = new OntoClass("http://webprotege.stanford.edu/RWa1qvknsor2rwKGie8ucv");
        this.municoes = ontoClass.getIndividuals();
        return municoes;
    }
    
    
}
