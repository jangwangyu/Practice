import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//신입 사원에 대한 정보를 저장할 목적(추상화)
public class Employee {
    // 1. 멤버변수
    String name;
    int age;
    String gender;
    String addr;
    long salary;

    // Source -> generate getter and setter
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
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    // 2. 생성자 오버로딩 -> generate constructor using fields를 이용
    public Employee(){}
    public Employee(String name, int age, String gender, String addr,long salary){
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addr = addr;
        this.salary = salary;
    }
    //보너스를 구해주는 메서드 -> 급여 * 1.5, Manager * 3.0
    double bonus(){
        return salary*1.5;
    }

    //3. 멤버변수의 값 출력
    // 하나의 클래스 내부에서 일반메서드-> 다른 일반 메서드를 호출(객체명.일반메서드명(~)
    void display(){
        System.out.println("------직원의 정보------");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("주소: " + addr);
        System.out.println("급여: " + salary);
        System.out.println("보너스: " + bonus());

    }
}
