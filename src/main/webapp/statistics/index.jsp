<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<%@ include file="/common/header.jsp" %>
<body>

<%@ include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>Top players</h1>
    <br/>


    <c:if test="${not empty players}">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="player" items="${players}">
                    <tr>
                        <td>${player.name}</td>
                        <td>${player.email}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>


</div>

<%@ include file="/common/footer.jsp" %>
</body>
</html>
