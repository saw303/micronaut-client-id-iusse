package ch.onstructive.clients;

import javax.annotation.Generated;
import java.io.Serializable;

@Generated(
    date = "2021-07-05T10:48:14.222328Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
public class DistributionpartnerType implements Serializable {
  /**
   * the distribution partner id
   */
  private String id;

  /**
   * the partner type
   */
  private TypeType type;

  /**
   * the partner definition
   */
  private String definition;

  /**
   * List of distributon partner numbers, described as a path from the root node to (including) this distribution partner, separated by a slash
   */
  private String path;

  /**
   * employee number for employees of SWICA
   */
  private String employeeNumber;

  /**
   * If true, this is the default distribution partner of a person. Is relevant for employees with several distribution partner numbers.
   */
  private Boolean isDefault;

  /**
   * last name
   */
  private String lastName;

  /**
   * last name
   */
  private String firstName;

  /**
   * phone number in the international format according to ITU-T E.123
   */
  private String phoneNumber;

  /**
   * business phone number in the international format according to ITU-T E.123
   */
  private String phoneNumberBusiness;

  /**
   * mobile number in the international format according to ITU-T E.123
   */
  private String mobileNumber;

  /**
   * email address according to RFC 5322
   */
  private String email;

  /**
   * business email address according to RFC 5322
   */
  private String emailBusiness;

  /**
   * the person agency
   */
  private AgencyTypeType agency;

  /**
   * the organizational unit
   */
  private OrganizationalUnitTypeType organizationalUnit;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TypeType getType() {
    return this.type;
  }

  public void setType(TypeType type) {
    this.type = type;
  }

  public String getDefinition() {
    return this.definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getEmployeeNumber() {
    return this.employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public Boolean getIsDefault() {
    return this.isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumberBusiness() {
    return this.phoneNumberBusiness;
  }

  public void setPhoneNumberBusiness(String phoneNumberBusiness) {
    this.phoneNumberBusiness = phoneNumberBusiness;
  }

  public String getMobileNumber() {
    return this.mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmailBusiness() {
    return this.emailBusiness;
  }

  public void setEmailBusiness(String emailBusiness) {
    this.emailBusiness = emailBusiness;
  }

  public AgencyTypeType getAgency() {
    return this.agency;
  }

  public void setAgency(AgencyTypeType agency) {
    this.agency = agency;
  }

  public OrganizationalUnitTypeType getOrganizationalUnit() {
    return this.organizationalUnit;
  }

  public void setOrganizationalUnit(OrganizationalUnitTypeType organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
  }

  @Generated(
      date = "2021-07-05T10:48:14.222509Z",
      comments = "Specification filename: partners.v1.json",
      value = "ch.silviowangler.restapi"
  )
  public enum TypeType {
    INTERNAL,

    EXTERNAL
  }
}
