package samplehooks;

import baseutility.Basic_utilites;
import baseutility.Configreader1;
import io.cucumber.java.Before;

public class MyHooks {

	//@Before(order=1)
	public void start()
	{
		Basic_utilites bu=new Basic_utilites(); 
		//bu.base(Configreader1.getdata("bname"), Configreader1.getdata("url"));
		
	}
	
	

	

}
