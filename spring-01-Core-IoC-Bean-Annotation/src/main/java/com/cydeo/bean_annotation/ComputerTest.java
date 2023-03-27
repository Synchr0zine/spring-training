package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.StringIntegerConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, StringIntegerConfig.class);

        Monitor themonitor = container.getBean(Monitor.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);
        Case theCase = container.getBean(Case.class);

        PC myPC = new PC(theCase, themonitor, theMotherboard);

        myPC.powerUp();
    }
}
