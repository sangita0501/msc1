package owlapi.tutorial;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.openrdf.model.vocabulary.OWL;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.io.OWLXMLOntologyFormat;
import org.semanticweb.owlapi.model.HasClassesInSignature;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDocumentFormat;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyFormat;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.PrefixManager;
import org.semanticweb.owlapi.model.SetOntologyID;
import org.semanticweb.owlapi.model.parameters.Imports;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.search.EntitySearcher;
import org.semanticweb.owlapi.util.DefaultPrefixManager;
import org.semanticweb.owlapi.util.SimpleIRIMapper;



import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLOntology;


import sun.rmi.runtime.Log;



public class OWLAPITEST {

	private static Collection<?> properties;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws OWLOntologyCreationException, OWLOntologyStorageException, FileNotFoundException, IOException {
	
//Loading and Saving Ontology
		
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		File file = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\merged3ont.owl");
	//	File file = new File("src/main/resources/franca1.owl");
		File fileout = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\ontap.owl");
		OWLOntology o = man.loadOntologyFromOntologyDocument(file);
		OWLDocumentFormat format = man.getOntologyFormat(o);
		System.out.println(" format: " + format);
		OWLDataFactory factory = man.getOWLDataFactory();
		IRI documentIRI = IRI.create("file:/tmp/MyOnt1.owl");
		OWLDataFactory da = o.getOWLOntologyManager().getOWLDataFactory();
		OWLClass MyClass = da.getOWLClass(documentIRI+"#B");
		SetOntologyID i;
		man.saveOntology(o, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));
		
		
		
		System.out.println("Loaded_ontology:"+o);
		Set<OWLAxiom> axioms = o.getAxioms();
		System.out.println("Ontology has {} axioms before filtering"+axioms.size());
		System.out.println(man.getOntologies().size());
		
		
//Creating an ontology template for Ontology Mediator
		
		try {
		OWLOntology	o1 = man.createOntology();
		System.out.println(o);
		IRI iri1 = IRI.create(new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\testmediate.owl"));
	    //    OWLOntology o = man.loadOntologyFromOntologyDocument(iri1);

	        java.util.Set<OWLClass> classes;
	        java.util.Set<OWLObjectProperty> prop;
	        java.util.Set<OWLDataProperty> dataProp;
	        java.util.Set<OWLNamedIndividual> individuals;

	        classes = o.getClassesInSignature();
	        prop = o.getObjectPropertiesInSignature();
	        dataProp = o.getDataPropertiesInSignature();
	        individuals = o.getIndividualsInSignature();
	        
	        
	        System.out.println("Classes");
            System.out.println("--------------------------------");
            for (OWLClass cls : classes) {
                System.out.println("+: " + cls.getIRI().getShortForm());

                System.out.println(" \tObject Property Domain");
                for (OWLObjectPropertyDomainAxiom op : o.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {
                    if (op.getDomain().equals(cls)) {
                        for (OWLObjectProperty oop : op.getObjectPropertiesInSignature()) {
                            if (cls.getIRI().getShortForm().equals(oop.getIRI().getShortForm()))
                                continue;
                            System.out.println("\t\t +: " + oop.getIRI().getShortForm() + "==Object Property");
                        }
                    }
                }

                System.out.println(" \tData Property Domain");
                for (OWLDataPropertyDomainAxiom dp : o.getAxioms(AxiomType.DATA_PROPERTY_DOMAIN)) {
                    if (dp.getDomain().equals(cls)) {
                        for (OWLDataProperty odp : dp.getDataPropertiesInSignature()) {
                            System.out.println("\t\t +: " + odp.getIRI().getShortForm() + "==Data Property");
                        }
                    }
                }
            }
	        
			for(OWLAxiom ax:o.getLogicalAxioms())
			{
				Set<OWLObjectProperty> ps = ax.getObjectPropertiesInSignature();
			    ps.removeAll(properties);
			    if (ps.size() > 0) {
			      man.removeAxiom(o, ax);
			    }
				System.out.println(ax);
				//iterate over the axioms to filter entities by name
										
			 }
			System.out.println(o);
									
			} catch (Exception e) {
				 System.out.println("Failed to load ontology/ies");
				// e.getLocalizedMessage();
			 e.printStackTrace();
			 }
		 }
	// Creating Generic Automotive Service Template
	

		
			
	
}
