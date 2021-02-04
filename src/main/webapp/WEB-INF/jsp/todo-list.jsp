<%@ include file="common/header.jspf" %>
<%@ include file="common/navBar.jspf" %>
<div class="container">
	<h1>Your Todo's</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Completed</th>				
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td><fmt:formatDate value="${todo.targetDate}" pattern="MM/dd/yyyy"/></td>
					<td>${todo.done}</td>
					<td>
						<a type="button" class="btn btn-warning btn-sm" href="/update-todo?id=${todo.id}">Update</a>
					</td>
					<td>
						<a type="button" class="btn btn-danger btn-sm" href="/delete-todo?id=${todo.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/add-todo">Add a todo</a>
</div>
<%@ include file="common/footer.jspf" %>
