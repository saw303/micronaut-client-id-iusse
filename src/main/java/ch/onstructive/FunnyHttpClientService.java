package ch.onstructive;

import ch.onstructive.clients.a.PartnersResourceClient;
import ch.onstructive.clients.b.ChildrenResourceClient;
import ch.onstructive.clients.c.SupervisorResourceClient;

import javax.inject.Singleton;
import java.util.List;

/**
 * your description goes here...
 *
 * @author Silvio Wangler (silvio.wangler@onstructive.ch)
 */
@Singleton
public class FunnyHttpClientService {

    private final PartnersResourceClient partnersResourceClient;
    private final ChildrenResourceClient childrenResourceClient;
    private final SupervisorResourceClient supervisorResourceClient;

    public FunnyHttpClientService(PartnersResourceClient partnersResourceClient, ChildrenResourceClient childrenResourceClient, SupervisorResourceClient supervisorResourceClient) {
        this.partnersResourceClient = partnersResourceClient;
        this.childrenResourceClient = childrenResourceClient;
        this.supervisorResourceClient = supervisorResourceClient;
    }

    public void goCrazy() {
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
    }
}
