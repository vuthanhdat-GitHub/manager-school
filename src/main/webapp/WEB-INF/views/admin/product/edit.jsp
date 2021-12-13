<%--
  Created by IntelliJ IDEA.
  User: DatDV
  Date: 2/4/2021
  Time: 2:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<c:url var="productApiCreate" value="/api/product-admin/create" />
<c:url var="productApiUpdate" value="/api/product-admin/update" />
<c:url var="productListURL" value="/admin/device/list" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Edit Product Page</title>
</head>
<body>
<div class="main-content">
    <div class="main-content-inner">
        <div class="breadcrumbs ace-save-state" id="breadcrumbs">
            <ul class="breadcrumb">
                <li>
                    <i class="ace-icon fa fa-home home-icon"></i>
                    <a href="#">Trang chủ</a>
                </li>
                <li>
                    <i class="ace-icon fa fa-list list-icon"></i>
                    Danh Sách Product
                </li>
                <li>
                    Edit Page
                </li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <form class="col-xs-12" id="formSubmit" action="${productApiCreate}" method="post" modelAttribute="model">
                <div class="row" >
                    <div class="col-xs-12">
                        <div class="widget-box table-filter">
                            <div class="widget-header">
                                <h4 class="widget-title">
                                    Edit & ADD
                                </h4>
                                <div class="widget-toolbar">
                                    <a href="#" data-action="collopse"><i class="ace-icon fa fa-chevron-up"></i></a>
                                </div>
                            </div>
                            <div class="widget-body">
                                <div class="widget-main">
                                    <div class="form-horizontal">
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Tên Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="name" name="name" value="${model.name}"/>
                                            </div>
                                            <div class="col-sm-1">
                                                <label><b>Mã Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="code" name="code" value="${model.code}"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Giá Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="price" name="price" value="${model.price}"/>
                                            </div>
                                            <div class="col-sm-1">
                                                <label><b>Danh Mục Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <select class="form-control" name="categoryId">
                                                    <option value="">---Chọn Danh Mục Sản Phẩm---</option>
                                                    <c:forEach var="item" items="${categories}">
                                                        <option value="${item.key}" ${item.key == model.categories.id.toString() ? 'selected' : ''}>${item.value}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Tiêu Đề Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-7">
                                                <input type="text" class="form-control input-sm" id="title" name="title" value="${model.title}"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Trạng Thái: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <select class="form-control" name="status">
                                                    <option value="">---Chọn Trạng Thái---</option>
                                                    <c:forEach var="item" items="${status}">
                                                        <option value="${item.key}" ${item.key == model.status ? 'selected' : ''}>${item.value}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="col-sm-1">
                                                <label><b>Hình Ảnh Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="file" class="form-control input-sm" id="fileProduct" name="file"/>
                                            </div>
                                            <div class="col-sm-2">
                                                <c:if test = "${not empty model.id}">
                                                    <a class="dt-button buttons-collection buttons-colvis btn btn-white btn-primary btn-bold"
                                                       data-toggle="tooltip"
                                                       target="_blank"
                                                       title="hiển thị hình ảnh" onclick="showImageEditProduct('${model.base64OfServer}','${model.typeFile}')" >
                                                        <i class="fa fa-search bigger-110 blue"></i>
                                                    </a>
                                                </c:if>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Nhà Sản Xuất: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <select class="form-control" name="manufacturerId">
                                                    <option value="">---Chọn Nhà Sản Xuất---</option>
                                                    <c:forEach var="item" items="${manufacturer}">
                                                        <option value="${item.key}" ${item.key == model.manufacturers.id.toString() ? 'selected' : ''}>${item.value}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                            <div class="col-sm-1">
                                                <label><b>Xuất xứ: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="origin" name="origin" value="${model.origin}"/>
                                            </div>
                                        </div>
                                        <div class="form-group"></div>
                                        <div class="form-group"></div>
                                        <div class="form-group">
                                            <div class="col-sm-2"></div>
                                            <div class="col-sm-1">
                                                <label><b>Thông Tin Sản Phẩm: </b></label>
                                            </div>
                                            <div class="col-sm-7">
                                                <div class="page-wrapper box-content">
                                                    <textarea class="content" name="description" id="description">${model.description}</textarea>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <input type="text" value="${model.id}" hidden id="productId" name="id"/>
                <input type="text" value="${model.totalView}" hidden id="totalView" name="totalView"/>
                <input type="text" value="${model.createdBy}" hidden id="createdBy" name="createdBy"/>
                <input type="text" value="${model.avatar}" hidden id="avatar" name="avatar"/>
                <input type="text" value="${model.typeFile}" hidden id="typeFile" name="typeFile"/>
            </form>
            <div class="row text-center btn-addsp">
                <br>
                <c:if test = "${empty model.id}">
                    <button type="button" class="btn btn-success" id="btnAddOrUpdateBuilding">Thêm Mới</button>
                    <button type="button" class="btn btn-danger" id="btnBack">Hủy Bỏ</button>
                </c:if>
                <c:if test = "${not empty model.id}">
                    <button type="button" class="btn btn-success" id="btnAddOrUpdateBuilding">Cập Nhật</button>
                    <button type="button" class="btn btn-danger" id="btnBack">Hủy Bỏ</button>
                </c:if>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" role="dialog" id="imgModalEditProduct">
    <div class="modal-dialog">
        <div class="modal-content"></div>
        <img class="img-responsive" src="" id="show-img">
    </div>
