<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Twilio - Demo</title>
<link rel="stylesheet" href="css/styles.css">
</head>

<body>
	<form action="home" method="POST">
		<h1>Send Message</h1>
		<table>
			<tr>
				<td>To:</td>
				<td><input name="send-to" placeholder="<mobile number i.e 639271234567>" type="text"></td>
			</tr>
			<tr>
				<td>Message:</td>
				<td><textarea name="message" placeholder="message" name="" cols="30" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form>
</body>

</html>