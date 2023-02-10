package owlapi.tutorial;
//package org.w3schools.io.yaml;
import com.bethecoder.ascii_table.ASCIITable;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import owlapi.tutorial.*;
import java.io.File;
import java.io.FileInputStream;


import org.semanticweb.HermiT.ReasonerFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import javax.naming.ldap.ManageReferralControl;
import javax.naming.spi.ObjectFactory;

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
import org.w3schools.io.yaml.ApplicationConfig;
import org.w3schools.io.yaml.DatabaseConfig;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;



import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLOntology;
import org.apache.commons.io.FilenameUtils;
import org.coode.owlapi.manchesterowlsyntax.ManchesterOWLSyntaxEditorParser;
import org.semanticweb.HermiT.Reasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.ParserException;
import org.semanticweb.owlapi.expression.ShortFormEntityChecker;
import org.semanticweb.owlapi.io.StringDocumentSource;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.util.BidirectionalShortFormProvider;
import org.semanticweb.owlapi.util.BidirectionalShortFormProviderAdapter;
import org.semanticweb.owlapi.util.ShortFormProvider;
import org.semanticweb.owlapi.util.SimpleShortFormProvider;


import sun.rmi.runtime.Log;

//Creating Ontology Template for Choreography. Choreography = how to interact with the service to consume its functionality 


public class ONTCHOREOGRAPHER {
//Class for Ontology orchestration
	private static Collection<?> properties;

	@SuppressWarnings("deprecation")
public static void main(String[] args) throws OWLOntologyStorageException, JsonMappingException,JsonParseException,IOException {
OWLOntologyManager man = OWLManager.createOWLOntologyManager();
File fileout = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\test_mediator.owl");
OWLOntology med_ont;
try {
med_ont = man.createOntology();
man.saveOntology(med_ont, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));
System.out.println(med_ont);

//Creating User Ontology

/*
System.out.println("Enter the IRI of the Existing Ontology");
Scanner in = new Scanner(System.in); 
String user_ont = in.nextLine(); 
System.out.println("You entered string "+user_ont); 
*/

File file3 = new File ("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\msc1\\src\\main\\resources\\"+ "OntologyChoreography.owl");

/*
if(!file3.exists())
{
	System.out.println("Invalid Choice!!");
}
else {
*/
//+++++User defined Ontology
System.out.println("Welcome to Vehicle Services Choreography");
System.out.println("********************************************");
System.out.println("+++++Generic Vehicle Service Ontology Template++++");
//Loop execution for multiple SWCs APIs Entries


//+++++++++
OWLOntology userOntology = man.createOntology();
System.out.println("First Ontology Created:******* " +userOntology.getOntologyID()+ "**********");

IRI iri1 = IRI.create("http://www.semanticweb.org/owlapi/ontologies/ontology/VehicleServie_Ontology");
OWLDataFactory df5 = userOntology.getOWLOntologyManager().getOWLDataFactory();
IRI documentIRI = IRI.create("file:/tmp/Ont_mediator.owl");

//+++++
OWLClass mainClass = df5.getOWLClass(iri1+"#VehicleServices_Choreography");
OWLDeclarationAxiom da1 = df5.getOWLDeclarationAxiom(mainClass);
userOntology.add(da1);

//+++++
OWLClass mediatorclass= df5.getOWLClass(iri1+"#Vehicle_OOMediator");
OWLSubClassOfAxiom w_sub_vv = df5.getOWLSubClassOfAxiom(mediatorclass, mainClass);
userOntology.add(w_sub_vv);

//+++++
OWLClass CompSWCtype = df5.getOWLClass(iri1+"#CompositionSWCType");
OWLSubClassOfAxiom w_sub_vv1 = df5.getOWLSubClassOfAxiom(CompSWCtype,mediatorclass);
userOntology.add(w_sub_vv1);

//++++++
OWLClass SWCtype = df5.getOWLClass(iri1+"#ServiceSWCType");
OWLSubClassOfAxiom w_sub_p = df5.getOWLSubClassOfAxiom(SWCtype, CompSWCtype);
userOntology.add(w_sub_p);

//++++++
OWLClass SWCtypeporttype = df5.getOWLClass(iri1+"#SWCPortPrototypes");
OWLSubClassOfAxiom w_sub_port = df5.getOWLSubClassOfAxiom(SWCtypeporttype, SWCtype);
userOntology.add(w_sub_port);

//Define Individuals or Instances of Classes
OWLIndividual AtomicSWCType = df5.getOWLNamedIndividual(iri1 + "#AtomicSWC");
OWLIndividual NodesType = df5.getOWLNamedIndividual(iri1 + "#ServiceNode");


//Add instances to Class created
OWLClassAssertionAxiom ax1 = df5.getOWLClassAssertionAxiom(SWCtype, AtomicSWCType);
man.addAxiom(userOntology, ax1);
OWLClassAssertionAxiom ax2 = df5.getOWLClassAssertionAxiom(SWCtype, NodesType);
man.addAxiom(userOntology, ax2);

// Define Object Property between Individuals
OWLObjectProperty issimilar = df5.getOWLObjectProperty(iri1 + "#owl:semanticsimilar");
OWLObjectPropertyAssertionAxiom assertion = df5.getOWLObjectPropertyAssertionAxiom(issimilar, AtomicSWCType, NodesType);

//Define Object Property between Individuals
OWLObjectProperty iscompatible = df5.getOWLObjectProperty(iri1 + "#owl:iscompatibleWith");
OWLObjectPropertyAssertionAxiom assertion1 = df5.getOWLObjectPropertyAssertionAxiom(iscompatible, AtomicSWCType, NodesType);

//Define Object Property between Individuals
OWLObjectProperty isncompatible = df5.getOWLObjectProperty(iri1 + "#owl:incompatibleWith");
OWLObjectPropertyAssertionAxiom assertion2 = df5.getOWLObjectPropertyAssertionAxiom(isncompatible, AtomicSWCType, NodesType);


//Finally, add the axiom to our Ontology and save
AddAxiom addAxiomChange = new AddAxiom(userOntology, assertion);
man.applyChange(addAxiomChange);
AddAxiom addAxiomChange1 = new AddAxiom(userOntology, assertion1);
man.applyChange(addAxiomChange1);
AddAxiom addAxiomChange2 = new AddAxiom(userOntology, assertion2);
man.applyChange(addAxiomChange2);

//+++++++++
OWLClass Servicegroundtype = df5.getOWLClass(iri1+"#ServiceGrounding");
OWLSubClassOfAxiom w_sub_p400 = df5.getOWLSubClassOfAxiom(Servicegroundtype,SWCtype);
userOntology.add(w_sub_p400);

//+++++++
OWLClass ServiceInterfacetype = df5.getOWLClass(iri1+"#ServiceInterfaceType");
OWLSubClassOfAxiom w_sub_p1 = df5.getOWLSubClassOfAxiom(ServiceInterfacetype,Servicegroundtype);
userOntology.add(w_sub_p1);

//+++++++
OWLClass Interfacetype_Broadacast = df5.getOWLClass(iri1+"#BroadCast");
OWLSubClassOfAxiom w_sub_p2 = df5.getOWLSubClassOfAxiom(Interfacetype_Broadacast,ServiceInterfacetype);
userOntology.add(w_sub_p2);

//+++++++++
OWLClass Interfacetype_method_invokation = df5.getOWLClass(iri1+"#Method_Invokation");
OWLSubClassOfAxiom w_sub_p3 = df5.getOWLSubClassOfAxiom(Interfacetype_method_invokation,ServiceInterfacetype);
userOntology.add(w_sub_p3);

//++++++++++
OWLClass Interfacetype_method_attributes = df5.getOWLClass(iri1+"#Attributes");
OWLSubClassOfAxiom w_sub_p32 = df5.getOWLSubClassOfAxiom(Interfacetype_method_attributes,Interfacetype_method_invokation);
userOntology.add(w_sub_p32);

//+++++++++++
OWLClass Interfacesubtype_ClientServer = df5.getOWLClass(iri1+"#ClientServer");
OWLSubClassOfAxiom w_sub_p4 = df5.getOWLSubClassOfAxiom(Interfacesubtype_ClientServer,Interfacetype_method_invokation);
userOntology.add(w_sub_p4);

//+++++++
OWLClass Interfacesubtype_Precondition = df5.getOWLClass(iri1+"#Precondition_compliance");
OWLSubClassOfAxiom w_sub_p15 = df5.getOWLSubClassOfAxiom(Interfacesubtype_Precondition,Interfacetype_method_invokation);
userOntology.add(w_sub_p15);

//+++++++
OWLClass Interfacesubtype_Postcondition = df5.getOWLClass(iri1+"#Postcondition_compliance");
OWLSubClassOfAxiom w_sub_p16 = df5.getOWLSubClassOfAxiom(Interfacesubtype_Postcondition, Interfacetype_method_invokation);
userOntology.add(w_sub_p16);

//++++++++++
OWLClass Interfacetype_PublishSubscribe = df5.getOWLClass(iri1+"#PublishSubscribe");
OWLSubClassOfAxiom w_sub_p5 = df5.getOWLSubClassOfAxiom(Interfacetype_PublishSubscribe,ServiceInterfacetype);
userOntology.add(w_sub_p5);

//+++++++++
OWLClass Interfacesubtype_PublishSubscribe = df5.getOWLClass(iri1+"#PublishService");
OWLSubClassOfAxiom w_sub_p8 = df5.getOWLSubClassOfAxiom(Interfacesubtype_PublishSubscribe,Interfacetype_PublishSubscribe);
userOntology.add(w_sub_p8);

//+++++++++
OWLClass Interfacesubtype_PublishSubscribe1 = df5.getOWLClass(iri1+"#EventSubscribe");
OWLSubClassOfAxiom w_sub_p11 = df5.getOWLSubClassOfAxiom(Interfacesubtype_PublishSubscribe1, Interfacetype_PublishSubscribe);
userOntology.add(w_sub_p11);

//++++++++
OWLClass Interfacesubtype_PublishSubscribe2 = df5.getOWLClass(iri1+"#EventNotification");
OWLSubClassOfAxiom w_sub_p12 = df5.getOWLSubClassOfAxiom(Interfacesubtype_PublishSubscribe2, Interfacetype_PublishSubscribe);
userOntology.add(w_sub_p12);

//++++++++++
OWLClass Interfacetype_DataPassing = df5.getOWLClass(iri1+"#DataPassing");
OWLSubClassOfAxiom w_sub_p6 = df5.getOWLSubClassOfAxiom(Interfacetype_DataPassing,ServiceInterfacetype);
userOntology.add(w_sub_p6);

//++++++++
OWLClass Interfacesubtype_SenderReceiver = df5.getOWLClass(iri1+"#SenderReceiver");
OWLSubClassOfAxiom w_sub_p7 = df5.getOWLSubClassOfAxiom(Interfacesubtype_SenderReceiver,Interfacetype_DataPassing);
userOntology.add(w_sub_p7);

//+++++++
OWLClass Interfacesubtype_DataMap = df5.getOWLClass(iri1+"#DataTypeMapping");
OWLSubClassOfAxiom w_sub_p13 = df5.getOWLSubClassOfAxiom(Interfacesubtype_DataMap,Interfacesubtype_SenderReceiver );
userOntology.add(w_sub_p13);

//++++++++
OWLClass Interfacesubtype_InputData = df5.getOWLClass(iri1+"#Input_DataPrototype");
OWLSubClassOfAxiom w_sub_p19 = df5.getOWLSubClassOfAxiom(Interfacesubtype_InputData,Interfacesubtype_DataMap );
userOntology.add(w_sub_p19);

//++++++++
OWLClass Interfacesubtype_OutputData = df5.getOWLClass(iri1+"#Output_DataPrototype");
OWLSubClassOfAxiom w_sub_p20 = df5.getOWLSubClassOfAxiom(Interfacesubtype_OutputData,Interfacesubtype_DataMap);
userOntology.add(w_sub_p20);

//++++++++
OWLClass Interfacesubtype_ParameterDataMap = df5.getOWLClass(iri1+"#Argument_DataTypeMapping");
OWLSubClassOfAxiom w_sub_p9 = df5.getOWLSubClassOfAxiom(Interfacesubtype_ParameterDataMap,Interfacesubtype_ClientServer );
userOntology.add(w_sub_p9);

//++++++++
OWLClass Interfacesubtype_InputArgData = df5.getOWLClass(iri1+"#Input_DataPrototype");
OWLSubClassOfAxiom w_sub_p17 = df5.getOWLSubClassOfAxiom(Interfacesubtype_InputArgData,Interfacesubtype_ParameterDataMap );
userOntology.add(w_sub_p17);

//++++++++
OWLClass Interfacesubtype_OutputArgData = df5.getOWLClass(iri1+"#Output_DataPrototype");
OWLSubClassOfAxiom w_sub_p18 = df5.getOWLSubClassOfAxiom(Interfacesubtype_OutputArgData,Interfacesubtype_ParameterDataMap);
userOntology.add(w_sub_p18);

//++++++++
OWLClass Interfacesubtype_httpmethodcall = df5.getOWLClass(iri1+"#HTTP_Methods");
OWLSubClassOfAxiom w_sub_p23 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodcall,ServiceInterfacetype);
userOntology.add(w_sub_p23);

//+++++++++
OWLClass Interfacesubtype_httpmethodgetcall = df5.getOWLClass(iri1+"#HTTP_GET");
OWLSubClassOfAxiom w_sub_p24 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodgetcall,Interfacesubtype_httpmethodcall);
userOntology.add(w_sub_p24);

