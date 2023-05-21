import java.util.Scanner;

//자식 클래스명 extends 추상 클래스 implements 인터페이스명
public class ShapeTest extends Shape implements  Drawable{

    // public double res=0.0; printArea() 기능향상
    @Override
    public void draw() {
        System.out.println("원을 그려서 면적을 구함");
    }
    @Override
    public double area(int r){
        //java.lang.Math.PI(정적상수)
        return (r*r*Math.PI);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("원의 반지름 입력");
        int r=sc.nextInt(); //nextDouble(소수점),next() (단어중심)
        ShapeTest st=new ShapeTest();
        st.res=st.area(r);
        st.printArea(); // 저장된 면적을 출력함
    }
}
