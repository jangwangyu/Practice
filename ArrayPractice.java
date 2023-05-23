import java.util.Scanner;
//회원리스트
import java.util.*;
import java.io.Serializable;

//class Person implements Serializable{}
class Person2{//DTO(Data Transfer Object) 데이터 전송객체
    private String name;
    private int age;

    public Person2(){}
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ArrayPractice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("회원이름:");
        String name=sc.next();

        System.out.println("나이:");
        int age=sc.nextInt();

        Person2 p2=new Person2();
        p2.setName(name);
        p2.setAge(age);

        Person2 p3=new Person2();
        p3.setName("홍길동");
        p3.setAge(24);

        Person2 p4=new Person2();
        p4.setName("김길동");
        p4.setAge(42);
        //ArrayList를 이용해서 저장
        ArrayList<Person2> list=new ArrayList<>();
        list.add(p2); list.add(p3); list.add(p4);
        //출력
        ArrayPractice alt =new ArrayPractice(); // 메서드 호출
        alt.setPersonList(list);

    }
    //ArrayList<Person2> 매개변수로 전달받아서 출력->html X->콘솔로 출력
    public void setPersonList(ArrayList<Person2>list){
        /*
        for(int i=0;i<list.size();i++){
        Person st=list.get(i);
        System.out.println("이름->" +st.getName());
        System.out.println("나이->" +st.getAge());

        }*/
        for (Person2 st:list){//for(꺼낸 객체의 자료형 객체명 : 배열또는 컬렉션 객체)
            System.out.println("이름: " + st.getName());
            System.out.println("나이: " + st.getAge());
        }
    }
        //웹에 출력시켜주는 메서드 작성(DB에 저장된 데이터를 찾고 담아서 출력)
        public ArrayList<Person2> getPersonList(){
            //DB에 접속해서 데이터를 가져온다는 전제(JDBC)
            ArrayList<Person2> list2=new ArrayList<>();
            list2.add(new Person2("hong",24)); // 익명객체
            list2.add(new Person2("kim",26));
            list2.add(new Person2("park",28));
            return list2;
    }
}
