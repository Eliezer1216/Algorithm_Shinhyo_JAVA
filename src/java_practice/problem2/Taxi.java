package java_practice.problem2;

public class Taxi {
    private String taxi_company;
    private int benefit;

    public Taxi(String taxi_company)
    {
        this.taxi_company=taxi_company;
    }

    public void make_benefit(int num)
    {
        benefit+=num;
    }
    public void showTaxiinfo()
    {
        System.out.println(taxi_company+"택시 수입은 "+benefit+"원 입니다.");
    }
}
