package org.w3schools.io.yaml;

import owlapi.tutorial.DatabaseConfig;
import owlapi.tutorial.DatabaseConfig4;
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

public class DatabaseConfig3 {
	private String components;
	private DatabaseConfig4 schemas;
	
	public String getComponents() {
		return components;
		
	}
	public void setComponents(String comp) {
		this.components=comp;
		
	}
	
	@Override
	public String toString() {
		return "\ncomponents: " + components  + "\n";
	}
	public static void main(Strings[]args) throws FileNotFoundException {
		DatabaseConfig3 dbconf3 = new DatabaseConfig3();
}
}
