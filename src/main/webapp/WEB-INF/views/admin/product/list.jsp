<%--
  Created by IntelliJ IDEA.
  User: DatDV
  Date: 2/4/2021
  Time: 1:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="productSearchURL" value="/admin/device/list"/>
<c:url var="productAPIDelete" value="/api/product-admin/delete"/>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Danh Sách THiết Bị</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Danh Sách Thiết Bị</a>
                </li>
                <li>
                    Danh Sách Thiết Bị Của Người Dùng
                </li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-xs-12">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th></th>
                            <th>STT</th>
                            <th>Tên Sản Phẩm</th>
                            <th>Trạng Thái</th>
                            <th>Thao Tac</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="item" items="${model.productResponseList}" varStatus="loop">
                            <tr>
                                <td><input type="checkbox" value="${item.id}" name="" id="checkBox_${item.id}"></td>
                                <td>${loop.index + 1}</td>
                                <td>${item.name}</td>
                                <td>
                                    <c:if test="${item.status == 'CONHANG'}">
                                        Còn Hàng
                                    </c:if>
                                    <c:if test="${item.status == 'KHONGCONHANG'}">
                                        Không Còn Hàng
                                    </c:if>
                                </td>
                                <td>
                                    <label>
                                        <input name="switch-field-1" class="ace ace-switch ace-switch-3" type="checkbox">
                                        <span class="lbl">
                                            ::before
                                        </span>
                                    </label>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
            <div class="container" style="text-align: right;">
                <ul id="pagination" class="pagination-lg pagination"></ul>
            </div>
            <div class="well text-center" id="content"></div>
        </div>
    </div>
</div>
<div class="modal fade" role="dialog" id="imgModalProduct">
    <div class="modal-dialog">
        <div class="modal-content"></div>
        <img class="img-responsive" src="" id="show-img">
    </div>
</div>

<!-- Modal confirm delete -->
<div class="modal fade" id="confirmDelete" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Xác Nhận Thao Tác</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Bạn có chắc chắn muốn xóa những sản phẩm đã chọn?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="confirmDelete(true)">Save changes</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal delete error no item -->
<div class="modal fade" id="errorDelete" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                chưa có sản phẩm được chọn để xóa
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">

    $('#btnDelete').click(function () {
        var dataArr = $('tbody input[type=checkbox]:checked').map(function () {
            return $(this).val();
        }).get();
        if (dataArr.length == 0) {
            $("#errorDelete").modal('show');
            return;
        }
        $("#confirmDelete").modal('show');
    });

    function confirmDelete(isSubmit) {
        if (isSubmit) {
            var dataArr = $('tbody input[type=checkbox]:checked').map(function () {
                return $(this).val();
            }).get();
            var data = {};
            data['ids'] = dataArr;
            console.log(dataArr.length);
            deleteProduct(data);
        }
    }

    function deleteProduct(data) {
        $.ajax({
            url: '${productAPIDelete}',
            data: JSON.stringify(data),
            type: 'DELETE',
            contentType: 'application/json',
            success: function (data) {
                window.location.href = "${productSearchURL}?message=delete_success&page=1&maxPageItem=10";
            },
            error: function () {
                window.location.href = "${productSearchURL}?message=error_system&page=1&maxPageItem=10";
            }
        });
    }

</script>
</body>
</html>
