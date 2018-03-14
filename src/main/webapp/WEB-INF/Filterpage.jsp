<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>FhirPatientFilter</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .dropdown
  {
  	margin-top: 50px;


  }
  #patientfilter
  {
  	margin-top: 80px;
  }
  #paname
  {
  	display: inline;
  	margin-left: 20px;
  	height: 37px;
  	border-radius: 15px;
  	border: solid #7A7A7A;
  }
  #submitdata1
  {
  display:none;
  	margin-top: 80px;
  }
   #submitdata2
  {
  display:none;
  	margin-top: 80px;
  }
   #submitdata3
  {
  display:none;
  	margin-top: 80px;
  }
    #submitdata4
  {
  display:none;
  	margin-top: 80px;
  }
  

</style>
  <script>
  $(document).ready(function(){

	  $("#patientname").click(function(){
		  $("#submitdata1").show();
		  $("#submitdata2").hide();
		  $("#submitdata3").hide();
		  $("#submitdata4").hide();
		  <%
		 String optvalue1="PatientName";
            %>
	  });
	  $("#patientfamily").click(function(){
		  $("#submitdata1").hide();
		  $("#submitdata2").show();
		  $("#submitdata3").hide();
		  $("#submitdata4").hide();
		  <%
		  String optvalue2="Patientfamily";
            %>
	  });
	  $("#patientcountry").click(function(){
		  $("#submitdata1").hide();
		  $("#submitdata2").hide();
		  $("#submitdata3").show();
		  $("#submitdata4").hide();
		  <%
		   String optvalue3="Patientcountry";
            %>
	  });
	  $("#patientgender").click(function(){
		  $("#submitdata1").hide();
		  $("#submitdata2").hide();
		  $("#submitdata3").hide();
		  $("#submitdata4").show();
		  <%
		   String optvalue4="Patientgender";
            %>
	  });
  }); 
  </script>
  
</head>
<body style="background: url(main.jpg);background-repeat: no-repeat;background-size:1570px 900px ">
	<h1 style="font-family: bold ; font-style:Times ; size: 40px;text-align: center; id ="heading"> FHIR Patient Filter</h1>
	<form method="Post" action ="details.htm" autocomplete="off">
	<div class="form-group">
	<div class="container">
	<div class="dropdown">
		<button class="btn btn-Primary" id="patientinfo" type="button" data-toggle="dropdown">Patient Information <span class="caret"></span></button>
		<input type="text" name="pname" id="paname"  placeholder="Value" size="30" >
		<ul class="dropdown-menu" role="menu" aria-labelledby="patientinfo" id ="drop">
			<li role="presentation"><a role="menuitem"  href="#" id="patientname">Patient Name</a></li>
			<li role="presentation"><a role="menuitem" href="#" id="patientfamily">Patient Family</a></li>
			<li role="presentation"><a role="menuitem" href="#" id="patientcountry">Patient Country</a></li>
			<li role="presentation"><a role="menuitem" href="#" id="patientgender">Patient Gender</a></li>
		</ul>
	</div>
	 <button type ="submit" class="btn btn-default" name="padata"id ="submitdata1" value=<%=optvalue1 %>>Submit</button>
	<button type ="submit" class="btn btn-default" name="padata"id ="submitdata2" value=<%=optvalue2 %>>Submit</button>
 	<button type ="submit" class="btn btn-default" name="padata"id ="submitdata3" value=<%=optvalue3 %>>Submit</button>
    <button type ="submit" class="btn btn-default" name="padata"id ="submitdata4" value=<%=optvalue4 %>>Submit</button>
</div>
</div>
</form>




</body>
</html>