<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Feedback</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <style>
	#users td {
	  /*border: 1px solid #ddd;*/
	  width : 750px;
	  padding: 8px;
	}
	.radio-inline{
		padding-right : 100px;
	}
  </style>
</head>
<body>
<h3><center>Feedback form</center></h3>

<div class="container" align="center" id="users">
	<form method="post" action="/add-feedback">
		<table>
			<tr>
				<td>
					<div class="form-group">
					<label for="name">Your name :</label>
					<input type = "text" name = "name" class="form-control"  required placeholder="Enter your full name">
				</div>
				</td>
			</tr>
			<tr>
				<td>
				<div class="form-group">
					<label for="email">Your Email address : </label>
					<input type = "email" name = "email" class="form-control"  required placeholder="Enter your email">
				</div>
				</td>
			</tr>		
			<tr>
				<td>
					<div class="form-group">
						<br><label for="browser"> On which platform did you use our website ?</label>
			            <select name="browser">
			                <option value="Chrome"> Chrome</option>
			                <option value="Firefox"> Firefox</option>
			                <option value="Safari"> Safari </option>
			                <option value="Other"> Other..</option>
			             </select>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-group" >
						<label for="experience">How was your experience with the website? </label><br>
						<input type="radio" name="experience" value="best" checked>
						<label for="best"> Best</label><br>
						<input type="radio" name="experience"  value="pleasant">
						<label for="pleasant" >Pleasant</label><br>
						<input type="radio" name="experience"value="unpleasant">
						<label for="unpleasant" >Unpleasant</label><br>
					</div>
				</td>
				</tr>
				<tr>
				<td>
					<div>
						<label for="category" >Please choose a feedback category :  </label><br>
						<input type="radio" name="category" value="suggestion">
						<label for="suggestion">Suggestion</label><br>
						<input type="radio" name="category" value="compliment" checked> 
						<label for="compliment">Compliment</label><br>
						<input type="radio" name="category" value="complaint">
						<label for="complaint" >Complaint</label><br>
					</div>
				</td>
			</tr>	
			<tr>
				<td>
					<br>
					<div class="form-group">
						<label for="message">Enter your feedback here : </label>
						<textarea name="message" rows="5"  class="form-control" required placeholder="Please enter input here">
						</textarea>
					</div>
				</td>
			</tr>	
			</table>
		<center><input type = "submit" value = "Submit feedback"></center>
	</form>
	<br>
	<p><i>We appreciate your time to help and improve our site & service. We wish to serve you in better ways.</i></p>
</div>
</body>
</html>