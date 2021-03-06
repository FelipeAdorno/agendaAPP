function LoginController($scope, $location, $http) {
	
	$scope.urlPrefix = "/squamata/";
	
	$scope.usuario = {};
	
	$scope.iniciar = function () {
	    var url = "" + $location.$$absUrl;
	    $scope.displayLoginError = (url.indexOf("error") >= 0);
	};
    $scope.cadastrar = function (cadastroForm) {
        var url = $scope.urlPrefix + "login/cadastrar";
        $http.post(url, JSON.stringify($scope.usuario))
        .success(function (retorno) {
//        	$(location).attr('href',$(location).attr("origin")+$scope.urlPrefix+"home/");
        	MensagemRetorno.tratarMensagesRetorno(retorno);
        })
        .error(function() {
        	MensagemRetorno.tratarMensagemErroComunicacao();
        });
    };

    $scope.iniciar();
    
};