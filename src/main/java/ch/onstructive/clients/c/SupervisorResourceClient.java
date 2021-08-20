package ch.onstructive.clients.c;

import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.validation.Validated;

import javax.annotation.Generated;

/**
 * The distribution partners supervisor resource
 */
@Generated(
    date = "2021-07-05T10:48:14.234597Z",
    comments = "Specification filename: partners.supervisor.v1.json",
    value = "ch.silviowangler.restapi"
)
@Client(
    id = "distributionpartners"
)
@Validated
public interface SupervisorResourceClient {
  @Get("/api/v1/partners/{partner}/supervisor")
  @Consumes("application/json")
  SupervisorGetResourceModel getEntity(String partner);
}
