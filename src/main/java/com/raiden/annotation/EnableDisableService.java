package com.raiden.annotation;

import com.raiden.config.NacosDiscoveryDisableServiceAutoConfiguration;
import com.raiden.config.NacosDiscoveryInstanceStatusHandlerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 0:54 2021/8/7
 * @Modified By:
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({NacosDiscoveryDisableServiceAutoConfiguration.class, NacosDiscoveryInstanceStatusHandlerConfiguration.class})
public @interface EnableDisableService {
}
