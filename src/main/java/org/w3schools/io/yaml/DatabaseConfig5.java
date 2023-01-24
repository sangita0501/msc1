package org.w3schools.io.yaml;

public class DatabaseConfig5 {
private String id;
private String name;
private String releasedate;

public String getId() {
	return id;
	
}
public void setId(String Id) {
	this.id=Id;
	
}
public String getName() {
	return name;
	
}
public void setName(String Name) {
	this.name=Name;
	
}
public String getReleaseDate() {
	return releasedate;
	
}
public void setReleaseDate(String Reldate) {
	this.releasedate=Reldate;
	
}
@Override
public String toString() {
	return "\nid: " + id + "\nname: " 
    + name + "\nreleaseDate: " + releasedate + "\n";
}
}
