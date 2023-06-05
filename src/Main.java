//여기는 코드 시험하는 구간

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String trimstr=str.trim();
        if(trimstr.isEmpty()==false)
        {
            String[] result = trimstr.split(" ");
            System.out.println(result.length);
        }
        else {
            System.out.println(0);
        }
    }

}



