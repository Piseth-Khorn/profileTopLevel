import java.util.Objects;

public class EmailCampaignAdapter implements EmailCampaignFlowDetailAdapter<EmailCampaignAdapter> {

  private long id;
  private String campaignName;
  private String fileUrl;

  public EmailCampaignAdapter() {
  }

  public EmailCampaignAdapter(long id, String campaignName, String fileUrl) {
    this.id = id;
    this.campaignName = campaignName;
    this.fileUrl = fileUrl;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
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
    if (!(o instanceof EmailCampaignAdapter)) {
      return false;
    }
    EmailCampaignAdapter that = (EmailCampaignAdapter) o;
    return getId() == that.getId() &&
        Objects.equals(getCampaignName(), that.getCampaignName()) &&
        Objects.equals(getFileUrl(), that.getFileUrl());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getCampaignName(), getFileUrl());
  }

  @Override
  public String toString() {
    return "EmailCampaignAdapter{" +
        "id=" + id +
        ", campaignName='" + campaignName + '\'' +
        ", fileUrl='" + fileUrl + '\'' +
        '}';
  }

  @Override
  public EmailCampaignAdapter getEmailCampaignFlowCreationAdapter() {
    return this;
  }

  @Override
  public void setEmailCampaignFlowCreationAdapter(
      EmailCampaignFlowCreation emailCampaignFlowCreation) {
    setId(emailCampaignFlowCreation.getId());
    setCampaignName(emailCampaignFlowCreation.getCampaignFlowName());
    setFileUrl(emailCampaignFlowCreation.getFileUrl());
  }

  @Override
  public EmailCampaignFlowCreation getEmailCampaignFlowCreation() {
    return new EmailCampaignFlowCreation(this.id, this.campaignName, this.fileUrl);
  }
}
