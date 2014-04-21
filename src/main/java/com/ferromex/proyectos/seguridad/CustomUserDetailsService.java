package com.ferromex.proyectos.seguridad;


import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.ArrayList;

public class CustomUserDetailsService implements UserDetailsService {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	
	public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException, DataAccessException{
        
		logger.info("--- Usuario Recibido --- " + username);

        //hard coded, in real life retrieved via database or LDAP
        SimpleGrantedAuthority  au_impl = new SimpleGrantedAuthority ("ROLE_USER");
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(au_impl);
        
        User user = new User(username, "password", true, true, true, true, authorities);
        
        logger.info("--- Usuario Complemento --- " + user.toString());
        return user;
    }
}
