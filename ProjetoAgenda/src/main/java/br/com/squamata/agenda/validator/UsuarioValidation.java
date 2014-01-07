package br.com.squamata.agenda.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.squamata.agenda.domain.Usuario;

public class UsuarioValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors erros) {
		Usuario usuario = (Usuario) target;

	      if(StringUtils.isEmpty(usuario.getNome())) {
	    	  erros.rejectValue("nome", "Preencha corretamente o campo nome!");
	      }
	      
	      if(StringUtils.isEmpty(usuario.getNomeUsuario())) {
	    	  erros.rejectValue("NomeUsuario", "Preencha corretamente o campo nome de usuário!");
	      }
	      
	      if(StringUtils.isEmpty(usuario.getSenha())) {
	    	  erros.rejectValue("Senha", "Preencha corretamente o campo senha!");
	      }
	      
//	      if(StringUtils.isEmpty(usuario.getEmpresa())) {
//	    	  erros.rejectValue("Senha", "Preencha corretamente o campo senha!");
//	      }
		
	}

}
