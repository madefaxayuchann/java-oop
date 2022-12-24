package programmer.zaman.now.data;

public enum Level {
  //  ENUM IS METHOD WITH DATA LIMITED
  STANDAR("Standar Level"),
  PREMIUM("Premium Level"),
  VIP("Vip Level");

  private String description;

  Level(String description) {
    this.description  = description;
  }

  public String getDescription() {
    return description;
  }
}
