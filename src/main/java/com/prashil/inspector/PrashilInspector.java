package com.prashil.inspector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by prashil on 10/11/16.
 */
@ComponentScan
@SpringBootApplication
public class PrashilInspector {

   112 public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PrashilInspector.class, args);
    }

}
