<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<!DOCTYPE html>
<html>
<%@ include file="/common/header.jsp" %>
<body>

<%@ include file="/common/top-menu.jsp" %>

<div class="container">
    <h1>Game registration</h1>
    <br/>

    <form:form method="POST" action="/game/add" class="form-horizontal">
        <div class="form-group">
            <form:label path="name" for="inputName" class="col-sm-2 control-label">Full name</form:label>
            <div class="col-sm-10">
                <form:input path="name" type="text" class="form-control" id="inputName" placeholder="Game name"/>
            </div>
        </div>
        <div class="form-group">
            <form:label path="date" for="inputDate" class="col-sm-2 control-label">Date</form:label>
            <div class="col-sm-10">
                <form:input path="date" type="date" class="form-control" id="inputDate" placeholder="Date"/>
            </div>
        </div>
        <div class="form-group">
            <form:label path="winnerScore" for="inputWinnerScore" class="col-sm-2 control-label">Winner Score</form:label>
            <div class="col-sm-10">
                <form:input path="winnerScore" type="number"
                            class="form-control" id="inputWinnerScore" placeholder="0" min="0"/>
            </div>
        </div>
        <div class="form-group">
            <form:label path="losersScore" for="inputlosersScore" class="col-sm-2 control-label">Losers Score</form:label>
            <div class="col-sm-10">
                <form:input path="losersScore" type="number"
                            class="form-control" id="inputlosersScore" placeholder="0" min="0"/>
            </div>
        </div>
        <div class="form-group">
        <form:label path="drawScore" for="inputDrawScore" class="col-sm-2 control-label">Draw Score</form:label>
        <div class="col-sm-10">
            <form:input path="drawScore" type="number"
                        class="form-control" id="inputDrawScore" placeholder="0" min="0"/>
        </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Add Game</button>
            </div>
        </div>
    </form:form>

</div>

<%@ include file="/common/footer.jsp" %>
</body>
</html>
