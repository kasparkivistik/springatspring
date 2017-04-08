<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<%@ include file="/common/header.jsp" %>
<body>

<%@ include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>All games</h1><br/>

    <core:if test="${not empty games}">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Winners: </th>
                <th>Losers: </th>
                <th>Draws: </th>
            </tr>
            </thead>
            <tbody>
            <core:forEach var="game" items="${games}">
                <tr>
                    <td>${game.id}</td>
                    <td>${game.name}</td>
                    <td>${game.date}</td>
                    <td>${game.winners.get(0)}</td>
                    <td>${game.losers.get(0)}</td>
                    <td>${game.winnersScore}</td>
                    <td>${game.losersScore}</td>
                </tr>
            </core:forEach>
            </tbody>
        </table>
    </core:if>
</div>
<%@include file="/common/footer.jsp" %>
</body>
</html>
