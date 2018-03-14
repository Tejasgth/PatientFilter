package com.fhir.Patient;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.annotation.RequiredParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.client.api.IRestfulClient;
import ca.uhn.fhir.rest.param.StringParam;

@Controller
public class fhirConfig {
	static String val;
	@RequestMapping(value="/Filterpage",method=RequestMethod.GET)
	public ModelAndView getform()
	{
		ModelAndView mv = new ModelAndView("Filterpage");
		return mv;
		
	}
	@Repository
	public interface patientdetails extends IRestfulClient{
		@Search
	      List<Patient> findPatientsForName(@RequiredParam(name = Patient.SP_GIVEN) StringParam fam );
		@Search
	     List<Patient> findPatientsForfamily(@RequiredParam(name = Patient.SP_FAMILY) StringParam fam );
	    @Search 
		List<Patient> findPatientsForcountry(@RequiredParam(name = Patient.SP_ADDRESS_COUNTRY) StringParam fam);
	    @Search 
		List<Patient> findPatientsForgender(@RequiredParam(name = Patient.SP_GENDER) StringParam fam );
		
	}

	@RequestMapping(value="/details",method=RequestMethod.POST)
	
		public ModelAndView getdetails(@RequestParam("pname")String value ,@RequestParam("padata")String opt,ModelMap model )
		{ 	
		List<patientDetail>patientdetails=new ArrayList<patientDetail>();
		Duplicatevalues patientdata=new Duplicatevalues();
		 val=value;
		 FhirContext ctx = FhirContext.forDstu2();
   	    // Create the client
	      String serverBase = "http://hapi.fhir.org/baseDstu2";
	      patientdetails client = ctx.newRestfulClient(patientdetails.class, serverBase);
	   // Retrieved value of dropdown Patientname from filterpage.jsp
	      if(opt.equalsIgnoreCase("PatientName"))	
          {
	      List<Patient> patients = client.findPatientsForName(new StringParam(val));
	      int length=patients.size();
	      //Object creation patientData
	      patientDetail details=new patientDetail();
	      
	      for(int i=0;i<length;i++)
	      {
	      Patient patient = patients.get(i);
	      details.setFirstname(patient.getName().get(0).getGivenAsSingleString());
	      details.setLastname(patient.getName().get(0).getFamilyAsSingleString());
	      details.setDateofbirth(patient.getBirthDate());
 	      details.setGender(patient.getGender());
 	      details.setResidentCountry(patient.getAddress().get(0).getCountry());
	      details.setID(patient.getIdElement().getIdPart());
	      boolean res=patientdata.duplicateval(details, patientdetails);
	      if(res==false)
		     {
		    	 patientdetails.add(details);
		     }
	      else
	      {
	    	  continue;
	      }
	      }
	      model.addAttribute("patientinfo", patientdetails);
          }
	      // Retrieved value of dropdown Patientdob from filterpage.jsp
	      if(opt.equalsIgnoreCase("Patientfamily"))	
          {
	      List<Patient> patients = client.findPatientsForfamily(new StringParam(val));
	      int length=patients.size();
	      //Object creation patientData
	      patientDetail details=new patientDetail();
	      for(int i=0;i<length;i++)
	      {
	      Patient patient = patients.get(i);
	      details.setFirstname(patient.getName().get(0).getGivenAsSingleString());
	      details.setLastname(patient.getName().get(0).getFamilyAsSingleString());
	      details.setDateofbirth(patient.getBirthDate());
 	      details.setGender(patient.getGender());
 	      details.setResidentCountry(patient.getAddress().get(0).getCountry());
	      details.setID(patient.getIdElement().getIdPart());
	      boolean res=patientdata.duplicateval(details, patientdetails);
	      if(res==false)
		     {
		    	 patientdetails.add(details);
		     }
	      else
	      {
	    	  continue;
	      }  
	      }
	      model.addAttribute("patientinfo", patientdetails);
          }
	   // Retrieved value of dropdown Patientcountry from filterpage.jsp
	      if(opt.equalsIgnoreCase("Patientcountry"))	
          {
	      List<Patient> patients = client.findPatientsForcountry(new StringParam(val));
	      int length=patients.size();
	      //Object creation patientData
	      patientDetail details=new patientDetail();
	      for(int i=0;i<length;i++)
	      {
	      Patient patient = patients.get(i);
	      details.setFirstname(patient.getName().get(0).getGivenAsSingleString());
	      details.setLastname(patient.getName().get(0).getFamilyAsSingleString());
	      details.setDateofbirth(patient.getBirthDate());
 	      details.setGender(patient.getGender());
 	      details.setResidentCountry(patient.getAddress().get(0).getCountry());
	      details.setID(patient.getIdElement().getIdPart());
	      boolean res=patientdata.duplicateval(details, patientdetails);
	      if(res==false)
		     {
		    	 patientdetails.add(details);
		     }
	      else
	      {
	    	  continue;
	      }
	    	  
	      }
	      model.addAttribute("patientinfo", patientdetails);
          }
	      // Retrieved value of dropdown Patientgender from filterpage.jsp
	      if(opt.equalsIgnoreCase("Patientgender"))	
          {
	      List<Patient> patients = client.findPatientsForgender(new StringParam(val));
	      int length=patients.size();
	      //Object creation patientData
	      patientDetail details=new patientDetail();
	      for(int i=0;i<length;i++)
	      {
	      Patient patient = patients.get(i);
	      details.setFirstname(patient.getName().get(0).getGivenAsSingleString());
	      details.setLastname(patient.getName().get(0).getFamilyAsSingleString());
	      details.setDateofbirth(patient.getBirthDate());
 	      details.setGender(patient.getGender());
 	      details.setResidentCountry(patient.getAddress().get(0).getCountry());
	      details.setID(patient.getIdElement().getIdPart());
	      boolean res=patientdata.duplicateval(details, patientdetails);
	      if(res==false)
		     {
		    	 patientdetails.add(details);
		     }
	      else
	      {
	    	  continue;
	      }
	    	  
	      }
	      model.addAttribute("patientinfo", patientdetails);
          }
        return new ModelAndView("/table",model);
		
		}
	     

	     
}

