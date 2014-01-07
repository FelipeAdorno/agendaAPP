package br.com.squamata.agenda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.squamata.agenda.domain.Usuario;
import br.com.squamata.agenda.service.UsuarioService;

@Controller
@RequestMapping(value="/admin")
public class AdminController extends AbstractController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		Usuario usuarioLogado = this.getUsuarioLogado();
		model.addAttribute("usuarioLogado", usuarioLogado);
		return new ModelAndView("admin/index");
	}
}
