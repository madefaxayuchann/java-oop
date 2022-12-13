class Shape {
  int getCorner() {
    return 0;
  }
}

class Rectangle extends Shape {
  // super keyword: to access method override on class parent
  int getCorner() {
    return 4;
  }

  int getParentCorner() {
    return super.getCorner();
  }
}
