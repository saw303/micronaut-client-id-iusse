package ch.onstructive.clients;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated(
    date = "2021-07-05T10:48:14.221429Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
public class AgencyTypeType implements Serializable {
  /**
   * the distribution partner id
   */
  private String distributionPartnerId;

  /**
   * The persons first name
   */
  private String firstName;

  /**
   * name of the agency, In case of a sole trader the name and first name are separated
   */
  private String name;

  /**
   * optional supplement name except for sole traders
   */
  private String nameSupplement;

  /**
   * address
   */
  private AddressType address;

  public String getDistributionPartnerId() {
    return this.distributionPartnerId;
  }

  public void setDistributionPartnerId(String distributionPartnerId) {
    this.distributionPartnerId = distributionPartnerId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
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

  public AddressType getAddress() {
    return this.address;
  }

  public void setAddress(AddressType address) {
    this.address = address;
  }
}
