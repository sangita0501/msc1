package owlapi.tutorial;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class info
{
	
	

	public void Spec(String title, String licence, String nameofthecomponent) {
        
        this.title = title;
        this.licence = licence;
        this.nameofthecomponent = nameofthecomponent;
    }

    // Without a default constructor, Jackson will throw an exception
    public info() {}

    
    private String title;
    private String licence;
    private String nameofthecomponent;

    // Getters and setters

    @Override
    public String toString() {
        return "\ntitle: " + title + "\nlicence: " + licence + "\nnameofthecomponent: " + nameofthecomponent + "\n";
    }
	
	
}


