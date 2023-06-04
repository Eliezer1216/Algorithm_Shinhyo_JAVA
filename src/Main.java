//여기는 코드 시험하는 구간

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num;i++)
        {
            String str=scanner.nextLine();
            calculate(str);
        }

    }
    public static void calculate(String str)
    {
        int sum=1;
        int result=0;
        for(int k=0;k<str.length();k++)
        {
            char c=str.charAt(k);
            if(c=='O')
            {
                result=result+sum;
                sum=sum+1;
            }
            else {
                sum=1;
            }
        }


        System.out.println(result);
    }

}



