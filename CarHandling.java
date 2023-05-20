public class CarHandling {
    public static void main(String[] args) {
        // 1. 객체생성->객체(저장할대상자)를 저장할 수 있는 공간을 만든다
        //형식) 설계도 이름(=클래스이름) 객체명(=변수)=new class명()
        int age; // 4byte 기억공간 생성
        //Car morning; // 객체 선언->기억공간 생성x(예약상태)
        Car morning=new Car(); // 공간 생성
        Car sonata=new Car(); // 빈공간->임대중
        //객체는 4byte기억공간
        //morning의 id값->Car@4554617c
        System.out.println("morning ->" + morning);
        System.out.println("sonata ->" + sonata);
        //2.객체명(저장된 위치).멤버변수명=값(저장)
        morning.name="모닝";
        morning.output=1000;
        morning.color="blue";
        morning.year=2023;

        //3. 운전->메서드 호출-> 기능작동(리모콘의 버튼 클릭)
        morning.startEnginee(); //객체명.호출할 메더스명() or (~)
        morning.speedUp(150); // speedUp메서드를 호출하면서 150값 전달
        morning.speedDown(30); // 150-30=120
        //객체명(저장된 위치).멤버변수
        System.out.println("차의 이름" + morning.name);
        System.out.println("차의 배기량 ->" + morning.output);
        //ㅈ자주 사용되고 반복적인 코드->메서드를 만들어서 호출
        // -> 코드의 재사용성,코드량이 줄어든다.(개발시간이 단축) -> 프로그램의 안정화
        sonata.name="소나타";

        morning.carInfoPrint();
        sonata.carInfoPrint(); // 같은 메서드라도 저장되는 위치가 다름
    }
}
