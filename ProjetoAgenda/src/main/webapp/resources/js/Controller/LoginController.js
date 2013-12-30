function LoginController($scope, $location, $http) {
	
	$scope.urlPrefix = "/squamata/";
	
	$scope.empresa = {};
	
	$scope.iniciar = function () {
	    var url = "" + $location.$$absUrl;
	    $scope.displayLoginError = (url.indexOf("error") >= 0);
	};
    $scope.cadastrar = function (cadastroForm) {
        var url = $scope.urlPrefix + "login/cadastrar";
        $http.post(url, JSON.stringify($scope.empresa))
        .success(function (retorno) {
//        	$(location).attr('href',$(location).attr("origin")+$scope.urlPrefix+"home/");
        	$scope.tratarMensagesRetorno(retorno);
        })
        .error(function() {
        	$(".alert").addClass(TipoMensagemEnum.DANGER.classe);
        	$(".mensagens").html("Erro na comunicação com o servidor, tente novamente.");
        });
    };
    
    $scope.tratarMensagesRetorno = function(retorno) {
    	if(retorno.mensagens.length > 0) {
    		$(".alert").removeClass("nao-visivel");
    		if(TipoMensagemEnum.DANGER.descricao == retorno.tipoMensagemEnum){
        		$(".alert").addClass(TipoMensagemEnum.DANGER.classe);
        	}else if(TipoMensagemEnum.INFO.descricao == retorno.tipoMensagemEnum) {
        		$(".alert").addClass(TipoMensagemEnum.INFO.classe);
        	}else if(TipoMensagemEnum.SUCCESS.descricao == retorno.tipoMensagemEnum) {
        		$(".alert").addClass(TipoMensagemEnum.SUCCESS.classe);
        	}else if(TipoMensagemEnum.WARNING.descricao == retorno.tipoMensagemEnum) {
        		$(".alert").addClass(TipoMensagemEnum.WARNING.classe);
        	}
        	var mensagesHtml = "";
        	jQuery.each(retorno.mensagens, function( i, mensagem) {
        		mensagesHtml += mensagem+"<br />";
        	});
        	$(".mensagens").html(mensagesHtml);
    	}
    	
    };
    
    $scope.iniciar();
    
};