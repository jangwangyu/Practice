import java.util.Scanner;
public class ThreeTest {
    public static void main(String[] args) {
        Scanner sc=getScan();
        ThreeTest.setScan(sc);
    }
    // 1.객체의 자료형(Scanner) getXXX(){return 반환시킬 객체명(익명객체);}
    public static  Scanner getScan(){
        return new Scanner(System.in);
    }
    // 2. public void setXXX(전달받을 객체 자료형 객체명(=임시){처리구문}
    public static void setScan(Scanner sc){
        System.out.println("첫번째");
        int a=sc.nextInt();

        System.out.println("두번째");
        int b=sc.nextInt();

        System.out.println("세번째");
        int c=sc.nextInt();

        int max;

        ThreeTest ss=new ThreeTest();
        ss.getMaxPrint(a,b,c);

    }
    void getMaxPrint(int a,int b,int c) {
        int max = (a > b) ? a : b;
        max = (max > c)?max:c;
        System.out.println("max="+max);
    }

}
