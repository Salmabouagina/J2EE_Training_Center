<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<style type="text/css">
<style type="text/css">
<%@
include file="./style.css"
 
%>

</style>
</style>
<!DOCTYPE html>
<html>
<head>

<title>Liste Des Etudiant</title>
</head>
<body>
	

	
<a href="/centredfWeb/Ajouter">Ajouter</a>

<div class="container">
	
	<div class="table" >
		<div class="table-header">
			<div class="header__item"><a id="name" class="filter__link" href="#">Nom</a></div>
			<div class="header__item"><a id="wins" class="filter__link filter__link--number" href="#">Prenom</a></div>
			<div class="header__item"><a id="draws" class="filter__link filter__link--number" href="#">email</a></div>
			<div class="header__item"><a id="name" class="filter__link" href="#">pass</a></div>
			<div class="header__item"><a id="name" class="filter__link" href="#">modifier</a></div>
			<div class="header__item"><a id="name" class="filter__link" href="#">supprimer</a></div>
	
		</div>
		<div class="table-content">	
					
			<c:forEach items="${comptes}" var="cp">
				<div class="table-row">
				<div class="table-data">${cp.getNom()}</div>
				<div class="table-data">${cp.getPrenom()}</div>
				<div class="table-data">${cp.getEmail()}</div>
				<div class="table-data">${cp.getPass()}</div>
				<div class="table-data"><a href="/centredfWeb/Modifier?name=${cp.getNom()}?prenom=${cp.getPrenom()}?email=${cp.getEmail()}?pass=${cp.getPass()}?x=${x}?y=${y}">Modifier</a></div>
				<div class="table-data"><a href="/centredfWeb/supprimer?name=${cp.getNom()}?prenom=${cp.getPrenom()}?email=${cp.getEmail()}?pass=${cp.getPass()}">Supprimer</a></div>
				</div></c:forEach>
			
		
		</div>	
	</div>
</div>
<h1>liste Enseignant</h1>
<div class="container">
	
	<div class="table" >
		<div class="table-header">
			<div class="header__item"><a id="name" class="filter__link" href="#">Nom</a></div>
			<div class="header__item"><a id="wins" class="filter__link filter__link--number" href="#">Prenom</a></div>
			<div class="header__item"><a id="draws" class="filter__link filter__link--number" href="#">email</a></div>
			<div class="header__item"><a id="name" class="filter__link" href="#">pass</a></div>
			
	
		</div>
		<div class="table-content">	
					
			<c:forEach items="${comptes1}" var="cp">
				<div class="table-row">
				<div class="table-data">${cp.getNom()}</div>
				<div class="table-data">${cp.getPrenom()}</div>
				<div class="table-data">${cp.getEmail()}</div>
				<div class="table-data">${cp.getPass()}</div>
				
				</div></c:forEach>
			
		
		</div>	
	</div>
</div>
</body>
</html>

