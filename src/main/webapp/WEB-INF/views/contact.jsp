<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5 ">
	<h2 class="text-center">Registration Form</h2>

		<form action="process" method="post">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" name="email"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp">
				<div id="emailHelp"
				 class="form-text">We'll never share your
					email with anyone else.</div>
			</div>


			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Name
					</label> <input type="text" class="form-control"name="name"
					id="exampleInputName" aria-describedby="namee">
				<div id="emailHelp" class="form-text">We'll never share your
					Name with anyone else.</div>
			</div>



			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"name="password" 
					id="exampleInputPassword1">
					<div id="emailHelp" class="form-text">We'll never share your
					Password with anyone else.</div>
			</div>


			<div class="container text-center"><button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>





	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>