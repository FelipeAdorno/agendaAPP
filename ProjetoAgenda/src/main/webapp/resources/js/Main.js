$(document).ready(function(){
	Main.init();
});

var Main = {
		init : function() {
			$('.tel').mask('(99)9999-9999');
			$('.cnpj').mask('99.999.999/9999-99');
		}
};