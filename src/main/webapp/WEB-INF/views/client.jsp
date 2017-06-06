<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html">
<html>
<head>
	<meta charset="UTF-8">
	<title>Client</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body>
	<div id="formClient">
		<f:form modelAttribute="client" method="post" action="ajouterClient">
			<table>
				<tr><th>Nom:</th><td><f:input path="nom" /></td></tr>
				<tr><th>Prénom:</th><td><f:input path="prenom" /></td></tr>
				<tr><th>Adresse:</th><td><f:input path="adresse" /></td></tr>
				<tr><th>Téléphone:</th><td><f:input path="Telephone" /></td></tr>
				<f:hidden path="clientID"/>
				<tr><td><input type="submit" value="Save"></td></tr>
			</table>
		</f:form>
	</div>
	<div id="listclients">
		<table class="table1">
			<tr><th>ID</th><th>Nom</th><th>PRENOM</th><th>ADRESSE</th><th>TELEPHONE</th></tr>
			<c:forEach items="${clients}" var="client">
				<tr>
				<td>${client.clientID}</td>
				<td>${client.nom}</td>
				<td>${client.prenom}</td>
				<td>${client.adresse}</td>
				<td>${client.telephone}</td>	
				<td><button><a href="supprimerClient?clientID=${client.clientID}">Supprimer</a></button></td>
				<td><button><a href="modifierClient?clientID=${client.clientID}">Modifier</a></button></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
 