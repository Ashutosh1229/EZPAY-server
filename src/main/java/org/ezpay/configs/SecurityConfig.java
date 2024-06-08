package org.ezpay.configs;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    public UserDetailsService userDetailsService(final PasswordEncoder passwordEncoder) {
//        UserDetails admin = User.withUsername("Zoya")
//                .password(passwordEncoder().encode("admin"))
//                .roles("ADMIN")
//                .build();
//        UserDetails user1 = User.withUsername("Ashu")
//                .password(passwordEncoder.encode("user"))
//                .roles("USER")
//                .build();
//        UserDetails user2 = User.withUsername("Shona")
//                .password(passwordEncoder.encode("user"))
//                .roles("USER")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user1, user2);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return null;
//    }
}
