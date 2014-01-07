function UsuarioController($scope, $location, $http) {
	
	$scope.urlPrefix = "/squamata/";
	
	$scope.usuario = {};
	
	$scope.iniciar = function () {
	    
	};
    $scope.cadastrar = function (cadastroForm) {
        var url = $scope.urlPrefix + "usuario/cadastrar";
        $http.post(url, JSON.stringify($scope.usuario))
        .success(function (retorno) {
        	MensagemRetorno.tratarMensagesRetorno(retorno);
        })
        .error(function() {
        	MensagemRetorno.tratarMensagemErroComunicacao();
        });
    };
    
    $scope.iniciar();
    
};