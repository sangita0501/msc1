package owlapi.tutorial;


 

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.Writer;
	import java.net.URI;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.Set;
	import java.io.BufferedReader; 
	import java.io.IOException; 
	import java.util.Scanner; 
	import java.io.InputStreamReader; 


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
	import org.semanticweb.owlapi.reasoner.OWLReasoner;
	import org.semanticweb.owlapi.search.EntitySearcher;
	import org.semanticweb.owlapi.util.DefaultPrefixManager;
	import org.semanticweb.owlapi.util.SimpleIRIMapper;

	//****ONTOLOGY PARSER FOR GENERATION OF DOMAIN INTERFACE MODEL TEMPLATE****

	public class OWLtoAPI {	
		private static final OWLEntity OWLEntity = null;
		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws OWLOntologyCreationException, OWLOntologyStorageException, FileNotFoundException, IOException {
			
	        //***Loading Existing Ontologies on User's Choice****//
	      
	     // Load an ontology from the Web
	    
	        
	        
			//******//
			OWLOntologyManager man = OWLManager.createOWLOntologyManager();
			/*
			 IRI iri = IRI.create(s);
		     OWLOntology pizzaOntology = man.loadOntologyFromOntologyDocument(iri);
		     System.out.println("Loaded ontology: " + pizzaOntology);
			*/
			
			File file = new File("C:\\Backup_from_D_Drive\\DSUsers\\uids2837\\model\\merged3ont.owl");
			File fileout = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\test.owl");
			OWLOntology o = man.loadOntologyFromOntologyDocument(file);
			OWLDocumentFormat format = man.getOntologyFormat(o);
			System.out.println(" format: " + format);
			OWLDataFactory factory = man.getOWLDataFactory();
			IRI documentIRI = IRI.create("file:/tmp/MyOnt.owl");
			OWLDataFactory da = o.getOWLOntologyManager().getOWLDataFactory();
			OWLClass MyClass = da.getOWLClass(documentIRI+"#A");
			SetOntologyID i;
			man.saveOntology(o, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));
			
					System.out.println("Loaded_ontology:"+o);
					try {
						o = man.createOntology();
						for(OWLAxiom ax:o.getLogicalAxioms())
						{
							System.out.println(ax);
							//iterate over the axioms to filter entities by name
							
							owlClassNameEndWithSWC(OWLEntity);
							
						 }
						System.out.println(o);
						Generate_ServiceConcept_Template();
											
						} catch (OWLOntologyCreationException e) {
						 e.printStackTrace();
						 }
					//**************//
							
				}

			
		
	private static boolean owlClassNameEndWithSWC(OWLEntity e) {
			return !e.isBuiltIn()&&e.getIRI().getRemainder().orElse("").endsWith("SWC");
		 }
	public static void Generate_ServiceConcept_Template() throws OWLOntologyStorageException, FileNotFoundException, IOException {
		
		//Loading of semantically equivalent ontologies
		OWLOntologyManager man2 = OWLManager.createOWLOntologyManager();
		
		OWLOntology o1;
				try {
					
					//+++List of Existing Ontologies++++//
		String[] ArrFiles = { 
				"http://www.semanticweb.org/uids2837/ontologies/2020/0/untitled-ontology-49",
				"http://www.semanticweb.org/uids2837/ontologies/2020/4/untitled-ontology-57",
				"http://www.semanticweb.org/uids2837/ontologies/2020/0/untitled-ontology-32",
				"",	
		};	
		//Load and Save a local copy of an existing Ontology from Web based on User's choice 
				//Enter data using BufferReader 
		
				System.out.println("Enter the IRI of the Existing Ontology");
				Scanner in = new Scanner(System.in); 
				  
		        String s = in.nextLine(); 
		        System.out.println("You entered string "+s); 
		        
		        //**Save ontologies**//
		
		        
		       // File file3 = new File("D:\\DSUsers\\uids2837\\model\\franca1 .owl");
				
		        File file3 = new File ("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\msc1\\src\\main\\resources\\"+ s + ".owl");
		        if(!file3.exists())
		        {
		        	System.out.println("Invalid Choice");
		        }
		        else {
		        File fileout = new File("C:\\Backup_uids2837_from_C_Drive\\uids2837\\eclipse-workspace_testprotege\\testlocal.owl");
		        OWLOntology userOntology = man2.loadOntologyFromOntologyDocument(file3);
		        System.out.println("Loaded ontology: " + userOntology);
		        
		       
		        
		        OWLDocumentFormat format1 = man2.getOntologyFormat(userOntology);
				System.out.println(" format: " + format1);
				OWLDataFactory factory1 = man2.getOWLDataFactory();
				IRI documentIRI1 = IRI.create("file:/tmp/FrancaOnt.owl");
				
		       
		        //String Prefix
	 			System.out.println("Enter the prefix of the abbreviated IRIs of the Loaded Ontology");
				Scanner prefix = new Scanner(System.in); 
				  
		        String s1 = prefix.nextLine(); 
		        System.out.println("You entered string "+s1);  
		        
		        OWLDataFactory da2 = userOntology.getOWLOntologyManager().getOWLDataFactory();
				OWLClass MyClass = da2.getOWLClass(documentIRI1+"#"+ s1 + "CompositionComponentPrototype");
				if(!MyClass.isOWLClass())
				{
					
				}
				SetOntologyID i;
				man2.saveOntology(userOntology, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout));
		        
	 
				
		         
		        
		             
		        
		        
		  
		File fileout1 = new File("C:\\Users\\uids2837\\eclipse-workspace_testprotege\\test1.owl");
		//IRI creation
		IRI iri = IRI.create("http://www.semanticweb.org/uids2837/owlapi/ontologies/ontology#KnowledgeDomain_Template");
		o1 = man2.createOntology(IRI.create(
				"http://www.semanticweb.org/owlapi/ontologies/ontology"));
		//++++++++//
		
		OWLDataFactory df5 = o1.getOWLOntologyManager().getOWLDataFactory();
		OWLClass Systemspec = df5.getOWLClass(iri+"#System_spec");
		OWLDeclarationAxiom da5 = df5.getOWLDeclarationAxiom(Systemspec);
		o1.add(da5);
		
		
		
		OWLDataFactory df = o1.getOWLOntologyManager().getOWLDataFactory();
		OWLClass CompSWCtype = df.getOWLClass(iri+"#CompositionSWCType");
		OWLDeclarationAxiom da = df.getOWLDeclarationAxiom(CompSWCtype);
		o1.add(da);
		
		OWLSubClassOfAxiom w_sub_p5 = df.getOWLSubClassOfAxiom(CompSWCtype,Systemspec);
		OWLObjectProperty CompSWC = df.getOWLObjectProperty(iri + "#typeof");
		o1.add(w_sub_p5);
		
		OWLClass SWCtype = df.getOWLClass(iri+"#SWCType");
		OWLDeclarationAxiom da1 = df.getOWLDeclarationAxiom(SWCtype);
		//Create an array of relevant concepts or classes belong to SWCtype concept
		
		//Below line belongs to Generate_ServiceHierachy_Template()
		OWLSubClassOfAxiom w_sub_p = df.getOWLSubClassOfAxiom(SWCtype, CompSWCtype);
		OWLObjectProperty AtomicSWC = df.getOWLObjectProperty(iri + "#typeof");
//		OWLSubClassOfAxiom ax = df.getOWLSubClassOfAxiom(df.getOWLObjectSomeValuesFrom(AtomicSWC, SWCtype);
		o1.add(w_sub_p);
		
		// Specification of Concepts Grammer for Domain ontology using OWL API Parser
		OWLClass Name = df.getOWLClass(iri+"#NamesofSWC_AllFWs");
		OWLSubClassOfAxiom Name_p = df.getOWLSubClassOfAxiom(Name, SWCtype);
		o1.add(Name_p);
		
		OWLClass Grounding = df.getOWLClass(iri+"#ServiceInterfaceGrounding");
		OWLSubClassOfAxiom Grounding1 = df.getOWLSubClassOfAxiom(Grounding, SWCtype);
		o1.add(Grounding1);
		
		
		OWLClass AtomicGrounding = df.getOWLClass(iri+"#AtomicServiceInterfaceGrounding");
		OWLSubClassOfAxiom AtomicGrounding1 = df.getOWLSubClassOfAxiom(AtomicGrounding, SWCtype);
		o1.add(AtomicGrounding1);
		
		
		
		//Set SWC Type Profile
		OWLDeclarationAxiom da21 = df.getOWLDeclarationAxiom(MyClass);
		OWLSubClassOfAxiom w_sub_p1 = df.getOWLSubClassOfAxiom(MyClass, CompSWCtype);
		o1.add(w_sub_p1);
		
		
		

		
		
		//++++++++++++++//
		System.out.println(o1);
		man2.saveOntology(o1, new FunctionalSyntaxDocumentFormat(), new FileOutputStream(fileout1));
		}
	}	catch (OWLOntologyCreationException e) {
		 e.printStackTrace();
		 }
	}
	//public static void Generate_Service_Hierarchy_Template() {
		
	//}

	
	/*/**
	 * Given an ontology and a set of objects, return all equivalent objects of the starting set.
	*
	* @param ontology OWLOntology to retrieve equivalents from
	* @param objects Set of OWLObjects to get equivalents of
	* @return set of equivalent OWLObjects
	*/


}
