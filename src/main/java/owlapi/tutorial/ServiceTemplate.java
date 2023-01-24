package owlapi.tutorial;


import org.semanticweb.HermiT.ReasonerFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.openrdf.model.vocabulary.OWL;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.HasClassesInSignature;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.model.SetOntologyID;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.reasoner.InferenceType;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.search.EntitySearcher;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.OWLOntologyMerger;
import org.semanticweb.owlapi.util.SimpleIRIMapper;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AddImport;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLOntology;


import sun.rmi.runtime.Log;
//For loading ontologies in a specified template and converting to OAS

public class ServiceTemplate {
	
    
	public static void main(String[] args) throws OWLOntologyStorageException, FileNotFoundException, OWLOntologyCreationException {
		
		OWLOntologyManager m=OWLManager.createOWLOntologyManager();
    	File owlFile = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\mergetest.owl");
    	File file1 = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\franca1.owl");
    	File file2 = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\mediator_ont.owl");
    	
    	IRI iri1= IRI.create("http://www.semanticweb.org/uids2837/ontologies/2020/0/untitled-ontology-49");
    	IRI iri2= IRI.create("http://www.semanticweb.org/uids2837/ontologies/2020/1/untitled-ontology-32");
    	m.getIRIMappers().add(new SimpleIRIMapper(iri1, IRI.create("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\franca1.owl")));
    	m.getIRIMappers().add(new SimpleIRIMapper(iri2, IRI.create("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\mediator_ont.owl")));
    	OWLOntology onto1=m.loadOntologyFromOntologyDocument(file1);
    	OWLOntology onto2=m.loadOntologyFromOntologyDocument(file2);
    	OWLOntology onto=m.loadOntologyFromOntologyDocument(owlFile);
    	//Merger
    	
    	OWLOntologyMerger merger = new OWLOntologyMerger(m);
    	IRI mergedontology = IRI.create("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\mergetest.owl");
    	// File file8 = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\mergetest.owl");
    	File file9 = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\mergedtest.owl");
    	OWLOntology merged = merger.createMergedOntology(m,mergedontology);
    	m.saveOntology(merged,new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file9));



    	System.out.println("Merged Ontology :" +merged);

    //	IRI iri=onto.getOntologyID().getOntologyIRI().get();
    	
    	OWLDataFactory factory=m.getOWLDataFactory();
    	OWLImportsDeclaration importDeclaration1 = factory.getOWLImportsDeclaration(iri1);
    	OWLImportsDeclaration importDeclaration2 = factory.getOWLImportsDeclaration(iri2);
    	AddImport addImport1=new AddImport(onto, importDeclaration1);
    	AddImport addImport2=new AddImport(onto, importDeclaration2);
    	m.saveOntology(onto);
	}
	
	
	
	
}
