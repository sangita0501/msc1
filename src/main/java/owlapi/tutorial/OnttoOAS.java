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
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLOntology;


import sun.rmi.runtime.Log;

public class OnttoOAS {
	
	public static void main(String[] args) throws OWLOntologyStorageException, FileNotFoundException, OWLOntologyCreationException {
	OWLOntologyManager man = OWLManager.createOWLOntologyManager();
	File file = new File("C:\\Backup_from_D_Drive\\DSUsers\\\\uids2837\\model\\franca1.owl");
	try {
	OWLOntology ont = man.loadOntologyFromOntologyDocument(file);
	System.out.println(ont);
	File fileout = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\ontap.owl");
	man.saveOntology(ont, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));
	
	OWLDataFactory df6 = ont.getOWLOntologyManager().getOWLDataFactory();
	
	//Instantiating the Reasoner
	OWLReasonerFactory rf = new ReasonerFactory();
	OWLReasoner r = rf.createReasoner(ont);
	r.precomputeInferences(InferenceType.CLASS_HIERARCHY);
/*
	//Querying the reasoner (for conversion to YAML and Vehicle Service Ontology Template)
	System.out.println(" \t**--SubClasses--:");
	r.getSubClasses(df6.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ServiceSWCType"), false).forEach(System.out::println);;
	System.out.println(" \t--SuperClasses--:");
	r.getSuperClasses(df6.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ServiceSWCType"), false).forEach(System.out::println);;
*/
}
	catch (OWLOntologyCreationException e) {
        e.printStackTrace();
    }   
	}
}