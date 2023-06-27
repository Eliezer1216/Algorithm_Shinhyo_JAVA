package java_practice.problem2;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money)
    {
        this.name=name;
        this.money=money;
    }

    public void take_taxi(Taxi taxi,int num) {
        if(money>=num)
        {
            money=money-num;
            taxi.make_benefit(num);
        }
        else
        {
            System.out.println("결제가 불가능합니다");
        }
    }
    public void showPersoninfo()
    {
        System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
    }
}
