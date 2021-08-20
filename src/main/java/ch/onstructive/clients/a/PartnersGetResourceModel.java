package ch.onstructive.clients.a;

import ch.onstructive.clients.DistributionpartnerType;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Generated(
    date = "2021-07-05T10:48:14.223670Z",
    comments = "Specification filename: partners.v1.json",
    value = "ch.silviowangler.restapi"
)
public class PartnersGetResourceModel implements Serializable {
  /**
   * how many records matched the query
   */
  private Integer numberOfHits;

  /**
   * the matching distribution partners, at most limit
   */
  private List<DistributionpartnerType> distributionPartners = new java.util.ArrayList<>();

  public PartnersGetResourceModel() {
  }

  public PartnersGetResourceModel(Integer numberOfHits,
      List<DistributionpartnerType> distributionPartners) {
    this.numberOfHits = numberOfHits;
    this.distributionPartners = distributionPartners;
  }

  public Integer getNumberOfHits() {
    return this.numberOfHits;
  }

  public void setNumberOfHits(Integer numberOfHits) {
    this.numberOfHits = numberOfHits;
  }

  public List<DistributionpartnerType> getDistributionPartners() {
    return this.distributionPartners;
  }

  public void setDistributionPartners(List<DistributionpartnerType> distributionPartners) {
    this.distributionPartners = distributionPartners;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (! (other instanceof PartnersGetResourceModel)) return false;
    PartnersGetResourceModel that = (PartnersGetResourceModel) other;
    return Objects.equals(getNumberOfHits(), that.getNumberOfHits()) && Objects.equals(getDistributionPartners(), that.getDistributionPartners());
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfHits, distributionPartners);
  }
}
