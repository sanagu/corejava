<%@ page isELIgnored="false"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h2>Account Info</h2>
		<form action="updateAccount.do" method="post">

			<div class="form-group">
				<label for="AccNo">Account No:</label> <input type="number"
					class="form-control" id="AccNo" name="accountid" value="${accountDetails.accountid}" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="Name">Name:</label> <input type="text"
					class="form-control" placeholder="Enter name" name="accountHolderName" value="${accountDetails.accountHolderName}">
			</div>
			<div class="form-group">
				<label for="Account">Account type:</label> <select name=accountType>
					<option value="${accountDetails.accountType}"></option>
					<option value="SAVING">Savings</option>
					<option value="CURRENT">Current</option>
				</select>
			</div>
			<div class="form-group">
				<label for="balance">Balance:</label> <input class="form-control" type="number"
					id="accountBalance" name="accountBalance" value="${accountDetails.accountBalance}"
					readonly="readonly">
			</div>



			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>