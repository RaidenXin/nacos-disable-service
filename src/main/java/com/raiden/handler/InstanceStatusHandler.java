package com.raiden.handler;

import com.alibaba.cloud.nacos.registry.NacosRegistration;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistry;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 1:14 2021/8/7
 * @Modified By:
 */
public class InstanceStatusHandler {


    private static final String STATUS_UP = "UP";

    private static final String STATUS_DOWN = "DOWN";

    private NacosServiceRegistry registry;
    private NacosRegistration registration;

    public InstanceStatusHandler(NacosServiceRegistry registry, NacosRegistration registration){
        this.registry = registry;
        this.registration = registration;
    }


    public boolean disable() {
        try {
            registry.setStatus(registration, STATUS_DOWN);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public boolean enable() {
        try {
            registry.setStatus(registration, STATUS_UP);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
