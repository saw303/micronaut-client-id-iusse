package ch.onstructive;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = Micronaut.run(Application.class, args);

        FunnyHttpClientService service = applicationContext.getBean(FunnyHttpClientService.class);
        service.goCrazy();
        System.exit(0);
    }
}
