package programmer.zaman.now.data;

public interface Car extends HasBrand, isMaintenance {

  int getTier();

  void drive();

  default boolean isBig() {
    return false;
  }
}
