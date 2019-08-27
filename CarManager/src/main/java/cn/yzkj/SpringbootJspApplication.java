package cn.yzkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"cn.yzkj.controller", "cn.yzkj.service", "cn.yzkj.entity",
"cn.yzkj.security"})
@EnableJpaRepositories("cn.yzkj.dao")
@EnableAutoConfiguration
@EntityScan("cn.yzkj.entity")
public class SpringbootJspApplication {

    public static void main(String[] args) {
        SpringApplication.run( SpringbootJspApplication.class, args );
    }

}
