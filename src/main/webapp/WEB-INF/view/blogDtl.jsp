<%@ include file="Header.jspf"%>
<div class="container">
    <h1>Blog manager</h1>
    <form action="/blogupdt" method="post">
        <input type="hidden" name="id" value="${blogData.id}">
        <div class="form-group">
            <label for="">Name</label>
            <input type="text" class="form-control" name="name" id="" value="${blogData.name}" aria-describedby="helpId"
                placeholder="">
        </div>
        <div class="form-group">
            <label for="">Category</label>
            <select class="form-control" name="categoryId" id="">
                <c:forEach var="item" items="${listCategories}">
                    <option value="${item.id}" ${item.id==blogData.categoryId ? 'selected="selected"' : '' }>
                        ${item.name}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="">Content</label>
            <textarea name="content" id="editor">${blogData.content}</textarea>
        </div>
        <div class="text-center">
            <button class="btn btn-success my-3" type="submit">Update</button>
        </div>
    </form>

</div>
<%@ include file="Footer.jspf"%>
<script src="https://cdn.ckeditor.com/ckeditor5/20.0.0/classic/ckeditor.js"></script>
<script>
    ClassicEditor
        .create(document.querySelector('#editor'))
        .catch(error => {
            console.error(error);
        });
</script>