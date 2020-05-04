package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatchLogs {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatchLogs.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& args(orderDto, orderId) && target(object)")
    public void logEvent(OrderDto orderDto, Long orderId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + "; id: " + orderId + "; " + orderDto.toString());
    }
}
