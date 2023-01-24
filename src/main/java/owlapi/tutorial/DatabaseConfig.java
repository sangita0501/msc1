package owlapi.tutorial;
//package org.w3schools.io.yaml;
import owlapi.tutorial.*;
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

public class DatabaseConfig {
	private String driver;
    private Integer port;
    private String dbname;
    private String username;
    private String password;
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Integer getPort() {
        return port;
    }
    public void setPort(Integer port) {
        this.port = port;
    }
    public String getDbname() {
        return dbname;
    }
    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "\nDriver: " + driver + "\nport: " 
        + port + "\ndbname: " + dbname 
        + "\nusername: " + username
        + "\npassword: " + password + "\n";
    }
}


