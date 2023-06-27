package java_practice.problem1;

public class Subway {
    private String subway_color;
    private int subway_price;

    public Subway(String subway_color,int subway_price)
    {
        this.subway_color=subway_color;
        this.subway_price=subway_price;
    }

    public int getSubway_price() {
        return subway_price;
    }
}
