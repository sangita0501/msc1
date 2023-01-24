package org.w3schools.io.yaml;

public class DatabaseConfig {

	private String description;
	private String version;
	private String title;
	private String licence;
	private String url;
	
	
	public String getDescription() {
		return description;
		
	}
	public void setDescription(String desc) {
		this.description=desc;
		
	}

	public String getVersion() {
		return version;
	}
    
	public void setVersion(String Version) {
		this.version=Version;
	}
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String Title) {
		this.title=Title;
			
	}
	
	public String getLicence() {
		return licence;
		
	}
	public void setLicence(String Licence) {
		this.licence=Licence;
				
	}
	public String getUrl() {
		return url;
		
	}
	public void setUrl(String Url) {
		this.url=Url;
				
	}
	@Override
	public String toString() {
		return "\ndescription: " + description + "\nversion: " 
        + version + "\ntitle: " + title 
        + "\nlicence: " + licence
		+ "\nurl: " + url + "\n";
	}
	public class DatabaseConfig1 extends DatabaseConfig{
		private String description;
		private String name;
		
		
		public String getDescription() {
			return description;
			
		}
		public void setDescription(String desc) {
			this.description=desc;
			
		}

		public String getName() {
			return name;
		}
	    
		public void setName(String Name) {
			this.name=Name;
		}
		@Override
		public String toString() {
			return "\ndescription: " + description + "\nname: " 
	        + name  + "\n";
		}
	}
	public void setDbname(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setDriver(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPort(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
}
