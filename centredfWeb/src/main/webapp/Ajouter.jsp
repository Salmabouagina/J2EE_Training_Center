<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>

<title>Add Etudiant</title>
</head>
<body>
	<div class="login-box">

		<h2>Ajouter Un Etudiant</h2>
		<form  method="post">
			<div class="user-box">
				<input type="text" name="nom" required=""> <label>Nom</label>
			</div>
			<div class="user-box">
				<input type="text" name="prenom" required=""> <label>Prenom</label>
			</div>
			<div class="user-box">
				<input type="text" name="email" required=""> <label>Email</label>
			</div>
			<div class="user-box">
				<input type="text" name="pass" required=""> <label>Mot de Pass</label>
			</div>
			<div class="user-box">
				<input type="text" name="etablissement" required=""> <label>etablissement</label>
			</div>
			<input  type="submit"class="button" name="action" value="Ajout"/> 
			
			
		</form>
	</div>


</body>
</html>