//+++++++
OWLClass Interfacesubtype_httpmethodgetcall1 = df5.getOWLClass(iri1+"#HTTP_Request");
OWLSubClassOfAxiom w_sub_p25 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodgetcall1,Interfacesubtype_httpmethodgetcall);
userOntology.add(w_sub_p25);

//+++++++
OWLClass Interfacesubtype_httpmethodgetresp = df5.getOWLClass(iri1+"#HTTP_Response");
OWLSubClassOfAxiom w_sub_p26 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodgetresp,Interfacesubtype_httpmethodgetcall);
userOntology.add(w_sub_p26);

//+++++++

OWLClass Interfacesubtype_httpmethodpostcall = df5.getOWLClass(iri1+"#HTTP_POST");
OWLSubClassOfAxiom w_sub_p27 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodpostcall,Interfacesubtype_httpmethodcall);
userOntology.add(w_sub_p27);

//+++++++
OWLClass Interfacesubtype_httpmethodpostcall1 = df5.getOWLClass(iri1+"#HTTP_Request");
OWLSubClassOfAxiom w_sub_p28 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodpostcall1,Interfacesubtype_httpmethodpostcall);
userOntology.add(w_sub_p28);

//+++++++
OWLClass Interfacesubtype_httpmethodgetresp1 = df5.getOWLClass(iri1+"#HTTP_Response");
OWLSubClassOfAxiom w_sub_p29 = df5.getOWLSubClassOfAxiom(Interfacesubtype_httpmethodgetresp1,Interfacesubtype_httpmethodpostcall);
userOntology.add(w_sub_p29);


//++++++++
OWLClass Interfacetype_TimingSync = df5.getOWLClass(iri1+"#TimeSynchronization");
OWLSubClassOfAxiom w_sub_p14 = df5.getOWLSubClassOfAxiom(Interfacetype_TimingSync,ServiceInterfacetype);
userOntology.add(w_sub_p14);

//++++++++
//++++++++
OWLClass Interfacetype_TimingSync1 = df5.getOWLClass(iri1+"#TimingRequirements");
OWLSubClassOfAxiom w_sub_p21 = df5.getOWLSubClassOfAxiom(Interfacetype_TimingSync1,Interfacetype_TimingSync);
userOntology.add(w_sub_p21);

//++++++
OWLClass Interfacetype_Timingguarantee = df5.getOWLClass(iri1+"#TimingGuarantees");
OWLSubClassOfAxiom w_sub_p22 = df5.getOWLSubClassOfAxiom(Interfacetype_Timingguarantee,Interfacetype_TimingSync1);
userOntology.add(w_sub_p22);


man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
System.out.println(userOntology);

//Object Property declaration

java.util.Set<OWLClass> classes;
classes = userOntology.getClassesInSignature();
for (OWLClass cls : classes) {
    System.out.println("+: " + cls.getIRI().getShortForm());

    System.out.println(" \tObject Property Domain");
    for (OWLObjectPropertyDomainAxiom op : userOntology.getAxioms(AxiomType.OBJECT_PROPERTY_DOMAIN)) {
        if (op.getDomain().equals(cls)) {
            for (OWLObjectProperty oop : op.getObjectPropertiesInSignature()) {
                if (cls.getIRI().getShortForm().equals(oop.getIRI().getShortForm()))
                    continue;
                System.out.println("\t\t +: " + oop.getIRI().getShortForm() + "==Object Property");
            }
        }
    }
    
    ////Data Property declaration
    System.out.println(" \tData Property Domain");
    for (OWLDataPropertyDomainAxiom dp : userOntology.getAxioms(AxiomType.DATA_PROPERTY_DOMAIN)) {
        if (dp.getDomain().equals(cls)) {
            for (OWLDataProperty odp : dp.getDataPropertiesInSignature()) {
                System.out.println("\t\t +: " + odp.getIRI().getShortForm() + "==Data Property");
            }
        }
    }
}

