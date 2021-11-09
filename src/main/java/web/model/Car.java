package web.model;

public class Car {
    private String name;
    private String color;
    private Integer series;

    public Car() {
    }

    public Car(String name, String color, Integer series) {
        this.name = name;
        this.color = color;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", series=" + series +
                '}';
    }
}
