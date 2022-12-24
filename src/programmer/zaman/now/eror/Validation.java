package programmer.zaman.now.eror;

public class Validation extends Throwable {
  public String message;

  public Validation(String message) {
    super(message);
  }

  public String getMessage() {
    return message;
  }
}
