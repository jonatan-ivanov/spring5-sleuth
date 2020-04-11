/*
 * Copyright 2020 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.auth0.samples.config;

import org.springframework.cloud.sleuth.annotation.SleuthAnnotationAutoConfiguration;
import org.springframework.cloud.sleuth.autoconfig.TraceAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.async.AsyncAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.async.AsyncCustomAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.async.AsyncDefaultAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.circuitbreaker.SleuthCircuitBreakerAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.grpc.TraceGrpcAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.messaging.SleuthKafkaStreamsConfiguration;
import org.springframework.cloud.sleuth.instrument.messaging.TraceMessagingAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.messaging.TraceSpringIntegrationAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.opentracing.OpentracingAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.quartz.TraceQuartzAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.reactor.TraceReactorAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.redis.TraceRedisAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.rpc.TraceRpcAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.rxjava.RxJavaAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.scheduling.TraceSchedulingAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.TraceHttpAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.TraceWebAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.TraceWebFluxAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.TraceWebServletAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.client.TraceWebAsyncClientAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.client.TraceWebClientAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.web.client.feign.TraceFeignClientAutoConfiguration;
import org.springframework.cloud.sleuth.sampler.SamplerAutoConfiguration;
import org.springframework.cloud.sleuth.zipkin2.ZipkinAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Peter Varsanyi (v-pevarsanyi@expediagroup.com)
 */
//@Import({HystrixTracingAutoConfiguration.class,
//        CustomAsyncConfigurerAutoConfiguration.class,
//        DefaultAsyncAutoConfiguration.class,
//        ScheduledAutoConfiguration.class,
//        LoggingAutoConfiguration.class,
//        ZipkinAutoConfiguration.class
//})
@Import({
        SleuthAnnotationAutoConfiguration.class,
        SamplerAutoConfiguration.class,
//        TraceBaggageAutoConfiguration.class,
//        TraceSpringMessagingAutoConfiguration.class,
        TraceAutoConfiguration.class,
        TraceHttpAutoConfiguration.class,
        TraceWebAutoConfiguration.class,
        TraceWebServletAutoConfiguration.class,
        TraceWebClientAutoConfiguration.class,
        TraceWebAsyncClientAutoConfiguration.class,
        AsyncAutoConfiguration.class,
        AsyncCustomAutoConfiguration.class,
        AsyncDefaultAutoConfiguration.class,
        TraceSchedulingAutoConfiguration.class,
        TraceFeignClientAutoConfiguration.class,
        SleuthCircuitBreakerAutoConfiguration.class,
        RxJavaAutoConfiguration.class,
        TraceReactorAutoConfiguration.class,
        TraceWebFluxAutoConfiguration.class,
        TraceRpcAutoConfiguration.class,
        TraceGrpcAutoConfiguration.class,
        SleuthKafkaStreamsConfiguration.class,
        TraceMessagingAutoConfiguration.class,
        TraceSpringIntegrationAutoConfiguration.class,
        ZipkinAutoConfiguration.class,
//        TraceWebSocketAutoConfiguration.class,
        OpentracingAutoConfiguration.class,
        TraceRedisAutoConfiguration.class,
        TraceQuartzAutoConfiguration.class
})
@Configuration
public class Config {
}