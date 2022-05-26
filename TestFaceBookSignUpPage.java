package com.vstl.assignment;

public class TestFaceBookSignUpPage extends UtilitiesFunctions{

	public static void main(String[] args) {
		
 FaceBookSignUpPage objFaceBookSignUpPage=new FaceBookSignUpPage("https://www.facebook.com/r.php");
		
		objFaceBookSignUpPage.setFisrtName(getFisrtName());
		
		
		objFaceBookSignUpPage.setLastName(getLastName());
		
		
		objFaceBookSignUpPage.setMobileNumber(getMobileNumber());
		
		
		objFaceBookSignUpPage.setPassword(getPassword());
		
		objFaceBookSignUpPage.setDateOfBirth(getDateOfBirth());

		
		objFaceBookSignUpPage.closingBrowser();



	}

}
