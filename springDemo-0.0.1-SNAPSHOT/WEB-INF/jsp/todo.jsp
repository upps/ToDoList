<%@ include file="common/header.jspf" %>
<%@ include file="common/navBar.jspf" %>
	<div class="container">
		<p><strong>Add Todo page for ${name}.</strong></p>
		<form:form method="post" modelAttribute="todo">
			<form:hidden path="id"/>
			<div class="form-group">
				<form:label path="desc" for="desc">Description</form:label>
			    <form:input type="text" class="form-control" id="desc" path="desc" placeholder="Enter description" required="required"/> 
			    <form:errors path="desc" cssClass="text-warning"/>
			</div>
			<div class="form-group">
				<form:label path="targetDate" for="targetDate">Target Date</form:label>
			    <form:input type="date" class="form-control" id="targetDate" path="targetDate" required="required"/> 
			    <form:errors path="targetDate" cssClass="text-warning"/>
			</div>
			<div>
				<button type="submit" class="btn btn-primary">Submit</button>
				<a class="btn btn-warning" type="cancel" href="/cancel-todo">Cancel</a>		
			</div>
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>