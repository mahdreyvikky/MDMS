package com.fluentgrid.mdms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MdmsApplication  extends SpringBootServletInitializer {
   
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MdmsApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(MdmsApplication.class, args);
		new SpringApplicationBuilder(MdmsApplication.class).run(args);
	}

}
