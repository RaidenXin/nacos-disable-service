package com.raiden.config;

import com.alibaba.cloud.nacos.ConditionalOnNacosDiscoveryEnabled;
import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.discovery.NacosDiscoveryAutoConfiguration;
import com.raiden.service.InstanceService;
import com.raiden.service.InstanceServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.ConditionalOnDiscoveryEnabled;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 23:53 2021/8/6
 * @Modified By:
 */
@Configuration
@AutoConfigureBefore(NacosDiscoveryAutoConfiguration.class)
@ConditionalOnDiscoveryEnabled
@ConditionalOnNacosDiscoveryEnabled
public class NacosDiscoveryDisableServiceAutoConfiguration {


    @Bean
    public InstanceService instanceService(){
        return new InstanceServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean
    public NacosDiscoveryProperties nacosProperties() {
        NacosDiscoveryProperties nacosDiscoveryProperties = new NacosDiscoveryProperties();
        nacosDiscoveryProperties.setInstanceEnabled(false);
        return nacosDiscoveryProperties;
    }

}
