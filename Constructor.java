package com.vstl.constructor;

public class Constructor {
	
	//A constructor is called "Default Constructor" when it doesn't have any parameter.
	
	    int intEmpId;
	    String strName;
	    
	    void Display () {
	    	System.out.println(intEmpId+ " "+strName);
	    }
	    

//A constructor which has a specific number of parameters is called a parameterized constructor.
       int intCode=1324;
       String strProjectName= "Square";
       void Show (int intI  ,String strProjectName) {
    		   
    	intCode= intI;
        strProjectName=strName;
        
       }
       
       void details() {
    	   
    	   System.out.println(intCode+ " "+strProjectName);
       }
       
}     
