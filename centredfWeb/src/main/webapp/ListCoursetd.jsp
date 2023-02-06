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

<title>Liste Des Cours</title>
</head>
<body>
	

	


<div class="container">
	
	<div class="table" >
		<div class="table-header">
			<div class="header__item"><a id="name" class="filter__link" href="#">Libele</a></div>
			<div class="header__item"><a id="wins" class="filter__link filter__link--number" href="#">Duree</a></div>
			<div class="header__item"><a id="draws" class="filter__link filter__link--number" href="#">type</a></div>
	
		</div>
		<div class="table-content">	
					
			<c:forEach items="${comptes}" var="cp">
				<div class="table-row">
				<div class="table-data">${cp.getLibele()}</div>
				<div class="table-data">${cp.getDuree()}</div>
				<div class="table-data">${cp.getType()}</div>
				</div></c:forEach>
			
		
		</div>	
	</div>
</div>
</body>
</html>

