package com.fhir.Patient;

import java.util.List;

public class Duplicatevalues {
	
	public boolean duplicateval(patientDetail details,List patientdetails)
	{
	int j=0;	
		do
	      {
	    	 if(patientdetails.size()==0)
	    	 {
	    		 patientdetails.add(details); 
	    	 }
	    	  if(((patientDetail) patientdetails.get(j)).getID()==details.getID())
	    	  {
	    		  return true;
	    	  }
	    	  else
	    	  {
	    	     j++;
	    	  }
	      }while(j<patientdetails.size());
		return false;
		
	}

}
