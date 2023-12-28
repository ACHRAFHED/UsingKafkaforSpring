package com.example.demospringcloudstreamskafka.services;

import com.example.demospringcloudstreamskafka.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Date;

@Service
public class PageEventSevice {
    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (pageEvent) -> {
            System.out.println("******************");
            System.out.println(pageEvent.toString());
            System.out.println("******************");
        };
    }
    public Supplier<PageEvent> pageEventSupplier()
    {
        return () ->  new PageEvent(
            Math.random()>0.5? "P1" :"P2",
            Math.random()>0.5? "U1" :"U2",
            new Date(),
            new Random().nextInt(9000));

    }
    @Bean
    public Function<PageEvent,PageEvent> pageEventFunction()
    {
        return (input) ->{
            input.setName(input.getName().toUpperCase());
            input.setUser("UUUUU");
            return input;
        };

    }
}
