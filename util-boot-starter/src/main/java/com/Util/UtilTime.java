package com.Util;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UtilTime {

    public void now(){
        System.out.println("+++++++++++++++++++++++"+new Date());
    }
}
