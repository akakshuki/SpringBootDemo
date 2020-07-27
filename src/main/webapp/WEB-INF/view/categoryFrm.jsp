<%@ include file="Header.jspf"%>
<div class="container">
	<h1>Add new Category</h1>
	<form action="/Category_Add" method="post">
		<div class="form-group">
			<label for="">Name</label> <input type="text" name="name" id=""
				class="form-control" required>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-success">Add</button>
		</div>
	</form>
</div>
<%@ include file="Footer.jspf"%>