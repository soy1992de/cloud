package com.entity;

import org.springframework.context.ApplicationEvent;

public class BEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public BEvent(Object source) {
        super(source);
    }
}