</div>

<script>

    var file = [];

    $(document).ready(function() {
        $('.content').richText();
    });

    $('#btnAddOrUpdateBuilding').click(function () {
        var productId = $("#productId").val();
        var files = $("#fileProduct")[0].files[0];
        var formData = $('#formSubmit').serializeArray();
        var data = {};
        $.each(formData , function (index , v) {
            data[''+v.name+''] = v.value;
        });
        if (files !== undefined) {
            data['fileNameClient'] = files.name;
        }
        data['file'] = file[0];
        if (productId == '') {
            createProduct(data);
        } else {
            updateProduct(data);
        }
        console.log(data);
    });

    function createProduct(data) {
        $.ajax({
            url: '${productApiCreate}',
            data: JSON.stringify(data),
            type:'POST',
            contentType: 'application/json',
            dataType: 'json',
            success: function(data) {
                window.location.href = "${productListURL}?page=1&maxPageItem=10";
            },
            error: function(data) {
                showError(data);
            }
        });
    }

    function updateProduct(data) {
        $.ajax({
            url: '${productApiUpdate}',
            data: JSON.stringify(data),
            type:'PUT',
            contentType: 'application/json',
            dataType: 'json',
            success: function(data) {
                window.location.href = "${productListURL}?page=1&maxPageItem=10";
            },
            error: function(data) {
                showError(data);
            }
        });
    }

    $('#btnBack').click(function () {
        window.location.href = "${productListURL}?page=1&maxPageItem=10";
    })

    /* file */
    if (window.File && window.FileReader && window.FileList && window.Blob) {
        document.getElementById('fileProduct').addEventListener('change', handleFileSelect, false);
    } else {
        alert('The File APIs are not fully supported in this browser.');
    }

    function handleFileSelect(evt) {
        var f = evt.target.files[0]; // FileList object
        var reader = new FileReader();
        // Closure to capture the file information.
        reader.onload = (function(theFile) {
            return function(e) {
                var binaryData = e.target.result;
                //Converting Binary Data to base 64
                var base64String = window.btoa(binaryData);
                //showing file converted to base64
                file.push(base64String);
            };
        })(f);
        // Read in the image file as a data URL.
        reader.readAsBinaryString(f);
    }

    function showImageEditProduct(base64File, typeFile) {
        var img = "data:image/" + typeFile + ";base64, " + base64File + "";
        $("#show-img").attr('src', img);
        $("#imgModalEditProduct").modal('show');
    }
</script>
</body>
</html>
