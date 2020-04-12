package com.auth0.samples.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// spring-boot-actuator-autoconfigure-2.2.2.RELEASE.jar!/META-INF/spring.factories
@Import({
    org.springframework.boot.actuate.autoconfigure.amqp.RabbitHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.audit.AuditAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.audit.AuditEventsEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.beans.BeansEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.cache.CachesEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.cassandra.CassandraHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.cassandra.CassandraReactiveHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.cloudfoundry.servlet.CloudFoundryActuatorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.cloudfoundry.reactive.ReactiveCloudFoundryActuatorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.context.ShutdownEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.couchbase.CouchbaseHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.couchbase.CouchbaseReactiveHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.elasticsearch.ElasticSearchClientHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.elasticsearch.ElasticSearchJestHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.elasticsearch.ElasticSearchRestHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.flyway.FlywayEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.hazelcast.HazelcastHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.health.HealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.influx.InfluxDbHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.info.InfoEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.integration.IntegrationGraphEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.jms.JmsHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.jolokia.JolokiaEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.ldap.LdapHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.liquibase.LiquibaseEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.logging.LoggersEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.mail.MailHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.management.ThreadDumpEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.KafkaMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.Log4J2MetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.MetricsEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.amqp.RabbitMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.cache.CacheMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.appoptics.AppOpticsMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.atlas.AtlasMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.datadog.DatadogMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.dynatrace.DynatraceMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.elastic.ElasticMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.ganglia.GangliaMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.graphite.GraphiteMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.humio.HumioMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.influx.InfluxMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.jmx.JmxMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.kairos.KairosMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.newrelic.NewRelicMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.prometheus.PrometheusMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.signalfx.SignalFxMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.statsd.StatsdMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.export.wavefront.WavefrontMetricsExportAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.jersey.JerseyServerMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.orm.jpa.HibernateMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.web.jetty.JettyMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.web.reactive.WebFluxMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.mongo.MongoHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.mongo.MongoReactiveHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.neo4j.Neo4jHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.redis.RedisHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.redis.RedisReactiveHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.scheduling.ScheduledTasksEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.security.reactive.ReactiveManagementWebSecurityAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.session.SessionsEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.solr.SolrHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthContributorAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.reactive.ReactiveManagementContextAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementContextAutoConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.web.reactive.WebFluxEndpointManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration.class,
//    org.springframework.boot.actuate.autoconfigure.endpoint.web.jersey.JerseyWebEndpointManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.security.servlet.SecurityRequestMatchersManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.jersey.JerseySameManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.jersey.JerseyChildManagementContextConfiguration.class,
    org.springframework.boot.actuate.autoconfigure.web.reactive.ReactiveManagementChildContextConfiguration.class
//    org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementChildContextConfiguration.class,
//    org.springframework.boot.actuate.autoconfigure.web.servlet.WebMvcEndpointChildContextConfiguration.class
})
@Configuration
public class ActuatorAutoConfigure {

}