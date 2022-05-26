package com.vstl.assignment;

import java.util.GregorianCalendar;
import java.util.Random;


public class UtilitiesFunctions {
	
	public static String getFisrtName() {
	String strFisrtName=" ";
		String strArray[]= {"Riya","Rohini","Ruhi","chaitali","Rima","Rishi","sonu"};
		strFisrtName=strArray[new Random().nextInt(strArray.length)];
	  return strFisrtName;
	  
	}
	public static String getLastName() {
		String strLastName=" ";
		String strArray[] = {"Ghate","Malhotra","Bhuvi","Bhamne","upadye"};
		strLastName=strArray[new Random().nextInt(strArray.length)];
		return strLastName;
	}
	
	
	public static String getMobileNumber() {
		Random rd=new Random();
		String strMobileNumber=" ";
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
	return	strMobileNumber=str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9];
		
	}
	
	public static String getPassword() {
		 String strPassword=" xy123";
		return strPassword;
	}
		 
	public static String getDateOfBirth() {
	   
	   GregorianCalendar gc= new GregorianCalendar();
	    String strDateOfBirth=" ";
	    int year = randBetween(1900,2010);
	    gc.set(gc.YEAR,year);
	    int dayofyear = randBetween(1 ,gc.getActualMaximum(gc.DAY_OF_YEAR));
	    gc.set(gc.DAY_OF_YEAR , dayofyear);
	    System.out.println(gc.get(gc.YEAR) + "-"+ (gc.get(gc.MONTH) + 1) + "-" +gc.get(gc.DATE));
		return strDateOfBirth;
	    
   }
      public static int randBetween(int start , int end) {
    	  return start + (int)Math.round(Math.random() * (end -start));
      }
      
}    
      
      
 /*   
    public static void getRandomGender() {
    	String strGender=" ";
    	if(new Random(). nextBoolean() {
    		//male 
    	}
    	else
    	{
    		//female
    	}
    
    }
*/

   /*
     public static String getRandomPhoneNumberGenerator {
    	    Random rand =new Random();
    	  Syso("Genarating a random phone number .....");
    System.out.println("%d%d%d"-%03d-%4d\n", rand.nextInt(8), rand.nextInt(8),rand.nextInt(8), rand.nextInt(656), rand.Int(10000));
    	   		
    	    
       }
     }
	
*/