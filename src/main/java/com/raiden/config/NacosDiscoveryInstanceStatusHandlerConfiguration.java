package com.raiden.config;

import com.alibaba.cloud.nacos.registry.NacosRegistration;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistry;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistryAutoConfiguration;
import com.raiden.handler.InstanceStatusHandler;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 9:42 2021/8/7
 * @Modified By:
 */
@Configuration
@AutoConfigureAfter(NacosServiceRegistryAutoConfiguration.class)
public class NacosDiscoveryInstanceStatusHandlerConfiguration {
    @Bean
    public InstanceStatusHandler instanceStatusHandler(NacosServiceRegistry registry, NacosRegistration registration){
        return new InstanceStatusHandler(registry, registration);
    }
}
