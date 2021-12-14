
public class Profile {
  private String funcKey;
  private long id;
  private String modificationLevel;
  private String visibilityLevel;

  public Profile(String funcKey, long id, String modificationLevel, String visibilityLevel) {
    this.funcKey = funcKey;
    this.id = id;
    this.modificationLevel = modificationLevel;
    this.visibilityLevel = visibilityLevel;
  }

  public Profile() {
  }

  public String getFuncKey() {
    return funcKey;
  }

  public void setFuncKey(String funcKey) {
    this.funcKey = funcKey;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getModificationLevel() {
    return modificationLevel;
  }

  public void setModificationLevel(String modificationLevel) {
    this.modificationLevel = modificationLevel;
  }

  public String getVisibilityLevel() {
    return visibilityLevel;
  }

  public void setVisibilityLevel(String visibilityLevel) {
    this.visibilityLevel = visibilityLevel;
  }

  @Override
  public String toString() {
    return "Profile{" +
        "funcKey='" + funcKey + '\'' +
        ", id=" + id +
        ", modificationLevel='" + modificationLevel + '\'' +
        ", visibilityLevel='" + visibilityLevel + '\'' +
        '}';
  }
}
