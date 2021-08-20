package ch.onstructive;

import ch.onstructive.clients.a.PartnersResourceClient;
import ch.onstructive.clients.b.ChildrenResourceClient;
import ch.onstructive.clients.c.SupervisorResourceClient;
import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = Micronaut.run(Application.class, args);

        PartnersResourceClient partnersResourceClient = applicationContext.getBean(PartnersResourceClient.class);
        ChildrenResourceClient childrenResourceClient = applicationContext.getBean(ChildrenResourceClient.class);
        SupervisorResourceClient supervisorResourceClient = applicationContext.getBean(SupervisorResourceClient.class);

        try {
            partnersResourceClient.getEntity("hello", null, null, List.of("11"), 1);
        } catch (Exception e) {
            // there is no actual backend, so we simply catch the failing request error
            e.printStackTrace();
        }
        try {
            childrenResourceClient.getEntity("11");
        } catch (Exception e) {
            // there is no actual backend, so we simply catch the failing request error
            e.printStackTrace();
        }
        try {
            supervisorResourceClient.getEntity("11");
        } catch (Exception e) {
            // there is no actual backend, so we simply catch the failing request error
            e.printStackTrace();
        }
        System.exit(0);
    }
}
