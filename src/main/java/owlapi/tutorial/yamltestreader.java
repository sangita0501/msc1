package owlapi.tutorial;
//package org.w3schools.io.yaml;

//package org.w3schools.io.yaml;
import java.io.File;


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
public class yamltestreader {
    public yamltestreader() {
    }
    private String author;
    private DatabaseConfig database;
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public DatabaseConfig getDatabase() {
        return database;
    }
    public void setDatabase(DatabaseConfig database) {
        this.database = database;
    }
    @Override
    public String toString() {
        return "\nAuthor: " + author 
        + "\ndatabase: " + database + "\n";
    }
}

