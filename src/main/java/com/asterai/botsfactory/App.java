package com.asterai.botsfactory;

import org.springframework.beans.factory.annotation.Autowired;

public class App {

    private IMessage messageService;

    @Autowired
    public void setMessageService(IMessage messageService) {
        System.out.println("setMessageService");
        this.messageService = messageService;
    }

    void run() {
        messageService.printHello();
    }
}
