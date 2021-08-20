package ch.onstructive.clients.b;

import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.validation.Validated;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

/**
 * The distribution partner's children resource
 */
@Generated(
    date = "2021-07-05T10:48:14.231938Z",
    comments = "Specification filename: partners.children.v1.json",
    value = "ch.silviowangler.restapi"
)
@Client(
    id = "distributionpartners"
)
@Validated
public interface ChildrenResourceClient {
  @Get("/api/v1/partners/children")
  @Consumes("application/json")
  ChildrenGetResourceModel getEntity(@NotNull @QueryValue String employeeNumber);
}
