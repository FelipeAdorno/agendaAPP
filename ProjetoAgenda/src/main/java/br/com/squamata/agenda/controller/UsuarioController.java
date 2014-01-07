package br.com.squamata.agenda.controller;

import java.util.Locale;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.squamata.agenda.domain.Usuario;
import br.com.squamata.agenda.enumeration.TipoMensagemEnum;
import br.com.squamata.agenda.service.UsuarioService;
import br.com.squamata.agenda.vo.MensagemRetornoVO;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public ModelAndView novoUsuario(Model model) {
		Usuario usuarioLogado = this.getUsuarioLogado();
		model.addAttribute("usuarioLogado", usuarioLogado);
		return new ModelAndView("admin/usuario");
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ResponseEntity<MensagemRetornoVO> cadastrar(@RequestBody Usuario usuario, BindingResult result, Locale locale) {
		
		final MensagemRetornoVO retorno = new MensagemRetornoVO();
		
		//passando a empresa da sessão para o usuário
		usuario.setEmpresa(this.getUsuarioLogado().getEmpresa());
		
		if(result.hasErrors()) {
			tratarErrosValidacao(result.getFieldErrors());
		}else {
			
			logger.info("Realizando novo cadastro do usuário: " + usuario.getNomeUsuario());
			usuarioService.salvar(usuario);
			retorno.setTipoMensagemEnum(TipoMensagemEnum.SUCCESS);
			retorno.addMensagem("Usuário cadastrado com sucesso!");
		}
		
		return new ResponseEntity<MensagemRetornoVO>(retorno, HttpStatus.OK);
		
	}
	
}
