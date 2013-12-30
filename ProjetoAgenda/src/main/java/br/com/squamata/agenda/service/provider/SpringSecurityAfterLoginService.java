package br.com.squamata.agenda.service.provider;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

@Service(value="springSecurityAfterLoginService")
public class SpringSecurityAfterLoginService extends SavedRequestAwareAuthenticationSuccessHandler {
	
	 @Override
     public void onAuthenticationSuccess(final HttpServletRequest request,  final HttpServletResponse response, final Authentication authentication) throws IOException, ServletException {
        
         try {
        	 
        	 String url = "";
        	 
        	 Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        	 
             if (roles.contains("ROLE_ADMIN")) {
            	url = "/squamata/admin/";
             }else if(roles.contains("ROLE_OPERADOR")) {
            	url = "/squamata/agendamento/";
             }else if(roles.contains("ROLE_USER")) {
            	 url = "/squamata/usuario/";
             }
             
             response.sendRedirect(url);
             
         } catch (Exception e) {
             logger.error("Error in getting User()", e);
         } 
     }
	
}
