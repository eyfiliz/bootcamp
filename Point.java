package bolum9;

public class Point {

  private int x;
  private int y;

  Point() {

  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance() {
    return distance(0, 0);
  }

  public double distance(int x, int y) {
    return distance((double)x, (double)y);
  }

  public double distance(double x, double y) {
    return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
  }
}
