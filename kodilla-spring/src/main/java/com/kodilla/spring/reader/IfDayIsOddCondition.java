package com.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class IfDayIsOddCondition implements Condition {


    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() % 2 != 0;
    }

    @Override
    public void await() throws InterruptedException {

    }

    @Override
    public void awaitUninterruptibly() {

    }

    @Override
    public long awaitNanos(long nanosTimeout) throws InterruptedException {
        return 0;
    }

    @Override
    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public boolean awaitUntil(Date deadline) throws InterruptedException {
        return false;
    }

    @Override
    public void signal() {

    }

    @Override
    public void signalAll() {

    }
}
