import java.util.Objects;

public class FlowTraceabilityAdapter implements
    EmailCampaignFlowDetailAdapter<FlowTraceabilityAdapter> {

  private long id;
  private String flowName;
  private String fileUrl;

  public FlowTraceabilityAdapter() {
  }

  public FlowTraceabilityAdapter(long id, String flowName, String fileUrl) {
    this.id = id;
    this.flowName = flowName;
    this.fileUrl = fileUrl;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFlowName() {
    return flowName;
  }

  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }

  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FlowTraceabilityAdapter)) {
      return false;
    }
    FlowTraceabilityAdapter that = (FlowTraceabilityAdapter) o;
    return getId() == that.getId() &&
        Objects.equals(getFlowName(), that.getFlowName()) &&
        Objects.equals(getFileUrl(), that.getFileUrl());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getFlowName(), getFileUrl());
  }

  @Override
  public String toString() {
    return "FlowTraceabilityAdapter{" +
        "id=" + id +
        ", flowName='" + flowName + '\'' +
        ", fileUrl='" + fileUrl + '\'' +
        '}';
  }



  @Override
  public FlowTraceabilityAdapter getEmailCampaignFlowCreationAdapter() {
    return null;
  }

  @Override
  public void setEmailCampaignFlowCreationAdapter(
      EmailCampaignFlowCreation emailCampaignFlowCreation) {
    
  }


  @Override
  public EmailCampaignFlowCreation getEmailCampaignFlowCreation() {
    return new EmailCampaignFlowCreation(this.id, this.flowName, this.fileUrl);
  }
}
