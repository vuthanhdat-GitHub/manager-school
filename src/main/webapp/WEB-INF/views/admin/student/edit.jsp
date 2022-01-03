<%--
  Created by IntelliJ IDEA.
  User: DatDV
  Date: 2/4/2021
  Time: 2:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="studentAPICreate" value="/api/admin/student"/>
<c:url var="studentListURL" value="/admin/student"/>
<c:url var="studentAPIUpdate" value="/api/admin/student"/>
<c:url var="studentAPIDelete" value="/api/admin/student"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Trang Sinh viên</title>
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
                    Danh sách Sinh viên
                </li>
                <li>
                    Edit Page
                </li>
            </ul><!-- /.breadcrumb -->
        </div>
        <div class="page-content">
            <form class="col-xs-12" id="formSubmit" action="${studentAPICreate}" method="post" modelAttribute="model">
                <div class="row">
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
                                        <%-- id --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Mã sinh viên: </b></label>
                                            </div>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control input-sm" id="id"
                                                       name="id"
                                                       value="${studentDTO.id}"/>
                                            </div>
                                        </div>

                                        <%-- fullname --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Fullname: </b></label>
                                            </div>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control input-sm" id="name"
                                                       name="name"
                                                       value="${studentDTO.name}"/>
                                            </div>
                                        </div>

                                        <%-- id class --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Lớp: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="idclassz"
                                                       name="idclassz"
                                                       value="${studentDTO.idclassz}"/>
                                            </div>
                                        </div>

                                        <%-- birthday --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Ngày sinh: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="date" class="form-control input-sm" id="birthday"
                                                       name="birthday"
                                                       value="${studentDTO.birthday}"/>
                                            </div>
                                        </div>

                                        <%-- gender --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Giới tính: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <select type="text" id="gender" name="gender">
                                                    <option value="">--Chọn giới tính--</option>
                                                    <option value="Nam">Nam</option>
                                                    <option value="Nữ">Nữ</option>
                                                </select>
                                            </div>
                                        </div>

                                        <%-- number phone --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Số điện thoại: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="numberphone"
                                                       name="numberphone"
                                                       value="${studentDTO.numberphone}"/>
                                            </div>
                                        </div>

                                        <%-- id code --%>

                                        <div class="form-group">
                                            <div class="col-sm-3">
                                                <label><b>Số CCCD: </b></label>
                                            </div>
                                            <div class="col-sm-3">
                                                <input type="text" class="form-control input-sm" id="idcode"
                                                       name="idcode"
                                                       value="${studentDTO.idcode}"/>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <input type="text" value="${studentDTO.id}" hidden id="id"/>

            </form>
            <div class="row text-center btn-addsp">
                <br>
                <c:if test="${empty studentDTO.id}">
                    <button type="button" class="btn btn-success" id="btnAddOrUpdateBuilding">Thêm Mới</button>
                    <button type="button" class="btn btn-danger" id="btnBack">Hủy Bỏ</button>
                </c:if>
                <c:if test="${not empty studentDTO.id}">
                    <button type="button" class="btn btn-success" id="btnAddOrUpdateBuilding">Cập Nhật</button>
                    <button type="button" class="btn btn-danger" id="btnBack">Hủy Bỏ</button>
                </c:if>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" role="dialog" id="imgModalEditBanner">
    <div class="modal-dialog">
        <div class="modal-content"></div>
        <img class="img-responsive" src="" id="show-img">
    </div>
</div>

<script>
    $('#studentType').change(function (e) {
        e.preventDefault();
        var name = $(this).val();
        loadAjax(name);
    });

    var file = [];
    $('#btnAddOrUpdateBuilding').click(function () {
        var id = $('#id').val();
        var formData = $('#formSubmit').serializeArray();
        var data = {};

        $.each(formData, function (index, v) {
            data['' + v.name + ''] = v.value;
        });
        debugger;
        if (id == '') {
            createStudent(data);
        } else {
            updateStudent(data, id);
        }
        console.log(data);
    });

    function loadData(id, name) {
        $('#userId').val(id);
        $('#fullName').val(name);
    }

    function createStudent(data) {
        $.ajax({
            url: '${studentAPICreate}',
            data: JSON.stringify(data),
            type: 'POST',
            contentType: 'application/json',
            dataType: 'json',
            success: function (data) {
                window.location.href = "${studentListURL}?page=1&maxPageItem=10";
            },
            error: function (data) {
                showError(data);
            }
        });
    }

    function updateStudent(data, id) {
        let url = '${studentAPIUpdate}' + '/' + id;
        $.ajax({
            url: url,
            data: JSON.stringify(data),
            type: 'PUT',
            contentType: 'application/json',
            dataType: 'json',
            success: function (data) {
                window.location.href = "${studentListURL}?page=1&maxPageItem=10";
                window.location.href = "${studentListURL}?page=1&maxPageItem=10";
            },
            error: function (data) {
                showError(data);
            }
        });
    }

    if (window.File && window.FileReader && window.FileList && window.Blob) {
        document.getElementById('file').addEventListener('change', handleFileSelect, false);
    } else {
        alert('The File APIs are not fully supported in this browser.');
    }

    $('#btnBack').click(function () {
        window.location.href = "${studentListURL}?page=1&maxPageItem=10";
    })
</script>
</body>
</html>
