package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.PCConfig;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PCConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());


    }
}
