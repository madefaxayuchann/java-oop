package programmer.zaman.now.data;

public class Bus implements Car{

  @Override
  public int getTier() {
    return 9;
  }

  @Override
  public void drive() {
    System.out.println("Bus Drive");
  }

  @Override
  public String getBrand() {
    return "Hatsukoi";
  }

  @Override
  public boolean isMaintenance() {
    return true;
  }

  @Override
  public boolean isBig() {
    return true;
  }
}
