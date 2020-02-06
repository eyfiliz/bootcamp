package bolum9;

public class Wall {

  private double width;
  private double height;

  Wall() {

  }

  Wall(double width, double height) {
    width = width < 0 ? 0 : width;
    height = height < 0 ? 0 : height;

    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    width = width < 0 ? 0 : width;
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    height = height < 0 ? 0 : height;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }
}
