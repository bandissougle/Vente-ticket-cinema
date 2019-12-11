<ul class="sidebar navbar-nav">
	<c:url value="/home/" var="home" />
	<li class="nav-item"><a class="nav-link" href="${home }"> <i
			class="fas fa-fw fa-tachometer-alt"></i> <fmt:message key="common.dashbord" />
	</a></li>
	<c:url value="/film/" var="film" />
	<li class="nav-item"><a class="nav-link" href="${film }"> <i
			class="fas fa-fw fa-chart-area"></i> <fmt:message key="common.film" /></a></li>
	<c:url value="/seance/" var="seance" />
	<li class="nav-item"><a class="nav-link" href="${seance }"> <i
			class="fas fa-fw fa-table"></i> <fmt:message key="common.seance" /></a></li>
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
		href="#" id="pagesDropdown" role="button" data-toggle="dropdown"
		aria-haspopup="true" aria-expanded="false"> <i
			class="fas fa-fw fa-folder"></i> <fmt:message key="common.client" />
	</a>
		<div class="dropdown-menu" aria-labelledby="pagesDropdown">
			<c:url value="/client/" var="client" />
			<a class="dropdown-item" href="${client }"><fmt:message key="common.client" /></a>
			<c:url value="/commandeclient/" var="cdeClt" /> 
			<a class="dropdown-item" href="${cdeClt }"><fmt:message key="common.client.commande" /></a> <a
				class="dropdown-item" href="forgot-password.html"><fmt:message key="common.client" /></a>
			<div class="dropdown-divider"></div>
		</div></li>
	<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
		href="#" id="pagesDropdown" role="button" data-toggle="dropdown"
		aria-haspopup="true" aria-expanded="false"> <i
			class="fas fa-fw fa-folder"></i> <fmt:message key="common.parametrage" />
	</a>
		<div class="dropdown-menu" aria-labelledby="pagesDropdown">
			<h6 class="dropdown-header">Paramètres</h6>
			<c:url value="/utilisateur/" var="user" />
			<a class="dropdown-item" href="${user }"><fmt:message key="common.parametrage.utilisateur" /></a> 
			<c:url value="/category/" var="category" />
			<a class="dropdown-item" href="${category }"><fmt:message key="common.parametrage.category" /></a> <a
				class="dropdown-item" href="forgot-password.html"><fmt:message key="common.client" /></a>
			<div class="dropdown-divider"></div>
			<h6 class="dropdown-header">Other Pages:</h6>
			<a class="dropdown-item" href="404.html"><fmt:message key="common.vente" /></a> <a
				class="dropdown-item active" href="blank.html"><fmt:message key="common.vente" /></a>
		</div></li>
	
</ul>

</body>
</html>