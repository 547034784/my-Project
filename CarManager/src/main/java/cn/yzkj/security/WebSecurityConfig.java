package cn.yzkj.security;
import cn.yzkj.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Administrator on 2017/9/19.
 */
@Configuration
@EnableWebSecurity
/*secutity安全框架*/
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
     CustomUserService customUserService(){
        return new CustomUserService();
    };

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
     auth.userDetailsService( customUserService());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**","/css/**","/images/** ");
    }
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        http.authorizeRequests()
                .anyRequest().authenticated() //任何请求,登录后可以访问
                .and()
                .formLogin()
                .loginPage("/loginPage").failureUrl("/loginError").permitAll().loginProcessingUrl("/login").successForwardUrl("/carMessage")
                .and()
                .csrf().disable();
    }
    public  void config(){
        System.out.println("你好");
    }
}