package owlapi.tutorial;
import owlapi.tutorial.*;

import java.io.FileNotFoundException;

import org.semanticweb.owlapi.model.OWLClass;
import org.w3schools.io.yaml.DatabaseConfig5;

import java.io.File;
import java.io.FileInputStream;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.yaml.snakeyaml.Yaml;

import com.google.common.base.Strings;

public class DatabaseConfig4 {
	private String inventoryitem;
	private String type;
	private DatabaseConfig5 properties;
	
	public  String getInventoryitem() {
		return inventoryitem;
		
	}
	public void setInventoryitem(String WCtype) {
		this.inventoryitem=WCtype;
		
	}

	public String gettype() {
		
		return type;
		
	}
	public void settype(String typ) {
		this.type=typ;
		
	}
	@Override
	public String toString() {
		return "\nInventoryItem: " + inventoryitem + "\ntype:"+ type+ "\n";
		
	}
	/*
	public static void main(Strings[]args) throws FileNotFoundException {
		DatabaseConfig4 dbconf4 = new DatabaseConfig4();
}*/
}
