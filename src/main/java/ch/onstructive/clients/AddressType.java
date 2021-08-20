package ch.onstructive.clients;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated(
    date = "2021-07-05T10:48:14.220884Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
public class AddressType implements Serializable {
  /**
   * the distribution partner id
   */
  private String street;

  /**
   * House number
   */
  private String houseNumber;

  /**
   * house number supplement
   */
  private String houseNumberSupplement;

  /**
   * postalCode
   */
  private String postalCode;

  /**
   * city
   */
  private String city;

  /**
   * country code according to ISO3166 ALPHA-2
   */
  private String country;

  public String getStreet() {
    return this.street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getHouseNumber() {
    return this.houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getHouseNumberSupplement() {
    return this.houseNumberSupplement;
  }

  public void setHouseNumberSupplement(String houseNumberSupplement) {
    this.houseNumberSupplement = houseNumberSupplement;
  }

  public String getPostalCode() {
    return this.postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return this.country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}
