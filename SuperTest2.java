//super 키워드(부모클래스의 객체를 가리키는 예약어) <-> this 키워드(자식 클래스의 객체를 가리키는 예약어)
class Person{
    String name; // null
    int age=20;

    void print() {
        System.out.println("Person 메서드(name) ->" + name);
    }

}
//기능을 물려받는다.(상속)
class Man extends Person{
    //상속을 받은 멤버변수와 이름이 같은 변수를 자식 클래스에 또 선언이 가능함
    int age=40;
    //public Man() {} 없으면 자동 생성
    /*
       String name; // null
    int age=20;

    void print() {
        System.out.println("Person 메서드(name) ->" + name);
    }
    자식 클래스에 부모와 동일한 멤버변수가 있다면 어떻게 구분?
    1. super.멤버변수, 2. super.부모의 메서드를 호출
     */
    void print() { // 오버라이딩 (자식에게 맞게 내용을 수정)
        System.out.println("자식 클래스의 age ->" + age);// 40
        System.out.println("부모 클래스의 super.age ->" + super.age); // 20
        // System.out.println("Person 메서드(name) ->" + name);
        super.print();
    }
}
public class SuperTest2 {
    public static void main(String[] args) {
        Man m=new Man();
        m.name="홍길동";
        m.print();
    }
}
