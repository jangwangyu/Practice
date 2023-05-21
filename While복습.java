import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
반복문 -> 특정조건에 따라서 반복해서 실행이 되는 문장 -> 반복해서 사용 문장
1. 반복할 횟수가 정해져 있는경우 -> for(O), while(X)
2. 반복할 횟수가 정해져 있지 않는 경우-> for(X), while(O) (입출력 프로그램)
                                    파일을 불러오는 경우 (파일의 내용(X)
 */
public class While복습 {
    public static void main(String[] args) {
        // 단순하고 반복적인 문장 (1) 반복할 횟수 (2) 반복해서 수행할 문장
       /* System.out.println("while 연습1"); // 1-> 시작
        System.out.println("while 연습1");
        System.out.println("while 연습1");
        System.out.println("while 연습1");
        System.out.println("while 연습1"); // 종료*/

        // (2) 무한루프 -> 끝도 없이 계속 수행이 되는 문장들 -> 강제종료
        int i=1;
       /* while(true) {
            System.out.println("while의 값은 5");
            i++;
            if(i==1){
                break;
            }
        }*/

     /*   while (i <= 5) { // 조건이 거짓이 될 때까지 반복
            System.out.println(" while 연습" + i);
            i++; // i= i+1
        } // while 구문*/
        do{
            System.out.println("while 구문 연습" + i);
            i++;
        }while(i <= 5);
        System.out.println("종료");
    }
}
