/*package com.fluentgrid.mdms.configuration;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class JndiDataConfig {

    @Bean
    public DataSource dataSource() throws NamingException {
          Context ctx = new InitialContext();
          return (DataSource) ctx.lookup("java:jboss/datasources/fgDevMssql");
    }

}*/
