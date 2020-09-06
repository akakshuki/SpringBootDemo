<%@ include file="Header.jspf"%>
<div class="container">
	<h1>Blog manager</h1>
	<form action="/blogcrt" method="post">
		<div class="form-group">
			<label for="">Name</label>
			 <input name="id" value=0 type="hidden"/>
			 <input name="userId" value=0 type="hidden"/>
			 <input type="text" class="form-control"
				name="name" id="" aria-describedby="helpId" placeholder="">
		</div>
		<div class="form-group">
			<label for="">Category</label> <select class="form-control"
				name="categoryId" id="">
				<c:forEach var="item" items="${listCategories}">
					<option value="${item.id}">${item.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="">Content</label>
			<textarea name="content" id="editor"></textarea>
		</div>
		<div class="text-center">
			<button class="btn btn-success my-3" type="submit">Add new</button>
		</div>
	</form>

</div>
<%@ include file="Footer.jspf"%>
<script
	src="https://cdn.ckeditor.com/ckeditor5/20.0.0/classic/ckeditor.js"></script>
<script>
    ClassicEditor
        .create( document.querySelector( '#editor' ) )
        .catch( error => {
            console.error( error );
        } );
</script>