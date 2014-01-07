package br.com.squamata.agenda.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.FieldError;

import br.com.squamata.agenda.domain.Usuario;
import br.com.squamata.agenda.enumeration.TipoMensagemEnum;
import br.com.squamata.agenda.service.UsuarioService;
import br.com.squamata.agenda.vo.MensagemRetornoVO;

public class AbstractController  {

	private static final Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	public Usuario getUsuarioLogado() {
		String loginAutenticado = SecurityContextHolder.getContext().getAuthentication().getName();
		logger.info("Usuário logado: " + loginAutenticado);
		return usuarioService.buscarPorNomeUsuario(loginAutenticado);
	}
	
	public MensagemRetornoVO tratarErrosValidacao(List<FieldError> erros) {
		final MensagemRetornoVO retorno = new MensagemRetornoVO();
		retorno.setTipoMensagemEnum(TipoMensagemEnum.DANGER);
		for (FieldError error : erros) {
		   retorno.addMensagem(error.getDefaultMessage());
		}
		
		return retorno;
	}
}
