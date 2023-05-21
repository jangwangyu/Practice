import java.util.Scanner;

public class StringTEst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("문자열을 입력");//next()(단어),nextLine
        String input=sc.nextLine(); // hello
       // System.out.println("input -> " + input);
        stringPrint(input);
        sc.close();
    }
    //매개변수O 반환값X
    public static void stringPrint(String s) {//hello
        // 1. concat -> 문자열 결합
        System.out.println("s.concat('test')->" + s.concat("test"));
        //2.substring(시작 인덱스 번호(0), 종료 인덱스 -1 (바로 앞 번호까지)
        System.out.println("s.substring(1,4) ->" + s.substring(1,4));
        //3. 시작 인덱스 번호부터 문자열끝까지 출력
        System.out.println("s.substring(1) ->" + s.substring(1));
        // 4. toUpperCase(대문자로 변환) <->toLowerCase() 소문자로 변경
        System.out.println("s.toUpperCase ->" + s.toUpperCase());
        System.out.println("s.toLowerCase ->" + s.toLowerCase());
        // 5, 특정 문자열을 벼경 -> replace(변경 전 단어, 변경 후 단어)
        System.out.println("s.replace('l','t')->" + s.replace("l","t"));
        // 6. 문자열의 길이 -> length(), 배열의 길이 -> 배열명.length(메서드x)
        System.out.println("s.length() ->" + s.length());
        // 7. 문자열 중에서 특정 위치에 있는 문자 출력 -> charAt(인덱스 번호)
        System.out.println("s.charAt(2)->"+s.charAt(2));
        // 8. 특정 문자 몇번째 인덱스 번호에 위치 indexOf('문자')->인덱스번호
        // 못찾으면 -1을 리턴
        System.out.println("s.indexOf('l)->" + s.indexOf("l"));
        //9. 뒤에서 찾는 경우 lastIndexOf(확장자를 찾을때)
        // 인덱스 번호는 앞에서 0부터 계산) -> 3번째 위치의 l
        System.out.println("s.lastIndexOf('l')->" + s.lastIndexOf('l'));
        //10.공백제거->trim()->"abcd     "->"abcd->공백도 문자열 길이 포함
        System.out.println("s.trim().length()->" + s.trim().length());

         }
}
