package com.customer_details.Configuration;
//package com.customer_details.Configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.BeanIds;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import com.customer_details.Services.CustomerUserDetailsService;
//import com.customer_details.filters.JwtFilter;
//
//import springfox.documentation.service.AuthorizationScope;
//import springfox.documentation.service.SecurityReference;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//
//import java.util.Collections;
//import java.util.List;
//
//@Configuration
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true)
//
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private CustomerUserDetailsService customUserDetailsService;
//
//    @Autowired
//    private JwtFilter filter;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("customers/add-customer","/customers/authenticate").permitAll()
//                .antMatchers("customers/get-customer/{name}","customers/customer-id/{id}",
//                		"customers/get-all-customer","customers/update-profile/{id}").hasAnyAuthority("Admin","Customer")
//                .anyRequest().authenticated()
//                .and().exceptionHandling().and().sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
////
////    private SecurityContext securityContext() {
////        return SecurityContext.builder().securityReferences(defaultAuth()).build();
////    }
////
////    private List<SecurityReference> defaultAuth() {
////        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
////        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
////        authorizationScopes[0] = authorizationScope;
////        return Collections.singletonList(new SecurityReference("JWT", authorizationScopes));
////    }
//}
//
//
