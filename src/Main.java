//여기는 코드 시험하는 구간

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int result=1;
       String str;
       List<Integer>list=new ArrayList<>();
       Scanner scanner=new Scanner(System.in);
       for(int i=0;i<3;i++)
       {
           int a;
           a=scanner.nextInt();
           result=result*a;
       }
       str=Integer.toString(result);
       for(int k=0;k<10;k++)
       {
           int count=0;
           char c=Integer.toString(k).charAt(0);
           for(int t=0;t<str.length();t++)
           {
               if(str.charAt(t)==c)
               {
                    count=count+1;
               }
           }
           list.add(count);
       }
       for(int a=0;a<10;a++)
       {
           System.out.println(list.get(a));
       }
    }

}



