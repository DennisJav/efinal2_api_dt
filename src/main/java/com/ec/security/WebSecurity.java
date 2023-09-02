package com.ec.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurity {



    @Autowired
    private AuthenticationEntryPoint authenticationEntryPoint;
    //crear cuatro metodos
    //al poner spring security
    //metodo que me permita hacer publica a l api de autenticacio

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests().antMatchers("/tokens/obtener/**")
                .permitAll().anyRequest().authenticated();

       //http.authenticationProvider(this.authenticationProvider());

        http.addFilterBefore(this.authenticationJWtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
       return http.build();
    }

    @Bean
    public AuthTokenFilter authenticationJWtTokenFilter(){
        return new AuthTokenFilter();
    }

}
