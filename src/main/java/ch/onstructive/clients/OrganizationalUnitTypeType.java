package ch.onstructive.clients;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated(
    date = "2021-07-05T10:48:14.221870Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
public class OrganizationalUnitTypeType implements Serializable {
  /**
   * number of the organizational unit
   */
  private String id;

  /**
   * name of the organizational unit
   */
  private String name;

  /**
   * optional supplement name of an organizational unit
   */
  private String nameSupplement;

  /**
   * website for this unit
   */
  private String webAddress;

  /**
   * address
   */
  private AddressType address;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameSupplement() {
    return this.nameSupplement;
  }

  public void setNameSupplement(String nameSupplement) {
    this.nameSupplement = nameSupplement;
  }

  public String getWebAddress() {
    return this.webAddress;
  }

  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }

  public AddressType getAddress() {
    return this.address;
  }

  public void setAddress(AddressType address) {
    this.address = address;
  }
}
