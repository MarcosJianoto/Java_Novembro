package entities;

import enums.Color;

public class Circle extends Shape {

  private Double radius;

  public Circle() {}

  public Circle(Double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  public Double getRadius() {
    return this.radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }
}
