package com.asterai.botsfactory;

import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessage {
    private String name;

    public MessageService() {
        System.out.println("Bean created MessageService");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 4 : Hello ! " + name);
    }
}