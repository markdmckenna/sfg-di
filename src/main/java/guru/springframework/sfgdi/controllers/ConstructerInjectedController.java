package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.sevices.GreetingService;

public class ConstructerInjectedController {

    private final GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