//Instantiating the Reasoner
OWLReasonerFactory rf = new ReasonerFactory();
OWLReasoner r = rf.createReasoner(userOntology);
r.precomputeInferences(InferenceType.CLASS_HIERARCHY);



//Querying the reasoner (for conversion to YAML and Vehicle Service Ontology Template)
System.out.println(" \t**--SubClasses--:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ServiceSWCType"), false).forEach(System.out::println);;
System.out.println(" \t--SuperClasses--:");
r.getSuperClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ServiceSWCType"), false).forEach(System.out::println);;





//Load and Merge an Ontology 

File file7 = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\franca1.owl");
IRI testiri= IRI.create("http://www.semanticweb.org/uids2837/ontologies/2020/0/untitled-ontology-49");
//OWLOntology o1= man.loadOntologyFromOntologyDocument(testiri);

//man.saveOntology(o1,new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));




OWLOntologyMerger merger = new OWLOntologyMerger(man);
IRI mergedontology = IRI.create("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\mergetest.owl");
// File file8 = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\mergetest.owl");
File file9 = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\mergedtest.owl");
OWLOntology ont1 = man.loadOntologyFromOntologyDocument(file7);
OWLOntology merged = merger.createMergedOntology(man,mergedontology);
man.saveOntology(merged,new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file9));



System.out.println("Merged Ontology :" +merged);

//++++ Parse XML Objects to IRI Transformation++++
//ObjectFactory obj1;
//File filenamepars = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\SchemPars\\src\\main\\java\\infotainment\\FComponentPrototype.java");
//String strfilename1 = filenamepars.getName().getClass().getSimpleName().toString();
System.out.println("Parsed XSD Schemas for Existing Service Sowftware Components API Specification");
//
List<String> results = new ArrayList<String>();


File[] filespar = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\SchemPars\\src\\main\\java\\infotainment").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null. 
File[] filespar1 = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\SchemaRos\\src\\main\\java\\robotics").listFiles();

System.out.println("+++Parsing Existing SWCs Interface Schemas (XSD) to Java Classes to Ontological IRIs...+++");

for (File file : filespar) {
    if (file.isFile()) {
        results.add(file.getName());
        
        if (file.getName().endsWith("Attribute.Java")){
       	 String fileNameWithExt = file.getName();
 			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
 			OWLClass SWCUserType5 = df5.getOWLClass(iri1+"#"+ strfilename1);
 			OWLSubClassOfAxiom w_sub_p312 = df5.getOWLSubClassOfAxiom(SWCUserType5, Interfacetype_method_attributes);
 			userOntology.add(w_sub_p312);
 			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserType5), df5.getOWLClass(Interfacetype_method_attributes));
			userOntology.add(a);
 			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
 			System.out.println("Done transformation to IRIs!");
 			
        } 
        
        else if (file.getName().endsWith("Broadcast.Java"))
        {
        	String fileNameWithExt = file.getName();
			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType4 = df5.getOWLClass(iri1+"#"+ strfilename1);
			OWLSubClassOfAxiom w_sub_p311 = df5.getOWLSubClassOfAxiom(SWCUserType4, Interfacetype_Broadacast);
			userOntology.add(w_sub_p311);
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserType4), df5.getOWLClass(Interfacetype_Broadacast));
			userOntology.add(a);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
		} 
        else if (file.getName().endsWith("CompositionComponentPrototype.java"))
        {
        	String fileNameWithExt = file.getName();
			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType1 = df5.getOWLClass(iri1+"#"+ strfilename1);
			OWLSubClassOfAxiom w_sub_p300 = df5.getOWLSubClassOfAxiom(SWCUserType1, CompSWCtype);
			userOntology.add(w_sub_p300);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
        }  
         else if (file.getName().endsWith("Method.Java"))
         {
        	String fileNameWithExt = file.getName();
			String strfilename2 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType3 = df5.getOWLClass(iri1+"#"+ strfilename2);
			OWLSubClassOfAxiom w_sub_p310 = df5.getOWLSubClassOfAxiom(SWCUserType3, Interfacesubtype_ClientServer);
			userOntology.add(w_sub_p310);
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserType3), df5.getOWLClass(Interfacesubtype_ClientServer));
			userOntology.add(a);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
		} 
         else if (file.getName().endsWith("PortPrototype.Java")){
        	 String fileNameWithExt = file.getName();
  			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
  			OWLClass SWCUserType6 = df5.getOWLClass(iri1+"#"+ strfilename1);
  			OWLSubClassOfAxiom w_sub_p313 = df5.getOWLSubClassOfAxiom(SWCUserType6, SWCtypeporttype);
  			userOntology.add(w_sub_p313);
  			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserType6), df5.getOWLClass(SWCtypeporttype));
			userOntology.add(a);
  			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
  			System.out.println("Done transformation to IRIs!");
  			
         } 
        
         else if (file.getName().endsWith("ServiceComponentPrototype.java"))
         {
        	String fileNameWithExt = file.getName();
			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType1 = df5.getOWLClass(iri1+"#"+ strfilename1);
			OWLSubClassOfAxiom w_sub_p300 = df5.getOWLSubClassOfAxiom(SWCUserType1,SWCtype);
			userOntology.add(w_sub_p300);
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserType1), df5.getOWLClass(SWCtype));
			userOntology.add(a);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");	
			
		} 
               
       else
        {
        	System.out.println(" No more Service Components doesn't exists for Transformation!");
        }
  
    }
    else {
    	System.out.println("File doesn't exists!");
    }
}
for (File file5 : filespar1) {
    if (file5.isFile()) {
        results.add(file5.getName());
        if (file5.getName().endsWith("MasterNode.java"))
        {
        	String fileNameWithExt = file5.getName();
			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType1 = df5.getOWLClass(iri1+"#"+ strfilename1);
			OWLSubClassOfAxiom w_sub_p300 = df5.getOWLSubClassOfAxiom(SWCUserType1, CompSWCtype);
			userOntology.add(w_sub_p300);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
			
        } 
        else if (file5.getName().endsWith("AtomicNode.java")){
        	String fileNameWithExt = file5.getName();
			String strfilename1 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType1 = df5.getOWLClass(iri1+"#"+ strfilename1);
			OWLSubClassOfAxiom w_sub_p300 = df5.getOWLSubClassOfAxiom(SWCUserType1,SWCtype);
			userOntology.add(w_sub_p300);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
        }
        else if (file5.getName().endsWith("ClientServerInterface.Java")){
        	String fileNameWithExt = file5.getName();
			String strfilename2 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType2 = df5.getOWLClass(iri1+"#"+ strfilename2);
			OWLSubClassOfAxiom w_sub_p320 = df5.getOWLSubClassOfAxiom(SWCUserType2, Interfacesubtype_ClientServer);
			userOntology.add(w_sub_p320);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
			
		}
        
        else if (file5.getName().endsWith("InterfaceTopic.Java")) {
        	String fileNameWithExt = file5.getName();
			String strfilename2 = FilenameUtils.removeExtension(fileNameWithExt);
			OWLClass SWCUserType3 = df5.getOWLClass(iri1+"#"+ strfilename2);
			OWLSubClassOfAxiom w_sub_p321 = df5.getOWLSubClassOfAxiom(SWCUserType3,Interfacesubtype_SenderReceiver );
			userOntology.add(w_sub_p321);
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			System.out.println("Done transformation to IRIs!");
			
		}
        
    else
    {
    	System.out.println("No more Service Components doesn't exists for Transformation!");
    }
    } 
    else {
    	System.out.println("File doesn't exists!");
    }
    
}
System.out.println("//////////////////////////////////////////////////////////////////");
System.out.println("Time to display the Metrics before the Reasoning!!");
//String leftAlignFormat = "| %-4d | %-25s | %-25s | %25s | %25s |%n";

//+++++READ EVALUATED QUALITY METRICS DATA FOR THE FRAMEWORKS+++++++
//TWO_GROUP for Semantic Similarities <check
//INTRA-GROUP Semantic Similarity:S Distribution---> Semantic Similarity with Mediator Interface Ontology 

double[] Metr_AR = {26,37.5,37.5};
double[] Metr_Fr = {24,33.33,62.5};
double[] Metr_ROS = {25,33.33,50};

