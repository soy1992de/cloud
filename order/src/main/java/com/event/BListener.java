package com.event;

import com.entity.BEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class BListener implements ApplicationListener<BEvent> {
    @Override
    public void onApplicationEvent(BEvent event) {
        System.out.println("BBBBBBBBBBBBBBBB");
    }
}
