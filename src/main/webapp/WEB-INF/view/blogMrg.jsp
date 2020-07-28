<%@ include file="Header.jspf"%>
<div class="container">
	<h1>Blog manager</h1>
	<a href="/blogfrm" class="btn btn-success my-3">Create </a>
	<div class="table-responsive">
		<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
			<thead>
				<tr>
					<th>Name</th>
					<th>Category</th>
					<th>Owner</th>
					<th>Date Create</th>
					<th>#</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<th>Name</th>
					<th>Category</th>
					<th>Owner</th>
					<th>Date Create</th>
					<th>#</th>
				</tr>
			</tfoot>
			<tbody>
				<c:forEach var="item" items="${listBlog}">
					<tr>
						<td>${item.name}</td>
						<td> ${item.category.name}</td>
						<td>${item.user.name}</td>
						<td>${item.dateCreate}</td>
						<td>
							<a href="/blogDtl?id=${item.id}">Detail</a>
							<a href="/blogdlt?id=${item.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@ include file="Footer.jspf"%>
<script src="admin/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="admin/vendor/datatables/dataTables.bootstrap4.min.js"></script>
<!-- Page level custom scripts -->
<script src="admin/js/demo/datatables-demo.js"></script>