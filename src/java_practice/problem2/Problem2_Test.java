//Fastcampus java 강의 실습 문제
//작성일 : 2023년 6월 27일 오후 5시 37분
//작성자 : 신효민 충북대학교 소프트웨어학과
//문제
/*
chapter-02-15. 복습해봅시다 (객체 협력)
다음과 같은 상황을 구현해봅시다.
Edward는 지각을 해서 택시를 타야 했습니다.
20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
택시는 '잘나간다 운수' 회사 택시를 탔습니다.

출력 화면 :
Edward님의 남은 돈은 10000원입니다.
"잘 나간다 운수" 회사의 택시 수입은 10000원입니다.
 */
package java_practice.problem2;

public class Problem2_Test {
    public static void main(String[] args) {
        Person person=new Person("Edwards",20000);
        Taxi taxi=new Taxi("잘 나간다 운수");
        person.take_taxi(taxi,10000);
        person.showPersoninfo();
        taxi.showTaxiinfo();
    }

}
