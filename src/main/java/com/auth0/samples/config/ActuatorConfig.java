package com.auth0.samples.config;

import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint;
import org.springframework.boot.actuate.beans.BeansEndpoint;
import org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint;
import org.springframework.boot.actuate.env.EnvironmentEndpoint;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ActuatorConfig {
  @Bean
  public BeansEndpoint beansEndpoint(ConfigurableApplicationContext context) {
    return new BeansEndpoint(context);
  }

  @Bean
  public ConditionsReportEndpoint conditionsReportEndpoint(ConfigurableApplicationContext context) {
    return new ConditionsReportEndpoint(context);
  }

  @Bean
  public ConfigurationPropertiesReportEndpoint configurationPropertiesReportEndpoint() {
    return new ConfigurationPropertiesReportEndpoint();
  }

  @Bean
  public EnvironmentEndpoint environmentEndpoint(Environment environment) {
    return new EnvironmentEndpoint(environment);
  }
}
