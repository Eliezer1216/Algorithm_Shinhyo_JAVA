//Fastcampus java 강의 실습 문제
//작성일 : 2023년 6월 27일 오후 5시 10분
//작성자 : 신효민 충북대학교 소프트웨어학과
//문제
/*
chapter-02-14. 버스 타고 학교가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
버스와 지하철을 타는 예제 프로그래밍

James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
 */
package java_practice.problem1;

import java_practice.problem1.Bus;
import java_practice.problem1.Person;
import java_practice.problem1.Subway;

public class Problem1_Test {
    public static void main(String[] args) {
        Person person1=new Person("James",5000);
        Person person2=new Person("Tomas",10000);

        Bus bus=new Bus(100,1000);
        Subway subway=new Subway("초록색",1200);

        int result=person1.ride(bus.getBusprice());
        int result2=person2.ride(subway.getSubway_price());

        System.out.println("James의 잔액은 "+result+"입니다");
        System.out.println("Tomas의 잔액은 "+result2+"입니다");
    }
}
