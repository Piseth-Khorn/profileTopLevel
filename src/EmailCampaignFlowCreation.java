import java.lang.reflect.Field;

public class EmailCampaignFlowCreation {

  private long id;
  private String campaignFlowName;
  private String fileUrl;

  public EmailCampaignFlowCreation(long id, String campaignFlowName, String fileUrl) {
    this.id = id;
    this.campaignFlowName = campaignFlowName;
    this.fileUrl = fileUrl;
  }

  public EmailCampaignFlowCreation(Object o){
    Field[] declaredFields = o.getClass().getDeclaredFields();
    for (var s: declaredFields) {
      System.out.println(s.getName());
    }
  }
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCampaignFlowName() {
    return campaignFlowName;
  }

  public void setCampaignFlowName(String campaignFlowName) {
    this.campaignFlowName = campaignFlowName;
  }

  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Override
  public String toString() {
    return "EmailCampaignFlowCreation{" +
        "id=" + id +
        ", campaignFlowName='" + campaignFlowName + '\'' +
        ", fileUrl='" + fileUrl + '\'' +
        '}';
  }
}
