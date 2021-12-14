public enum ModificationLevel {
  CLIENT("client",1),
  SERVICE("service",2),
  OWNER("owner",3);
  private final String key;
  private final int value;

  ModificationLevel(String key, int value) {
    this.key = key;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public String getKey() {
    return key;
  }


}
