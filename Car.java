/*
추상화 -> 새롭게 저장할 대상자를 저장할 목적으로 만들어진 설계도

 */
public class Car { // ex)자동차
    //1.객체(Car)->저장하고 싶은 대상자(공통점)
    // 1. 멤버변수 -> 클래스 내부에서 선언된 변수 -> 초기값이 설정(?가지 기본 자료형)
    String name; // 차의 이름(명사) 입력 안하면 : null
    int output; // 배기량 입력 X:0
    int year; // 연식
    String color; // 차의 색깔 null
    int current_speed; //차의 속도
    boolean sidong; // 차의 시동 유무

    // 2.공통기능(=움직임)->메서드구현(함수)->요구분석
    // 1) 시동걸기(단순,반복)-> 매개변수x 반환값x
    void startEnginee(){
        sidong=true;
        System.out.println("시동걸림");
    }

    //2) 차의 주차기능(단순 반복)
    void stop(){
        sidong=false;
        current_speed=0; // 현재 속도 0
        System.out.println("정상주차완료");
    }
    //데이터를 입력-> 저장,계산,출력
    // 3) 속도 증가 -> 매개변수는 다른 메서드에서 똑같이 사용 가능(지역변수때문)
    void speedUp(int speed){
        current_speed+=speed; //current_speed=current_speed+speed
        System.out.println(speed+"km만큼 속도 증가");
    }
    // 4)속도 감소
    void speedDown(int speed){
        current_speed-=speed;
        System.out.println(speed+"km만큼 속도 감소");
    }
    // 5) 차의 정보 출력(단순 반복)
    void carInfoPrint(){ //function carInfoPrint(){}
        System.out.println("--차의 정보 출력--");
        System.out.println("차의 시동 유무" + sidong);
        System.out.println("차의 이름" + name);
        System.out.println("차의 배기량" + output);
        System.out.println("차의 연식" + year);
        System.out.println("차의 색깔" + color);
        System.out.println("차의 현재속도" + current_speed);

    }
}
