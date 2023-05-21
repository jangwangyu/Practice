public abstract class Shape {

    //원의 면적을 구해서 출력 시켜주는 역할(=추상클래스) 설계+메서드 제공
    //직사각형,원(소수점),삼각형
    public double res = 0.0; //모든 도형에서 공통으로 사용할 변수(면적)
    //원
    public abstract double area(int r); // 추상 메서드

    //직사각형
    // public abstract int area(int x, int y);

    //공통의 기능을 일반 메서드 -> 상속 받아서 바로 사용
    public void printArea(){
        System.out.println("도형의 면적은 " + res + "입니다.");
    }
}
