package ch.onstructive.clients.c;

import ch.onstructive.clients.DistributionpartnerType;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Objects;

@Generated(
    date = "2021-07-05T10:48:14.233989Z",
    comments = "Specification filename: partners.supervisor.v1.json",
    value = "ch.silviowangler.restapi"
)
public class SupervisorGetResourceModel implements Serializable {
  /**
   * the distribution partner supervisor
   */
  private DistributionpartnerType distributionPartner;

  public SupervisorGetResourceModel() {
  }

  public SupervisorGetResourceModel(DistributionpartnerType distributionPartner) {
    this.distributionPartner = distributionPartner;
  }

  public DistributionpartnerType getDistributionPartner() {
    return this.distributionPartner;
  }

  public void setDistributionPartner(DistributionpartnerType distributionPartner) {
    this.distributionPartner = distributionPartner;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (! (other instanceof SupervisorGetResourceModel)) return false;
    SupervisorGetResourceModel that = (SupervisorGetResourceModel) other;
    return Objects.equals(getDistributionPartner(), that.getDistributionPartner());
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionPartner);
  }
}
