public class SuperTest {
    public static void main(String[] args) {
        C c=new C("홍길동"); // 객체C를 생성하면서 문자열처리 생성자 호출(1)
    }
}
// A
// 자바의 모든 클래스는 기본적으로 object 클래스의 자식임(상속받음)
//shift+f12 (API 문서)
class A extends Object{
    public A(){
        super(); // (4)
        System.out.println("A 생성자 호출"); // (5)
    }
}
//B//class B extends Object
class B extends  A{
    public B() {
        super();
        System.out.println("B 생성자 호출");
    }
    // 추가(인수가 있는 생성자를 호출하는 경우에는 부모 클래스에 반드시 (인수=매개변수)
    // 인수에 따라 처리해주는 생성자가 반드시 있어야 호출이 가능함
    public B(String s){// (3)
        System.out.println(s); // (6) 홍길동
    }
}
class C extends B{ // 상속관계
    public C(){
        System.out.println("C 생성자 호출");
    }
    public C(String s){
        super(s); // (2) 부모클래스의 기본 생성자 호출
        System.out.println(s); // (7) 홍길동
    }

}
