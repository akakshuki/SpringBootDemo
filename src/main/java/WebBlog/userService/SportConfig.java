package WebBlog.userService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
 @Bean
 public iFortuneService sadFortuneService() {
	 return new SadFortuneService();
 }
 
 @Bean
 public ICoach swimCoach(){
	 return new SwimCoach(sadFortuneService());
 }
}
