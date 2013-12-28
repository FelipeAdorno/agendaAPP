package br.com.squamata.agenda.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.squamata.agenda.service.EmpresaService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/")
public class SiteController {
	
	private static final Logger logger = LoggerFactory.getLogger(SiteController.class);
	
	@Autowired
	private EmpresaService empresaService;
	
	@Autowired 
	private PasswordEncoder encoder;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Locale locale, Model model) {
		return new ModelAndView("site/index");
	}
	
	@RequestMapping(value = "/contato", method = RequestMethod.GET)
	public ModelAndView contato(Locale locale, Model model) {
		return new ModelAndView("site/contato");
	}
	
	@RequestMapping(value = "/aderir", method = RequestMethod.GET)
	public ModelAndView aderir(Locale locale, Model model) {
		return new ModelAndView("site/aderir");
	}
	
	@RequestMapping(value = "/sobre", method = RequestMethod.GET)
	public ModelAndView sobre(Locale locale, Model model) {
		return new ModelAndView("site/sobre");
	}
}