//INTER-GROUP Semantic Similarity:N Distribution----> Semantic similarity with peer framework Interface Ontology

double[] Metr_AR_FR = {28,46.15,66.67};
double[] Metr_Fr_ROS = {27,38.46,71.4};
double[] Metr_ROS_AR = {30,35,77.78};

//Threshold Evaluation for API Reusability and semantic Compatibility based on Practical Analysis of evaluated Metrics and considered the centre value for the distribution Ranges for any given metric. Also,considering False Positives and negatives in case of Distribution Range overlaps

double SSS_THR = 25;
double IRR_THR = 35;
double CIC_THR = 50;

System.out.format("+-----------------+---------------------+--------+------+-----+%n");
System.out.format("| Framework_ID    | Name_FW_SWC_API     |  SSS   | IRR  | CIC |%n");
System.out.format("+-----------------+---------------------+--------+------+-----+%n");
//Metrics can also be entered on user choice
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Time to display the INTRA-GROUP Distribution (S-Distribution) for Metrics for Semantic Alignment FW APIs w.r.t Mediator Ontology!!");

    System.out.println("  1            |"+"AUTOSAR_Adaptive   |"+ Metr_AR[0] + "% |"+ Metr_AR[1] + "%  |"+ Metr_AR[2] + "%  |");
    System.out.println("  2            |"+"Franca             |"+ Metr_Fr[0] + "% |"+ Metr_Fr[1]+ "%   |"+ Metr_Fr[2] + "%  |");
    System.out.println("  3            |"+"ROS                |"+ Metr_ROS[0] +"% |"+ Metr_ROS[1]+ "%  |"+ Metr_ROS[2] +"%  |");
    
System.out.format("+-----------------+------------------+--------+------+------+%n");

System.out.format("+-----------------+---------------------+--------+------+-----+%n");
System.out.format("| Framework_ID    | Name_FW_SWC_API     |  SSS   | IRR  | CIC |%n");
System.out.format("+-----------------+---------------------+--------+------+-----+%n");
//Metrics can also be entered on user choice
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Time to display the INTER-GROUP Distribution (N-Distribution) for Metrics for Semantic Alignment FW APIs w.r.t other Peer FW APIs!!");

    System.out.println("  1            |"+"AUTOSAR_Adaptive_And_Franca   |"+ Metr_AR_FR [0] + "% |"+ Metr_AR_FR [1] + "%  |"+ Metr_AR_FR [2] + "%  |");
    System.out.println("  2            |"+"Franca_And_ROS                |"+ Metr_Fr_ROS[0] + "% |"+ Metr_Fr_ROS[1]+ "%   |"+ Metr_Fr_ROS[2] + "%  |");
    System.out.println("  3            |"+"ROS_And_AUTOSAR               |"+ Metr_ROS_AR[0] +"% |"+ Metr_ROS_AR[1]+ "%  |"+ Metr_ROS_AR[2] +"%  |");
    
System.out.format("+-----------------+------------------+--------+------+------+%n");
System.out.println("Threshold Derived based on S-Distribution and N-Distribution......");
System.out.println("!!!!If S-Distribution and N-Distribution intervals doesn't Overlap for any given Metric then the centre value between lowest (in S-Distribution) and highest (in N-Distribution)value is considered as Threshold!!!");



//++++++
//Based on determined threshold value for each similarity metric , determine the semantic interoperability
System.out.println("//////////////////////////////////////////////////////////////////");
System.out.println("The Threshold Range {max,min}for Schema Semantic Similarity Metric(SSS)for the above frameworks: ");
System.out.println("The Threshold Range {max,min}for Schema Semantic Similarity Metric(IRR)for the above frameworks: ");
System.out.println("The Threshold Range {max,min}for Schema Semantic Similarity Metric()for the above frameworks: ");
System.out.println("The Optimum Threshold Value for Schema Semantic Similarity Metric(SSS): ");
System.out.println (SSS_THR);
System.out.println("The Optimum Threshold Value for Instance Relationship Richness Metric(IRR): ");
System.out.println (IRR_THR);
System.out.println("The Optimum Threshold Value for Class Instance Connectivity Metric(CIC): ");
System.out.println (CIC_THR);
System.out.println("//////////////////////////////////////////////////////////////////");



Scanner sc10= new Scanner(System.in);
System.out.println("Are there any more components to be entered to Standard Ontology Template? ");
System.out.println("++++ Please Enter the digit 1. Yes 2. No : ++++");
Integer str_class3= sc10.nextInt();
if (str_class3 == 1) 
{

//************Loop for for multiple SWC APIsbspecification*********************
System.out.println("*********  User Choice Components Entry Section ********");
Scanner fwsc =new Scanner(System.in);
Scanner sc1= new Scanner(System.in);
System.out.println("Enter the number of SWCs whose APIs to be specified in generic template in digits (1...9): ");
Integer intswc= sc1.nextInt();
System.out.println("**** Service Sowftware Component API Specifications*****");
int i= 1;
int arr[]= null;

do {
//for (int i= 1; i<= intswc; i++) {
	

System.out.println("Enter the Number of the Automotive Service Framework whose SWC API needs to specified in standardized Ontology \n 1. Autosar_Adaptive \n 2.Franca \n 3.ROS2 ");
int fwsc_class = fwsc.nextInt();
//++++ Checking for Metamodel semantic Alignment above Threshold +++++++


if (fwsc_class==1) {
if ((Metr_AR[0] > SSS_THR) && (Metr_AR[1] > IRR_THR) && (Metr_AR[2] > CIC_THR)) {
	System.out.println("*********  User Choice Framework Metamodels is semantically aligned at Schema and instance Level !! ********");
	}
else if  (( Metr_AR[0] < SSS_THR) && ((Metr_AR[1] > IRR_THR) || (Metr_AR[2] > CIC_THR))) {
	System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at instance Level !! ********");
	}
else if ((Metr_AR[0] > SSS_THR) && ((Metr_AR[1] < IRR_THR) || (Metr_AR[2] < CIC_THR))) {
		System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at schema Level !! ********");
	}
else {
	System.out.println("*********  User Choice Framework Metamodels is not semantically aligned  at Schema and instance Level******");
}
}

else if (fwsc_class==2) {
	if ((Metr_Fr[0] > SSS_THR) && (Metr_Fr[1] > IRR_THR) && (Metr_Fr[2] > CIC_THR)) {
		System.out.println("*********  User Choice Framework Metamodels is semantically aligned at Schema and instance Level !! ********");
		}
	else if  (( Metr_Fr[0] < SSS_THR) && ((Metr_Fr[1] > IRR_THR) || (Metr_Fr[2] > CIC_THR))) {
		System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at instance Level !! ********");
		}
	else if ((Metr_Fr[0] > SSS_THR) && ((Metr_Fr[1] < IRR_THR) || (Metr_Fr[2] < CIC_THR))) {
			System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at schema Level !! ********");
		}
	else {
		System.out.println("*********  User Choice Framework Metamodels is not semantically aligned  at Schema and instance Level******");
	}
	}
else if (fwsc_class==3) {
	if ((Metr_ROS[0] > SSS_THR) && (Metr_ROS[1] > IRR_THR) && (Metr_ROS[2] > CIC_THR)) {
		System.out.println("*********  User Choice Framework Metamodels is semantically aligned at Schema and instance Level !! ********");
		}
	else if  (( Metr_ROS[0] < SSS_THR) && ((Metr_ROS[1] > IRR_THR) || (Metr_ROS[2] > CIC_THR))) {
		System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at instance Level !! ********");
		}
	else if ((Metr_ROS[0] > SSS_THR) && ((Metr_ROS[1] < IRR_THR) || (Metr_ROS[2] < CIC_THR))) {
			System.out.println("*********  User Choice Framework Metamodels is semantically aligned only at schema Level !! ********");
		}
	else {
		System.out.println("*********  User Choice Framework Metamodels is not semantically aligned  at Schema and instance Level******");
	}
	}

	else {
		System.out.println("*********  User Choice Framework Metamodels is not semantically aligned  at Schema and instance Level******");
	}
	
Scanner sc= new Scanner(System.in);
System.out.println(" Enter The name of the Service SWC Type:");
String str_class= sc.nextLine();


//++++++++++
OWLClass SWCUserType = df5.getOWLClass(iri1+"#"+ str_class);
OWLSubClassOfAxiom w_sub_p251 = df5.getOWLSubClassOfAxiom(SWCUserType, SWCtype);
userOntology.add(w_sub_p251);

man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));




//+++++++

