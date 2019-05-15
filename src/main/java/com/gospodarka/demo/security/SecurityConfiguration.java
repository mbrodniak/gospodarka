//package com.gospodarka.demo.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable().authorizeRequests().antMatchers("/**").permitAll()
//                .and().formLogin().loginPage("/login")
//                .and().httpBasic();
//
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .withUser("user")
//                .password("{noop}password")
//                .roles("USER");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource())
//                .passwordEncoder(passwordEncoder())
//                .usersByUsernameQuery("select login, password from user where login=?")
//                .authoritiesByUsernameQuery("select login from user where login=?");
//    }
//
//    @Bean(name = "dataSource")
//    public DriverManagerDataSource dataSource() {
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//
//        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/gospodarka?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("Kolega66.");
//
//        return driverManagerDataSource;
//    }
//        @Bean
//        public static BCryptPasswordEncoder passwordEncoder(){
//            return new BCryptPasswordEncoder();
//        }
//
//}
