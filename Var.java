public class Var {
    //	 byte>short>int>long>float>double
//            char          8      4       8

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("변수의 개요 및 선언, 작성법");
        /*
         * 변수(Variable)->메모리(Ram)상에 문자,숫자,논리적인 값을
         * 						저장할 공간을 만들어 준다.(ex 그릇,box)
         * 형식)자바스크립트=var 변수명=값(자료형 표시X)
         * 형식)자바=자료형(데이터형=type) 변수명=값
         */
        //var age;
        int age; // 정수값 변수 선언(공간은 만들어졌는데 아직 저장x)
        age=25;
        // int age=25; 변수를 선언하면서 동시에 값을 25 저장
        System.out.println("나이는 " + age + "세입니다");// + 결합
        int $test; //int #test(X) _,$ 만 가능
        byte b=23; //byte= -128~127까지 가능 type mismatch(자료형이 다르다)
        short c=12; // -32768~32767
        int sum = b+c; // 23+12=35 (byte,short형으로 저장X(형변환때문))
        System.out.println("sum->" + sum);
        //out of range(저장 범위를 벗어난 경우)
        long no=1234567890000L; // long형으로 저장하기 위해선 숫자 뒤에 L or l
        System.out.println("no->" + no);
    }
}
