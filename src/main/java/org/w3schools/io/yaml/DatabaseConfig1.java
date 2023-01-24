package org.w3schools.io.yaml;

///next class
	public class DatabaseConfig1 {
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