package com.auth0.samples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint;
import org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpoint.ApplicationConditionEvaluation;
import org.springframework.boot.actuate.beans.BeansEndpoint;
import org.springframework.boot.actuate.beans.BeansEndpoint.ApplicationBeans;
import org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint;
import org.springframework.boot.actuate.context.properties.ConfigurationPropertiesReportEndpoint.ApplicationConfigurationProperties;
import org.springframework.boot.actuate.env.EnvironmentEndpoint;
import org.springframework.boot.actuate.env.EnvironmentEndpoint.EnvironmentDescriptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
public class ActuatorController {
  @Autowired private BeansEndpoint beansEndpoint;
  @Autowired private ConditionsReportEndpoint conditionsReportEndpoint;
  @Autowired private ConfigurationPropertiesReportEndpoint configurationPropertiesReportEndpoint;
  @Autowired private EnvironmentEndpoint environmentEndpoint;

  @GetMapping("/beans")
  public ApplicationBeans beans() {
    return beansEndpoint.beans();
  }

  @GetMapping("/conditions")
  public ApplicationConditionEvaluation conditions() {
    return conditionsReportEndpoint.applicationConditionEvaluation();
  }

  @GetMapping("/configprops")
  public ApplicationConfigurationProperties configprops() {
    return configurationPropertiesReportEndpoint.configurationProperties();
  }

  @GetMapping({"/env", "/env/{pattern}"})
  public EnvironmentDescriptor env(@PathVariable(required = false) String pattern) {
    return environmentEndpoint.environment(pattern);
  }
}
