package java_practice.problem1;

public class Person {
    private int money;
    private String name;
    public Person(String name,int money)
    {
        this.name=name;
        this.money=money;
    }
    public int ride(int num)
    {
        if(money>=num)
        {
            money=money-num;
            return money;
        }
        else
        {
            return money;
        }
    }
}
