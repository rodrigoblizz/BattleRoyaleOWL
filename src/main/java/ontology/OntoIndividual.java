package ontology;

import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.search.EntitySearcher;

public class OntoIndividual extends OntoEntity {

    private OWLNamedIndividual owlIndividual;

    public OntoIndividual(OWLIndividual individual) {
        super();
        owlIndividual = individual.asOWLNamedIndividual();
    }

    public OntoIndividual(String id) {
        super();
        IRI iri = IRI.create(id);
        owlIndividual = ontoModel.getFactory().getOWLNamedIndividual(iri);
    } 

    public String getIdentifier() {
        return owlIndividual.toStringID();
    }
    
    public String getLabel() {
        return getLabel(owlIndividual);
    }
    
    public String getComment() {
        return getComment(owlIndividual);
    }
    
    public List<OntoClass> getTypes() {
        List<OntoClass> typeList = new ArrayList<OntoClass>();
        Set<OWLClassExpression> types = (Set<OWLClassExpression>) EntitySearcher.getTypes(owlIndividual, ontoModel.getOntology());
        for(OWLClassExpression cls : types) {
            String key = cls.asOWLClass().toStringID();
            typeList.add(new OntoClass(key));
        }
       return typeList;
    }

    /*
    Esses dois últimos métodos não consegui resolver o problema
    Troquei a implementação original pela recomendada "Multimap"
    Mas dá problema pra adicionar na List "properties"
    Talvez seja o construtor da classe OntoDataProperty deva ser modificado
    */
    
    public List<OntoObjectProperty> getObjectProperty() {
        List<OntoObjectProperty> properties = new ArrayList<OntoObjectProperty>();
        Map<OWLObjectPropertyExpression, Set<OWLIndividual>> objectPropertyValues
                = EntitySearcher.getObjectPropertyValues(owlIndividual, property, ontoModel.getOntology());
        
        for (Map.Entry<OWLObjectPropertyExpression, Set<OWLIndividual>> entry : objectPropertyValues.entrySet()) {
            properties.add(new OntoObjectProperty(entry));
        }
        return properties;
    }

    public List<OntoDataProperty> getDataProperty() {
        List<OntoDataProperty> properties = new ArrayList<OntoDataProperty>();
        Multimap<OWLDataPropertyExpression, OWLLiteral> dataPropertyValues = EntitySearcher.getDataPropertyValues(owlIndividual, ontoModel.getOntology());
        
        for(Map.Entry<OWLDataPropertyExpression, OWLLiteral> entry : dataPropertyValues.entries()) {
            properties.add(new OntoDataProperty(entry));
        }
        return properties;
    }

}