Scanner sc3= new Scanner(System.in);
System.out.println("Enter the number for the respective Communication Paradigm: \n 1. REST  \n 2. RPC  \n 3. Event-Based");
Integer str_class1= sc3.nextInt();

if ((fwsc_class==1) || (fwsc_class==2) || (fwsc_class==3)|| (fwsc_class== 4))
{
	// PORT PROTOTYPES SPECIFICATION
/*
	Scanner fwsc16 =new Scanner(System.in);
	System.out.println(" Enter the number of Provided Service ports for Service SWC Type:");
	int fwsc_class2 = fwsc16.nextInt();
	
	Scanner fwsc17 =new Scanner(System.in);
	System.out.println(" Enter the number of Required Service ports  for Service SWC Type:");
	int fwsc_class3 = fwsc17.nextInt();
*/
	
if(str_class1==2)
{
	Scanner sc4= new Scanner(System.in);
	System.out.println("Enter the number for the Service Interface Type: \n 1. SenderReceiver \n 2.ClientServer");
	Integer str_class2= sc4.nextInt();
	
	if(str_class2==1) {
		Scanner sc5= new Scanner(System.in);
		System.out.println("Enter the name for the Service Interface RPC Method: ");
		String str_class4= sc5.nextLine();
		
		 
		OWLClass SWCUserInterType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p225 = df5.getOWLSubClassOfAxiom(SWCUserInterType, Interfacesubtype_SenderReceiver);
		userOntology.add(w_sub_p225);
		
			
		System.out.println("Method Successfully created!");
		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		
		Scanner sc15= new Scanner(System.in);
		System.out.println("Is this Service Method to be defined for 1. Provided OR 2. Required Service Ports.Please enter the corresponding didit(1/2)? ");
		Integer str_class5= sc15.nextInt();
		
		if(str_class5==1) {

							
				Scanner sc2= new Scanner(System.in);
				System.out.println(" Enter The name of the Provided Service Port Name one at a time:");
				String str_class6= sc2.nextLine();

				OWLClass SWCportprototype = df5.getOWLClass(iri1+"#"+ str_class6+ "_ProvidedPortPrototype");
				OWLSubClassOfAxiom w_sub_p256 = df5.getOWLSubClassOfAxiom(SWCportprototype,SWCtypeporttype);
				userOntology.add(w_sub_p256);

				man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
				
				
			OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
			OWLSubClassOfAxiom w_sub_p227 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype);
			userOntology.add(w_sub_p227);	
			
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (str_class5==2) {
			
			Scanner sc12= new Scanner(System.in);
			System.out.println(" Enter The name of the Required Service Port Name one at a time:");
			String str_class53= sc12.nextLine();

			OWLClass SWCportprototype1 = df5.getOWLClass(iri1+"#"+ str_class53+"_RequiredPortPrototype");
			OWLSubClassOfAxiom w_sub_p2561 = df5.getOWLSubClassOfAxiom(SWCportprototype1,SWCtypeporttype);
			userOntology.add(w_sub_p2561);

			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
		
		OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p227 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype1);
		userOntology.add(w_sub_p227);	
		
		}
		else
			System.out.println(" No valid Provided and Required Service Ports are available for the given RPC Method to be mapped!!");
		
		//+++Metrics Quality Check For Methods Semantic Alignment!!

		if (fwsc_class == 1 &&(( Metr_AR[0] > SSS_THR) && ((Metr_AR[1] > IRR_THR) || (Metr_AR[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (fwsc_class == 2 && (( Metr_Fr[0] > SSS_THR) && ((Metr_Fr[1] > IRR_THR) || (Metr_Fr[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of Franca Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (fwsc_class == 3 && (( Metr_ROS[0] > SSS_THR) && ((Metr_ROS[1] > IRR_THR) || (Metr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of  ROS Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		else if (intswc >= 1 && fwsc_class ==1 && (((Metr_AR_FR[0] > SSS_THR) || (Metr_ROS_AR[0] > SSS_THR))&& ((Metr_AR_FR[1] > IRR_THR) || (Metr_ROS_AR[1] > IRR_THR))&& ((Metr_AR_FR[2] > CIC_THR) || (Metr_ROS_AR[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods w.r.t other FW API Begins....!! ");
			
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
						
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}
		else if (intswc >= 1 && fwsc_class ==2 && (((Metr_Fr_ROS[0] > SSS_THR) || (Metr_AR_FR[0] > SSS_THR))&& ((Metr_AR_FR[1] > IRR_THR) || (Metr_Fr_ROS[1] > IRR_THR))&& ((Metr_AR_FR[2] > CIC_THR) || (Metr_Fr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of Franca Methods w.r.t other FW API Begins....!! ");
		
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	        
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}	
		
		else if (intswc >= 1 && fwsc_class ==3 && (((Metr_Fr_ROS[0] > SSS_THR) || (Metr_ROS_AR[0] > SSS_THR))&& ((Metr_ROS_AR[1] > IRR_THR) || (Metr_Fr_ROS[1] > IRR_THR))&& ((Metr_ROS_AR[2] > CIC_THR) || (Metr_Fr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of ROS Methods w.r.t other FW APIs Begins....!! ");
		
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_SenderReceiver));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}	
			
				else {
			System.out.println("Semantic Alignment of Methods not possible as Evaluated Metric is less than the Threshold....!! ");
		}
		
		//+++ Define Number of Service Instances
				Scanner sc11= new Scanner(System.in);
				System.out.println("Does the Service Method has Service Instances:1. Yes 2. No?");
			    Integer str_chck = sc11.nextInt();
			    if (str_chck == 1) {
			    
			    Scanner sc12= new Scanner(System.in);
				System.out.println("Enter the number of Service Instances: ");
				Integer str_chckn = sc12.nextInt();
				for (int i12=1; i12<= str_chckn; i12++)
				{	
			    Scanner sc7= new Scanner(System.in);
				System.out.println("Enter the name Service Instances: ");
				String str_class6= sc7.nextLine();
				OWLIndividual servinst = df5.getOWLNamedIndividual(iri1 + "#"+ str_class6);
				
			    
			    OWLAxiom b = df5.getOWLSubObjectPropertyOfAxiom(issimilar, iscompatible); 
				OWLAxiom c = df5.getOWLEquivalentObjectPropertiesAxiom(issimilar, iscompatible);
			//	OWLObjectProperty c = df5.getOWLObjectOneOf(str_class6);	
				OWLClassAssertionAxiom ax5 = df5.getOWLClassAssertionAxiom(SWCUserInterType, servinst);
				man.addAxiom(userOntology, ax5);
				OWLObjectPropertyAssertionAxiom assertion6 = df5.getOWLObjectPropertyAssertionAxiom(issimilar, servinst,AtomicSWCType);
				AddAxiom addAxiomChange3 = new AddAxiom(userOntology, assertion6);
				AddAxiom addAxiomChange4 = new AddAxiom(userOntology, c);
				man.applyChange(addAxiomChange3);
				man.applyChange(addAxiomChange4);
				}
			    }
				else
			    {
			    	System.out.println("The Service Method has no Service Instances!!!");
			    }
			    
							
					
		//++++++ YAML MAPPINGs!!
		final String myfilename = "C:/Backup_uids2837_from_C_Drive/uids2837/eclipse-workspace_testprotege/msc1/src/main/resources/test3.yaml";
		InputStream myinputfile = new FileInputStream(new File("src/main/resources/test1.yaml"));
		System.out.println("***YAML***");
		System.out.println("***++++++++***");
		Yaml yaml1 = new Yaml();
		@SuppressWarnings("unchecked")
		Map<String, Object> mydata = (Map<String, Object>) yaml1.load(myinputfile);
		System.out.println(mydata);

		//find a key in the input stream

		Map<String, Object> dataMap1 = new LinkedHashMap<>();
		String str1= null;
		String str2 = "VehicleOntologyChoreography";
		String str3 = "Apache2.0" ;
		String str4 = str_class;
		String str5 = ""+iri1+"#"+str4 ;
		String str6= "Generic API Mocking";
		String str7= "1.0.0";
		String str8= "\n";

		//Separate indentation levels data mapping
		if(mydata.containsKey("info")){
		dataMap1.put("info", str1+str8 );
		dataMap1.put("  title",str2+str8 );
		dataMap1.put("  licence", str3+str8 );
		dataMap1.put("  nameofthecomponent", str_class+str8 );
		dataMap1.put("  url", str5+str8);
		dataMap1.put("  description", "AUTOSAR_Adaptive" + "framework");
		dataMap1.put("  version", str7+str8 );


		if (mydata.containsKey("components")){
		dataMap1.put("components", str1+str8 );	
		dataMap1.put("  attributes", str1+str8 );
		dataMap1.put("    methods", str_class4+ str8);
		if (str_class5==2) {
			dataMap1.put("    required",str_class4 + str8);
			}
			else if (str_class5==1) {
				dataMap1.put("    provided",str_class4 + str8);	
			}
			else {
				System.out.println("***No Ports to display***");
			}
		dataMap1.put("      name", iri1+"#"+str_class4+str8 );
		dataMap1.put("      description", "RPC based Sender-Receiver" +  str8  );
		dataMap1.put("      schema", str1+str8 );
		dataMap1.put("      in", str1+str8 );
		
		
		}

		FileWriter writer = new FileWriter(myfilename);
		yaml1.dump( dataMap1, writer );
		System.out.println(dataMap1);
		}
		
			
	}
	else {
		Scanner sc5= new Scanner(System.in);
		System.out.println("Enter the name for the Service Interface RPC Method: ");
		String str_class4= sc5.nextLine();
		
		OWLClass SWCUserInterType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p226 = df5.getOWLSubClassOfAxiom(SWCUserInterType, Interfacesubtype_ClientServer);
		userOntology.add(w_sub_p226);
		
		System.out.println("Method Successfully created!");
		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		
		Scanner sc15= new Scanner(System.in);
		System.out.println("Is this Service Method to be defined for 1. Provided OR 2. Required Service Ports.Please enter the corresponding didit(1/2)? ");
		Integer str_class5= sc15.nextInt();
		
		if(str_class5==1) {

							
				Scanner sc2= new Scanner(System.in);
				System.out.println(" Enter The name of the Provided Service Port Name one at a time:");
				String str_class6= sc2.nextLine();

				OWLClass SWCportprototype = df5.getOWLClass(iri1+"#"+ str_class6+ "_ProvidedPortPrototype");
				OWLSubClassOfAxiom w_sub_p256 = df5.getOWLSubClassOfAxiom(SWCportprototype,SWCtypeporttype);
				userOntology.add(w_sub_p256);

				man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
				
				
			OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
			OWLSubClassOfAxiom w_sub_p227 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype);
			userOntology.add(w_sub_p227);	
			
			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (str_class5==2) {
			
			Scanner sc12= new Scanner(System.in);
			System.out.println(" Enter The name of the Required Service Port Name one at a time:");
			String str_class53= sc12.nextLine();

			OWLClass SWCportprototype1 = df5.getOWLClass(iri1+"#"+ str_class53+"_RequiredPortPrototype");
			OWLSubClassOfAxiom w_sub_p2561 = df5.getOWLSubClassOfAxiom(SWCportprototype1,SWCtypeporttype);
			userOntology.add(w_sub_p2561);

			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
		
		OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p227 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype1);
		userOntology.add(w_sub_p227);	
		
		}
		else
			System.out.println(" No valid Provided and Required Service Ports are available for the given RPC Method to be mapped!!");
		
		
		//+++ Equivalent axioms
		
		if (fwsc_class == 1 &&(( Metr_AR[0] > SSS_THR) && ((Metr_AR[1] > IRR_THR) || (Metr_AR[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (fwsc_class == 2 && (( Metr_Fr[0] > SSS_THR) && ((Metr_Fr[1] > IRR_THR) || (Metr_Fr[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of Franca Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		
		else if (fwsc_class == 3 && (( Metr_ROS[0] > SSS_THR) && ((Metr_ROS[1] > IRR_THR) || (Metr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of  ROS Methods Begins....!! ");
		
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		}
		else if (intswc >= 1 && fwsc_class ==1 && (((Metr_AR_FR[0] > SSS_THR) || (Metr_ROS_AR[0] > SSS_THR))&& ((Metr_AR_FR[1] > IRR_THR) || (Metr_ROS_AR[1] > IRR_THR))&& ((Metr_AR_FR[2] > CIC_THR) || (Metr_ROS_AR[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods w.r.t other FW API  Begins....!! ");
		
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}	
		else if (intswc >= 1 && fwsc_class ==2 && (((Metr_Fr_ROS[0] > SSS_THR) || (Metr_AR_FR[0] > SSS_THR))&& ((Metr_AR_FR[1] > IRR_THR) || (Metr_Fr_ROS[1] > IRR_THR))&& ((Metr_AR_FR[2] > CIC_THR) || (Metr_Fr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of Franca Methods w.r.t other FW API Begins....!! ");
		
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
						
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}	
		else if (intswc >= 1 && fwsc_class ==3 && (((Metr_Fr_ROS[0] > SSS_THR) || (Metr_ROS_AR[0] > SSS_THR))&& ((Metr_ROS_AR[1] > IRR_THR) || (Metr_Fr_ROS[1] > IRR_THR))&& ((Metr_ROS_AR[2] > CIC_THR) || (Metr_Fr_ROS[2] > CIC_THR)))) 
		{
			System.out.println("Semantic Alignment of ROS Methods w.r.t other FW API  Begins....!! ");
			
			OWLAxiom a1 = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_ClientServer));
	        userOntology.add(a1);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3)); 
						
			OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(SWCUserInterType));
	        userOntology.add(a);
	        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		   
		}	
	
		else {
			System.out.println("Semantic Alignment of Methods Not possible as Evaluated Metric is less than the Threshold....!! ");
		}
		
		//+++ Define Number of Service Instances
		Scanner sc11= new Scanner(System.in);
		System.out.println("Does the Service Method has Service Instances:1. Yes 2. No?");
	    Integer str_chck = sc11.nextInt();
	    if (str_chck == 1) {
	    
	    Scanner sc12= new Scanner(System.in);
		System.out.println("Enter the number of Service Instances: ");
		Integer str_chckn = sc12.nextInt();
		for (int i12=1; i12<= str_chckn; i12++)
		{	
	    Scanner sc7= new Scanner(System.in);
		System.out.println("Enter the name Service Instances: ");
		String str_class6= sc7.nextLine();
		OWLIndividual servinst = df5.getOWLNamedIndividual(iri1 + "#"+ str_class6);
		
	    
	    OWLAxiom b = df5.getOWLSubObjectPropertyOfAxiom(issimilar, iscompatible); 
		OWLAxiom c = df5.getOWLEquivalentObjectPropertiesAxiom(issimilar, iscompatible);
	//	OWLObjectProperty c = df5.getOWLObjectOneOf(str_class6);	
		OWLClassAssertionAxiom ax5 = df5.getOWLClassAssertionAxiom(SWCUserInterType, servinst);
		man.addAxiom(userOntology, ax5);
		OWLObjectPropertyAssertionAxiom assertion6 = df5.getOWLObjectPropertyAssertionAxiom(issimilar, servinst,AtomicSWCType);
		AddAxiom addAxiomChange3 = new AddAxiom(userOntology, assertion6);
		AddAxiom addAxiomChange4 = new AddAxiom(userOntology, c);
		man.applyChange(addAxiomChange3);
		man.applyChange(addAxiomChange4);
		}
	    }
		else
	    {
	    	System.out.println("The Service Method has no Service Instances!!!");
	    }
	    
	  //++++++ YAML MAPPINGs!!
	  		final String myfilename = "C:/Backup_uids2837_from_C_Drive/uids2837/eclipse-workspace_testprotege/msc1/src/main/resources/test4.yaml";
	  		InputStream myinputfile = new FileInputStream(new File("src/main/resources/test1.yaml"));
	  		System.out.println("***YAML***");
	  		System.out.println("***++++++++***");
	  		Yaml yaml1 = new Yaml();
	  		@SuppressWarnings("unchecked")
	  		Map<String, Object> mydata = (Map<String, Object>) yaml1.load(myinputfile);
	  		System.out.println(mydata);

	  		//find a key in the input stream

	  		Map<String, Object> dataMap1 = new LinkedHashMap<>();
	  		String str1= null;
	  		String str2 = "VehicleOntologyChoreography";
	  		String str3 = "Apache2.0" ;
	  		String str4 = str_class;
	  		String str5 = ""+iri1+"#"+str4 ;
	  		String str6= "Generic API Mocking";
	  		String str7= "1.0.0";
	  		String str8= "\n";

	  		//Separate indentation levels data mapping
	  		if(mydata.containsKey("info")){
	  		dataMap1.put("info", str1+str8 );
	  		dataMap1.put("  title",str2+str8 );
	  		dataMap1.put("  licence", str3+str8 );
	  		dataMap1.put("  nameofthecomponent", str_class+str8 );
	  		dataMap1.put("  url", str5+str8);
	  		dataMap1.put("  description", "AUTOSAR_Adaptive" + "framework");
	  		dataMap1.put("  version", str7+str8 );


	  		if (mydata.containsKey("components")){
	  		dataMap1.put("components", str1+str8 );	
	  		dataMap1.put("  attributes", str1+str8 );
	  		dataMap1.put("    methods", str_class4+ str8 );
	  		if (str_class5==2) {
				dataMap1.put("    required",str_class4 + str8);
				}
				else if (str_class5==1) {
					dataMap1.put("    provided",str_class4 + str8);	
				}
				else {
					System.out.println("***No Ports to display***");
				}
	  		dataMap1.put("      name", iri1+"#"+str_class4+str8 );
	  		dataMap1.put("      description", "RPC based Client_Receiver"  + str8  );
	  		dataMap1.put("      schema", str1+str8 );
	  		dataMap1.put("      in", str1+str8 );
	  		
	  		
	  		}

	  		FileWriter writer = new FileWriter(myfilename);
	  		yaml1.dump( dataMap1, writer );
	  		System.out.println(dataMap1);
	  		}
	  		
	  			  
					
	}
	
}
else if(str_class1==1)
{
	Scanner sc5= new Scanner(System.in);
	System.out.println("Enter the name for the Service Interface HTTP Method: ");
	String str_class4= sc5.nextLine();
	
	OWLClass SWCUserInterType = df5.getOWLClass(iri1+"#"+str_class4);
	OWLSubClassOfAxiom w_sub_p227 = df5.getOWLSubClassOfAxiom(SWCUserInterType,Interfacesubtype_httpmethodcall);
	userOntology.add(w_sub_p227);
	
	
	System.out.println("Method Successfully created!");
	man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	
	Scanner sc15= new Scanner(System.in);
	System.out.println("Is this Service Method to be defined for 1. Provided OR 2. Required Service Ports.Please enter the corresponding didit(1/2)? ");
	Integer str_class5= sc15.nextInt();
	
	if(str_class5==1) {

						
			Scanner sc2= new Scanner(System.in);
			System.out.println(" Enter The name of the Provided Service Port Name one at a time:");
			String str_class6= sc2.nextLine();

			OWLClass SWCportprototype = df5.getOWLClass(iri1+"#"+ str_class6+ "_ProvidedPortPrototype");
			OWLSubClassOfAxiom w_sub_p256 = df5.getOWLSubClassOfAxiom(SWCportprototype,SWCtypeporttype);
			userOntology.add(w_sub_p256);

			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
			
		OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p229 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype);
		userOntology.add(w_sub_p229);	
		
		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (str_class5==2) {
		
		Scanner sc12= new Scanner(System.in);
		System.out.println(" Enter The name of the Required Service Port Name one at a time:");
		String str_class53= sc12.nextLine();

		OWLClass SWCportprototype1 = df5.getOWLClass(iri1+"#"+ str_class53+"_RequiredPortPrototype");
		OWLSubClassOfAxiom w_sub_p2561 = df5.getOWLSubClassOfAxiom(SWCportprototype1,SWCtypeporttype);
		userOntology.add(w_sub_p2561);

		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		
	
	OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
	OWLSubClassOfAxiom w_sub_p229 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype1);
	userOntology.add(w_sub_p229);	
	
	}
	else
		System.out.println(" No valid Provided and Required Service Ports are available for the given RPC Method to be mapped!!");
	
	
	
	//+++Equivalence Axioms+++++
	
	if (fwsc_class == 1 &&(( Metr_AR[0] > SSS_THR) && ((Metr_AR[1] > IRR_THR) || (Metr_AR[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (fwsc_class == 2 && (( Metr_Fr[0] > SSS_THR) && ((Metr_Fr[1] > IRR_THR) || (Metr_Fr[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of Franca Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (fwsc_class == 3 && (( Metr_ROS[0] > SSS_THR) && ((Metr_ROS[1] > IRR_THR) || (Metr_ROS[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of  ROS Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else {
		System.out.println("Semantic Alignment of Methods Not possible as Evaluated Metric is less than the Threshold....!! ");
	}
	
		//+++ Define Number of Service Instances
			Scanner sc11= new Scanner(System.in);
			System.out.println("Does the Service Method has Service Instances:1. Yes 2. No?");
		    Integer str_chck = sc11.nextInt();
		    if (str_chck == 1) {
		    
		    Scanner sc12= new Scanner(System.in);
			System.out.println("Enter the number of Service Instances: ");
			Integer str_chckn = sc12.nextInt();
			for (int i12=1; i12<= str_chckn; i12++)
			{	
		    Scanner sc7= new Scanner(System.in);
			System.out.println("Enter the name Service Instances: ");
			String str_class6= sc7.nextLine();
			OWLIndividual servinst = df5.getOWLNamedIndividual(iri1 + "#"+ str_class6);
			
			OWLClassAssertionAxiom ax5 = df5.getOWLClassAssertionAxiom(SWCUserInterType, servinst);
			man.addAxiom(userOntology, ax5);
			}
		    }
		    else
		    {
		    	System.out.println("The Service Method has no Service Instances!!!");
		    }
		    
		  //++++++ YAML MAPPINGs!!
	  		final String myfilename = "C:/Backup_uids2837_from_C_Drive/uids2837/eclipse-workspace_testprotege/msc1/src/main/resources/test5.yaml";
	  		InputStream myinputfile = new FileInputStream(new File("src/main/resources/test1.yaml"));
	  		System.out.println("***YAML***");
	  		System.out.println("***++++++++***");
	  		Yaml yaml1 = new Yaml();
	  		@SuppressWarnings("unchecked")
	  		Map<String, Object> mydata = (Map<String, Object>) yaml1.load(myinputfile);
	  		System.out.println(mydata);

	  		//find a key in the input stream

	  		Map<String, Object> dataMap1 = new LinkedHashMap<>();
	  		String str1= null;
	  		String str2 = "VehicleOntologyChoreography";
	  		String str3 = "Apache2.0" ;
	  		String str4 = str_class;
	  		String str5 = ""+iri1+"#"+str4 ;
	  		String str6= "Generic API Mocking";
	  		String str7= "1.0.0";
	  		String str8= "\n";

	  		//Separate indentation levels data mapping
	  		if(mydata.containsKey("info")){
	  		dataMap1.put("info", str1+str8 );
	  		dataMap1.put("  title",str2+str8 );
	  		dataMap1.put("  licence", str3+str8 );
	  		dataMap1.put("  nameofthecomponent", str_class+str8 );
	  		dataMap1.put("  url", str5+str8);
	  		dataMap1.put("  description", "AUTOSAR_Adaptive" + "framework");
	  		dataMap1.put("  version", str7+str8 );


	  		if (mydata.containsKey("components")){
	  		dataMap1.put("components", str1+str8 );	
	  		dataMap1.put("  attributes", str1+str8 );
	  		dataMap1.put("    methods", str_class4+ str8 );
	  		if (str_class5==2) {
				dataMap1.put("    required",str_class4 + str8);
				}
				else if (str_class5==1) {
					dataMap1.put("    provided",str_class4 + str8);	
				}
				else {
					System.out.println("***No Ports to display***");
				}
	  		dataMap1.put("      name", iri1+"#"+str_class4+str8 );
	  		dataMap1.put("      description", "REST based HTTP_Method" + str8  );
	  		dataMap1.put("      schema", str1+str8 );
	  		dataMap1.put("      in", str1+str8 );
	  		
	  		
	  		}

	  		FileWriter writer = new FileWriter(myfilename);
	  		yaml1.dump( dataMap1, writer );
	  		System.out.println(dataMap1);
	  		}
	  		
		    
	
}
else
{
	Scanner sc5= new Scanner(System.in);
	System.out.println("Enter the name of the Service Interface Event: ");
	String str_class4= sc5.nextLine();
	
	OWLClass SWCUserInterType = df5.getOWLClass(iri1+"#"+str_class4);
	OWLSubClassOfAxiom w_sub_p228 = df5.getOWLSubClassOfAxiom(SWCUserInterType,Interfacesubtype_PublishSubscribe);
	userOntology.add(w_sub_p228);
	
	
	System.out.println("The Event Successfully created!");
	man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	
	Scanner sc15= new Scanner(System.in);
	System.out.println("Is this Service Method to be defined for 1. Provided OR 2. Required Service Ports.Please enter the corresponding didit(1/2)? ");
	Integer str_class5= sc15.nextInt();
	
	if(str_class5==1) {

						
			Scanner sc2= new Scanner(System.in);
			System.out.println(" Enter The name of the Provided Service Port Name one at a time:");
			String str_class6= sc2.nextLine();

			OWLClass SWCportprototype = df5.getOWLClass(iri1+"#"+ str_class6+ "_ProvidedPortPrototype");
			OWLSubClassOfAxiom w_sub_p256 = df5.getOWLSubClassOfAxiom(SWCportprototype,SWCtypeporttype);
			userOntology.add(w_sub_p256);

			man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
			
			
		OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
		OWLSubClassOfAxiom w_sub_p229 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype);
		userOntology.add(w_sub_p229);	
		
		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (str_class5==2) {
		
		Scanner sc12= new Scanner(System.in);
		System.out.println(" Enter The name of the Required Service Port Name one at a time:");
		String str_class53= sc12.nextLine();

		OWLClass SWCportprototype1 = df5.getOWLClass(iri1+"#"+ str_class53+"_RequiredPortPrototype");
		OWLSubClassOfAxiom w_sub_p2561 = df5.getOWLSubClassOfAxiom(SWCportprototype1,SWCtypeporttype);
		userOntology.add(w_sub_p2561);

		man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
		
	
	OWLClass SWCUserMethodType = df5.getOWLClass(iri1+"#"+str_class4);
	OWLSubClassOfAxiom w_sub_p229 = df5.getOWLSubClassOfAxiom(SWCUserMethodType, SWCportprototype1);
	userOntology.add(w_sub_p229);	
	
	}
	else
		System.out.println(" No valid Provided and Required Service Ports are available for the given RPC Method to be mapped!!");
	
	
	
	//++++Equivalence Axioms+++++
	
	if (fwsc_class == 1 &&(( Metr_AR[0] > SSS_THR) && ((Metr_AR[1] > IRR_THR) || (Metr_AR[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of AUTOSAR Adaptive Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (fwsc_class == 2 && (( Metr_Fr[0] > SSS_THR) && ((Metr_Fr[1] > IRR_THR) || (Metr_Fr[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of Franca Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else if (fwsc_class == 3 && (( Metr_ROS[0] > SSS_THR) && ((Metr_ROS[1] > IRR_THR) || (Metr_ROS[2] > CIC_THR)))) 
	{
		System.out.println("Semantic Alignment of  ROS Methods Begins....!! ");
	
		OWLAxiom a = df5.getOWLEquivalentClassesAxiom(df5.getOWLClass(SWCUserInterType), df5.getOWLClass(Interfacesubtype_httpmethodcall));
        userOntology.add(a);
        man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));
	}
	
	else {
		System.out.println("Semantic Alignment of Methods Not possible as Evaluated Metric is less than the Threshold....!! ");
	}
	
	
	//++++++ YAML MAPPINGs!!
		final String myfilename = "C:/Backup_uids2837_from_C_Drive/uids2837/eclipse-workspace_testprotege/msc1/src/main/resources/test5.yaml";
		InputStream myinputfile = new FileInputStream(new File("src/main/resources/test1.yaml"));
		System.out.println("***YAML***");
		System.out.println("***++++++++***");
		Yaml yaml1 = new Yaml();
		@SuppressWarnings("unchecked")
		Map<String, Object> mydata = (Map<String, Object>) yaml1.load(myinputfile);
		System.out.println(mydata);

		//find a key in the input stream

		Map<String, Object> dataMap1 = new LinkedHashMap<>();
		String str1= null;
		String str2 = "VehicleOntologyChoreography";
		String str3 = "Apache2.0" ;
		String str4 = str_class;
		String str5 = ""+iri1+"#"+str4 ;
		String str6= "Generic API Mocking";
		String str7= "1.0.0";
		String str8= "\n";

		//Separate indentation levels data mapping
		if(mydata.containsKey("info")){
		dataMap1.put("info", str1+str8 );
		dataMap1.put("  title",str2+str8 );
		dataMap1.put("  licence", str3+str8 );
		dataMap1.put("  nameofthecomponent", str_class+str8 );
		dataMap1.put("  url", str5+str8);
		dataMap1.put("  description", "AUTOSAR_Adaptive" + "framework");
		dataMap1.put("  version", str7+str8 );


		if (mydata.containsKey("components")){
		dataMap1.put("components", str1+str8 );	
		dataMap1.put("  attributes", str1+str8 );
		dataMap1.put("    events", str_class4+ str8 );
		if (str_class5==2) {
		dataMap1.put("    subscribed",str_class4 + str8);
		}
		else if (str_class5==1) {
			dataMap1.put("    published",str_class4 + str8);	
		}
		else {
			System.out.println("***No Ports to display***");
		}
		dataMap1.put("      name", iri1+"#"+str_class4+str8 );
		dataMap1.put("      description", "REST based HTTP_Method" + str8  );
		dataMap1.put("      schema", str1+str8 );
		dataMap1.put("      in", str1+str8 );
		
		
		}

		FileWriter writer = new FileWriter(myfilename);
		yaml1.dump( dataMap1, writer );
		System.out.println(dataMap1);
		}
		
	
}
}

man.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(file3));


i++;
}

while (i<= intswc && i>=1);

//+++++++++++++++++++++++++++++++++INTER_GROUP Semantic Matching+++++++++++++++++++++++++++++++++++++++++++++++++


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//Mapping SuperClasses to .yaml:After extracting required query result from reasoner for properties and classes, map the owl classes to schema objects of the .yaml file attached



//Mapping the employee from the YAML file to the Employee class

//System.out.println(data);
System.out.println("Finished!");

//ObjectMapper objectMapper = new YAMLMapper();

}

//++++++
//Display number of Subclasses to infer equivalence SWRL rule
System.out.println(" \t**--SubClasses Extraction and Reasoning--**:");
System.out.println(" \t**--SubClasses For HTTP Methods--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#HTTP_Methods"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For HTTP Methods--**:");
r.getEquivalentClasses(Interfacesubtype_httpmethodcall);

System.out.println(" \t**--SubClasses For Client-Server Methods--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ClientServer"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For Client Server--**:");
r.getEquivalentClasses(Interfacesubtype_ClientServer);

System.out.println(" \t**--SubClasses For Broadcasts--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#Broadcast"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For Broadcast--**:");
r.getEquivalentClasses(Interfacetype_Broadacast);

System.out.println(" \t**--SubClasses For SWCType--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#ServiceSWCType"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For SWCType--**:");
r.getEquivalentClasses(SWCtype);

System.out.println(" \t**--SubClasses For Sender-Receiver Methods--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#SenderReceiver"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For SenderReceiver--**:");
r.getEquivalentClasses(Interfacesubtype_SenderReceiver);

System.out.println(" \t**--SubClasses For Publisch-Subscribe Methods--**:");
r.getSubClasses(df5.getOWLClass("http://www.semanticweb.org/owlapi/ontologies/ontology#VehicleServie_Ontology#PublishSubscribe"), false).forEach(System.out::println);
System.out.println(" \t**--EquivalentClasses For Publish-Subscribe--**:");
r.getEquivalentClasses(Interfacesubtype_PublishSubscribe);

//How to set and get equivalent ontologies
class DLQueryEngine {
    private final OWLReasoner reasoner;
    private final DLQueryParser parser;
    public DLQueryEngine(OWLReasoner reasoner, ShortFormProvider shortFormProvider) {
        this.reasoner = reasoner;
        parser = new DLQueryParser();
    }
    
    public Set<OWLClass> getEquivalentClasses(String classExpressionString) {
        if (classExpressionString.trim().length() == 0) {
            return Collections.emptySet();
        }
        OWLClassExpression classExpression = parser
                .parseClassExpression(classExpressionString);
        
        System.out.println(" \t**--EquivalentClasses For Client Server--**:");
        System.out.println(" \t**--EquivalentClasses for http Methods--**:");
        
        Node<OWLClass> equivalentClasses = reasoner.getEquivalentClasses(Interfacesubtype_ClientServer);
       //***Print the number of equivalent classes 
        Node<OWLClass> equivalentClasses1 = reasoner.getEquivalentClasses(Interfacesubtype_httpmethodcall); 
        Set<OWLClass> result = null;
        if (classExpression.isAnonymous()) {
            result = equivalentClasses.getEntities();
        } else {
            result = equivalentClasses.getEntitiesMinus(classExpression.asOWLClass());
        }
        if (classExpression.isAnonymous()) {
            result = equivalentClasses1.getEntities();
        } else {
            result = equivalentClasses1.getEntitiesMinus(classExpression.asOWLClass());
        }
        return result;
        }
}

//++++XSD Parser+++++//



//}

} catch (OWLOntologyCreationException e) {
	System.out.println("You made an Invalid Choice!!");
e.printStackTrace();
}
}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static void elseif() {
		// TODO Auto-generated method stub
		
	}
}


