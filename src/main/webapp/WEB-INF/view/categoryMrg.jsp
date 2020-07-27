<%@ include  file = "Header.jspf" %>

<div class="container mb-5">
	<h1>Category Management</h1>
	<a href="/Category_frm" class="btn btn-success text-white mb-2">Add new</a>
	<table class="table table-bordered">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Handle</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${categories}">
				<tr>
					<td>${item.name}</td>
					<td><a class="btn btn-danger " href="/Category_Del?id=${item.id}">delete</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>


</div>



<%@ include file="Footer.jspf" %>

