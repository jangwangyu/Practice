// 부서의 팀장 정보 저장 -> 중복 코딩이 필요함
// 형식) class 자식 클래스명 extends 부모 클래스명
class Manager extends Employee{
    /* 부모한테 물려받은 멤버변수
	String name;
	int age;
	String sung;
	String addr;
	long salary; */
    String department; // 부서명->개발팀
    //객체 배열->객체만 저장이 되는 배열(직원의 정보)
    Employee sub[];//new Employee[3]; 직원만 저장 -- int sub[] -> 정수만 입력(저장)

    public Manager(){}

    public Manager(String name, int age, String gender,
                   long salary, String addr, String department){
        super(name, age, gender, addr, salary); //Employee의 기본 생성자 호출

        /* 1. 중복코딩-> 부모의 생성자가 대신 저장시켜주는 것으로 처리(재사용성)
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
        this.salary = salary;
         */
        this.department = department; // Manager만 들어감
    }
    // 자식 입장에 맞게 내용을 다시 수정 해주는 행위=오버라이딩
    double bonus(){
        return salary*3.0; // Manager의 보너스
    }
}
public class Company {
    public static void main(String[] args){
        Employee e1=new Employee("홍길동",23,"남자","서울시",1500);
        Employee e2=new Employee("김길동",23,"남자","울산 북구",2500);

        //2. 부서배치 (=개발부)
        Manager m1=new Manager("임시테스트",42,"여자",4000,"대구","개발부");

        m1.sub=new Employee[2]; //Employee 데이터 저장 공간
        m1.sub[0]=e1; // 홍길동
        m1.sub[1]=e2; // 김길동

        //부하직원의 정보,팀장 정보 출력
        for(int i=0;i<m1.sub.length;i++){
            System.out.println("직원명 ->" + m1.sub[i].name);
            System.out.println("나이 ->" + m1.sub[i].age);
            System.out.println("--------------");
            m1.sub[i].display();
        }
        //Manager 1명
        m1.display();
    }
}
