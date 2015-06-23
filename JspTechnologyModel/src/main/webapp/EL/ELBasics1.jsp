<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Basics I.</title>
</head>
<body>
<h2>Dot Operator</h2>
${person.name}<br>
${person.pet.name}<br>
${person.pet.type}<br>
<br>
<br>
<h2>[] Operator</h2>
${person["name"]}<br>
${person["pet"]["name"]}<br>
${person["pet"]["type"]}<br>

<h3>Array with [] operator</h3>
${myPets[0]}<br>
${myPets[1]}<br>
${myPets["2"]}<br>

<h3>Map with dot operator</h3>
${mindMap.work}<br>
${mindMap.hobby}<br>
${mindMap.home}<br>

<h3>Map with [] operator</h3>
${mindMap["work"]}<br>
${mindMap["hobby"]}<br>
${mindMap["home"]}<br>

${mindMap[hobby]}<br><%-- ${mindMap[hobby]} -> ${mindMap["hobby"]} --%>
${mindMap[mindMapKeys[0]]}<br>

</body>
</html>