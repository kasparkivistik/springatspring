<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<%@ include file="/common/header.jsp" %>
<body>

<%@ include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>User registration</h1>
    <br/>

    <form:form method="POST" action="/registration/add" class="form-horizontal">
        <div class="form-group">
            <form:label path="name" for="inputName" class="col-sm-2 control-label">Full name</form:label>
            <div class="col-sm-10">
                <form:input path="name" type="text" class="form-control" id="inputName" placeholder="Full name"/>
            </div>
        </div>
        <div class="form-group">
            <label for="inputEmail" class="col-sm-2 control-label">Email</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="inputEmail" placeholder="Email">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Register</button>
            </div>
        </div>

        <%--<table>--%>
        <%--<tr>--%>
        <%--<td><form:label path = "name">Name</form:label></td>--%>
        <%--<td><form:input path = "name" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
        <%--<td><form:label path = "age">Age</form:label></td>--%>
        <%--<td><form:input path = "age" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
        <%--<td><form:label path = "id">id</form:label></td>--%>
        <%--<td><form:input path = "id" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
        <%--<td colspan = "2">--%>
        <%--<input type = "submit" value = "Submit"/>--%>
        <%--</td>--%>
        <%--</tr>--%>
        <%--</table>--%>
    </form:form>

</div>

<%@ include file="/common/footer.jsp" %>
</body>
</html>
