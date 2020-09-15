package com.ipos.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

	
	@Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) {
        System.out.println(serverProperties);
    }

    public static void main(String[] args) {
    	SpringApplication.run(ProfilesApplication.class, args);
    }

}
