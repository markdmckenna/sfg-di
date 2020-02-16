package guru.springframework.sfgdi.sevices;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
