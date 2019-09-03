package com.uncle.auth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author 杨戬
 * @className DomainUserDetailsServiceImpl
 * @email uncle.yeung.bo@gmail.com
 * @date 19-9-2 11:23
 */
@Service("userDetailsService")
public class DomainUserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
