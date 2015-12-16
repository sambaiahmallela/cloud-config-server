package testconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class TestConfigServerApplication{

 public static void main(String[] args) throws Exception {

	 SpringApplication.run(TestConfigServerApplication.class, args);
    }


}
