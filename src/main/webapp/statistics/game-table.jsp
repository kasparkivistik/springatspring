<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<%@include file="/common/header.jsp" %>
<body>
<%@include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>Top players</h1><br/>

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
                    <td>${game.winners}</td>
                    <td>${game.losers}</td>
                    <td>${game.draw}</td>
                </tr>
            </core:forEach>
            </tbody>
        </table>
    </core:if>
</div>
<%@include file="/common/footer.jsp" %>
</body>
</html>
