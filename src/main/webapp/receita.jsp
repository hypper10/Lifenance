<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt_BR">

<head>

	<jsp:include page="elements/head.html" />
	<title>Registrar Receita</title>

</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<jsp:include page="elements/sidebar.html" />

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<jsp:include page="elements/topbar.html" />

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-4 text-gray-800">Registrar Receita</h1>

					<div class="row">

						<div class="col-lg-6">

							<!-- Circle Buttons -->


							<!-- Brand Buttons -->
							<div class="card shadow mb-3">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Receita</h6>
								</div>
								<div class="card-body">
									<form id="register-receita" class="row g-3">
										
										<div class="col-md-6">
											<label for="inputEmail4" class="form-label">Nome da receita</label>
											<input type="name" name="nome" class="form-control"
												id="nomeReceita" required>
										</div>
										<div class="col-md-6">
											<label for="" class="form-label">Valor</label>
											<input type="money" name="valor" class="form-control"
												id="valorReceita" placeholder="R$" required>
										</div>
										<div class="col-md-6">
											<label for="inputEmail4" class="form-label">Data inicial</label>
											<input type="date" name="dataInicio" class="form-control"
												id="dataInicio" required>
										</div>
										<div class="col-md-6">
											<label for="inputEmail4" class="form-label">Data final</label>
											<input type="date" name="dataFim" class="form-control" id="dataFim">
										</div>
										<div class="col-md-6">
											<label for="selectbody" class="form-label">Conta</label>
											<select name="conta" name="conta" id="selectbody"
												class="custom-select mr-sm-2" id="inlineFormCustomSelect">
											</select>
										</div>

										<div class="col-md-6">
											<label for="receita-des" class="form-label">Conta</label>
											<textarea id="description" name="description" class="form-control"
												placeholder="Descrição da receita" id="receita-des"
												style="height: 100px" required></textarea>
										</div>

										<input type="hidden" value="false" name="despesa">

										<div class="col-12">
											<button type="submit" class="btn btn-primary btn-lg">Registrar</button>
										</div>
									</form>
								</div>
							</div>

						</div>

						<div class="col-lg-6">

							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">O que é receita?</h6>
								</div>
								<div class="card-body">
									<p>Receita é tudo que adicionado a sua fonte de renda, geralmente são:
									    Salário, investimentos, aposentadoria e ganhos em geral.</p>

									<div class="my-2"></div>

								</div>
							</div>

						</div>


					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<jsp:include page="elements/footer.html" />

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top">
		<i class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<jsp:include page="elements/logout-modal.html" />
	<jsp:include page="elements/error-modal.html" />

	<!-- JavaScript for all pages -->
	<jsp:include page="elements/js.html" />
	<script src="js/accounts.js"></script>
	<script src="js/form.js"></script>

</body>

</html>