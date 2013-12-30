var TipoMensagemEnum = {
  DANGER : {descricao: "DANGER", classe: "alert-danger"}, 
  SUCCESS: {descricao: "SUCCESS", classe: "alert-success"},
  INFO :   {descricao: "INFO", classe: "alert-info"},
  WARNING :{descricao: "WARNING", classe: "alert-warning"},
};

$(document).ready(function(){
	Main.init();
});

var Main = {
		init : function() {
			$('.tel').mask('(99)9999-9999');
			$('.cnpj').mask('99.999.999/9999-99');
		}
};