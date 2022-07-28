package com.event;

import com.entity.AEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class AListener implements ApplicationListener<AEvent> {
    @Override
    public void onApplicationEvent(AEvent event) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
    }
}
