package com.entity;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;


public class AEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public AEvent(Object source) {
        super(source);
        System.out.println("init AAAAAAAAAAAA");
    }
}
