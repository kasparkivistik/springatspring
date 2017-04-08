<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<%@ include file="/common/header.jsp" %>
<body>

<%@ include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>Login</h1>
    <br/>

    <form:form method="POST" action="/login" class="form-horizontal">
        <div class="form-group">
            <form:label path="email" for="inputName" class="col-sm-2 control-label">E-Mail</form:label>
            <div class="col-sm-10">
                <form:input path="email" type="text" class="form-control" id="inputName" placeholder="Email"/>
            </div>
        </div>
        <div class="form-group">
            <form:label path="password" for="inputPassword" class="col-sm-2 control-label">Password</form:label>
            <div class="col-sm-10">
                <form:input path="password" type="password"
                            class="form-control" id="inputPassword" placeholder="Password"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Login</button>
            </div>
        </div>
    </form:form>

</div>

<%@ include file="/common/footer.jsp" %>
</body>
</html>
