package br.com.squamata.agenda.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.squamata.agenda.domain.Empresa;
import br.com.squamata.agenda.enumeration.TipoMensagemEnum;
import br.com.squamata.agenda.service.EmpresaService;
import br.com.squamata.agenda.vo.MensagemRetornoVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private EmpresaService empresaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Locale locale, Model model) {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(Locale locale, Model model) {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public ModelAndView cadastro(Locale locale, Model model) {
		return new ModelAndView("cadastro");
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public ResponseEntity<MensagemRetornoVO> cadastrar(@Valid @RequestBody Empresa empresa, BindingResult result, Locale locale) {
		final MensagemRetornoVO retorno = new MensagemRetornoVO();
		if(result.hasErrors()) {
			retorno.setTipoMensagemEnum(TipoMensagemEnum.DANGER);
			for (FieldError error : result.getFieldErrors()) {
		       retorno.addMensagem(error.getDefaultMessage());
		    }
		}else {
			logger.info("Realizando novo cadastro da empresa: " + empresa.getNomeFantasia());
			empresaService.salvar(empresa);
			retorno.setTipoMensagemEnum(TipoMensagemEnum.SUCCESS);
			retorno.addMensagem("Cadastro realizado com sucesso, Clique <a href='/squamata/login/'>aqui</a> para fazer login!");
		}
		
		return new ResponseEntity<MensagemRetornoVO>(retorno, HttpStatus.OK);
		
	}
}
