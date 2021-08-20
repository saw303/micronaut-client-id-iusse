package ch.onstructive.clients.a;

import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.validation.Validated;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * The distribution partners resource
 */
@Generated(
    date = "2021-07-05T10:48:14.224334Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
@Client(
    id = "distributionpartners"
)
@Validated
public interface PartnersResourceClient {
  @Get("/api/v1/partners")
  @Consumes("application/json")
  PartnersGetResourceModel getEntity(@Nullable @QueryValue String text,
      @Nullable @QueryValue List<String> partnerId, @Nullable @QueryValue String parentPartnerId,
      @Nullable @QueryValue List<String> employeeNumber,
      @Nullable @Size(min = 1, max = 200) @QueryValue(defaultValue = "25") Integer limit);
}
