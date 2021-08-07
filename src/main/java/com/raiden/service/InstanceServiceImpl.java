package com.raiden.service;

import com.raiden.handler.InstanceStatusHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

/**
 * @创建人:Raiden
 * @Descriotion:
 * @Date:Created in 10:03 2021/8/7
 * @Modified By:
 */
public class InstanceServiceImpl implements InstanceService{

    @Autowired
    @Lazy
    private InstanceStatusHandler handler;

    @Override
    public boolean disable() {
        return handler.disable();
    }

    @Override
    public boolean enable() {
        return handler.enable();
    }
}
