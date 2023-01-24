package org.w3schools.io.yaml;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
public class ymltesrt {
    public static void main(String[] args) throws Exception {
        DatabaseConfig dbconfig = new DatabaseConfig();
        dbconfig.setDbname("newdb");
        dbconfig.setDriver("newdriver");
        dbconfig.setPort(6601);
        dbconfig.setUsername("appuser");
        dbconfig.setPassword("apppassword");
        ApplicationConfig appConfig = new ApplicationConfig();
        appConfig.setAuthor("Tom");
        appConfig.setDatabase(dbconfig);
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.writeValue(new File("src/main/resources/application1.yaml"), appConfig);
    }
}