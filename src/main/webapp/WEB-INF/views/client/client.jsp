<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="fr">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin - Blank Page</title>

  <!-- Custom fonts for this template-->
  <link href="<%=request.getContextPath() %>/ressources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="<%=request.getContextPath() %>/ressources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<%=request.getContextPath() %>/ressources/css/sb-admin.css" rel="stylesheet">

</head>

<body id="page-top">

  <%@ include file="/WEB-INF/views/menu_top/topMenu.jsp" %>

  <div id="wrapper">

    <!-- Sidebar -->
  
  <%@ include file="/WEB-INF/views/menu_left/leftMenu.jsp" %>
    <div id="content-wrapper">

      <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
          <li class="breadcrumb-item">
            <a href="index.html">Dashboard</a>
          </li>
          <li class="breadcrumb-item active"><fmt:message key="common.client" /></li>
        </ol>

        <!-- Page Content -->
        <h1><fmt:message key="common.client" /></h1>
        <hr>
		<div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
           <fmt:message key="clients.liste" /></div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th><fmt:message key="common.nom" /></th>
                    <th><fmt:message key="common.prenom" /></th>
                    <th><fmt:message key="common.mail" /></th>
                    <th><fmt:message key="common.adresse" /></th>
                    <th><fmt:message key="common.id" /></th>
                    <th><fmt:message key="common.actions" /></th>
                  </tr>
                </thead>
                <tfoot>
                  <tr>
                    <th><fmt:message key="common.nom" /></th>
                    <th><fmt:message key="common.prenom" /></th>
                    <th><fmt:message key="common.mail" /></th>
                    <th><fmt:message key="common.adresse" /></th>
                    <th><fmt:message key="common.id" /></th>
                    <th><fmt:message key="common.actions" /></th>
                  </tr>
                </tfoot>
                <tbody>
                  <c:forEach items="${clients }" var="client">
                   <tr>
                    <td>${client.getNom_client() }</td>
                    <td>${client.getPrenom_client() }</td>
                    <td>${client.getAdresse_electronique() }</td>
                    <td>${client.getAdresse_postale() }</td>
                    <td>${client.getId_Client() }</td>
                    <td>actions</td>
                  </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>
          <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>

        <p class="small text-center text-muted my-5">
          <em>More table examples coming soon...</em>
        </p>

      </div>
      <!-- /.container-fluid -->

	        <!-- Sticky Footer -->
      <footer class="sticky-footer">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright © Your Website 2019</span>
          </div>
        </div>
      </footer>

    </div>
    <!-- /.content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<%=request.getContextPath() %>/ressources/vendor/jquery/jquery.min.js"></script>
  <script src="<%=request.getContextPath() %>/ressources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="<%=request.getContextPath() %>/ressources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Page level plugin JavaScript-->
  <script src="<%=request.getContextPath() %>/ressources/vendor/datatables/jquery.dataTables.js"></script>
  <script src="<%=request.getContextPath() %>/ressources/vendor/datatables/dataTables.bootstrap4.js"></script>
	
  <!-- Custom scripts for all pages-->
  <script src="<%=request.getContextPath() %>/ressources/js/sb-admin.min.js"></script>
  
   <!-- Demo scripts for this page-->
  <script src="<%=request.getContextPath() %>/ressources/js/demo/datatables-demo.js"></script>

</body>

</html>
