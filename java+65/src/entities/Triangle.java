package entities;

public class Triangle {

  private int height;
  private int widht;

  public Triangle() {}

  public Triangle(int height, int widht) {
    this.height = height;
    this.widht = widht;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidht() {
    return this.widht;
  }

  public void setWidht(int widht) {
    this.widht = widht;
  }
}
