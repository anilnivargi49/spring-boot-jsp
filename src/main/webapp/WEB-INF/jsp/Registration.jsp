<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS - Employee Registration</title>
<style>
td, th {
  font-family: arial, sans-serif;
}
</style>
<script type="text/javascript">
	function validate() {
		if (document.forms["employee"]["fname"].value == "") {
			alert("Please enter first name");
			document.forms["employee"]["fname"].focus();
			return false;
		}
		if (document.forms["employee"]["lname"].value == "") {
			alert("Please enter last name");
			document.forms["employee"]["lname"].focus();
			return false;
		}
		if (document.forms["employee"]["userName"].value == "") {
			alert("Please enter user name");
			document.forms["employee"]["userName"].focus();
			return false;
		}
		if (document.forms["employee"]["emailId"].value == "") {
			alert("Please enter email id");
			document.forms["employee"]["emailId"].focus();
			return false;
		}
		if (document.forms["employee"]["empId"].value == "") {
			alert("Please enter emp Id");
			document.forms["employee"]["empId"].focus();
			return false;
		}
		if (document.forms["employee"]["bloodGp"].value == "") {
			alert("Please enter blood group");
			document.forms["employee"]["bloodGp"].focus();
			return false;
		}
		if (document.forms["employee"]["age"].value == "" || document.forms["employee"]["age"].value == 0) {
			alert("Please enter valid age");
			document.forms["employee"]["age"].focus();
			return false;
		}
	}
</script>
</head>
<body style="background-color: #FFFFE0;">
<div style="margin-top:50px; margin-left:250px; height:50px;"><h2>Employee <c:out value="${employee.id != null ? 'Update' : 'Registration' }" /></h2></div>
<form:form method="POST" modelAttribute="employee" action="/home" name="employee">
<table style="vertical-align: center; margin-left:20%;">
	
	<tr>
		<td><form:hidden path="id"/></td>
	</tr>
    <tr>
        <td>First Name :</td>
        <td><form:input path="firstName" id="fname" /></td>
    </tr>
    <tr>
        <td>Last Name :</td>
        <td><form:input path="lastName" id="lname"/></td>
    </tr>
    <tr>
        <td>User Name :</td>
        <td><form:input path="userName" id="userName"/></td>
    </tr>
    <tr>
        <td>Email Id :</td>
        <td><form:input path="emailId" id="emailId"/></td>
    </tr>
    <tr>
        <td>Emp. Id :</td>
        <td><form:input path="empId" id="empId"/></td>
    </tr>
    <tr>
        <td>Blood Group :</td>
        <td><form:input path="bloodGp" id="bloodGp" /></td>
    </tr>
    <tr>
        <td>Age :</td>
        <td><form:input path="age" id="age" /></td>
    </tr>
    <tr>
        <td>Personal Email :</td>
        <td><form:input path="personalEmail" /></td>
    </tr>
    <tr>
        <td>Mobile No :</td>
        <td><form:input path="mobileNo" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="<c:out value="${employee.id != null ? 'Update' : 'Register' }" />"
         onclick="return validate();">&nbsp;&nbsp; <a href="/list">Employee List</a>&nbsp;
         <c:if test="${employee.id ne null}"><b>|</b>&nbsp;<a href="/registration">Registration</a></c:if>
         </td>
    </tr>
</table>
</form:form>

</body>
</html>