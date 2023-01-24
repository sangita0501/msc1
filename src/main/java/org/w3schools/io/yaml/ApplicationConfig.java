package org.w3schools.io.yaml;



public class ApplicationConfig {
	public ApplicationConfig() {
	}

//	private String ;
	private DatabaseConfig info;
	private DatabaseConfig1 tags;
	private DatabaseConfig2 paths;
	private DatabaseConfig3 components;
	
	public DatabaseConfig getDatabase() {
		return info;
	}
	public void setDatabase(DatabaseConfig database){
		this.info=database;
	}
	public DatabaseConfig1 getDatabase1() {
		return tags;
	}
	public void setDatabase1(DatabaseConfig1 database1){
		this.tags=database1;
	}
	
	public DatabaseConfig2 getDatabase2() {
		return paths;
	}
	public void setDatabase2(DatabaseConfig2 database2) {
		this.paths=database2;
	}
	public DatabaseConfig3 getDatabase3() {
		return components;
	}
	public void setDatabase3(DatabaseConfig3 database3) {
		this.components=database3;
	}
	
	
	
	
	@Override
	public String toString() {
		return  "\ninfo: " + info +"\ntags: " + tags + "\npaths: " + paths +"\ncomponents: " +components +"\n";
	}
	public void setAuthor(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDatabase(owlapi.tutorial.DatabaseConfig dbconfig) {
		// TODO Auto-generated method stub
		
	}

}


	
