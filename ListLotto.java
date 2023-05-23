import java.util.*;
public class ListLotto extends Object{
    Integer bonus; // 숫자 객체 int(x)
    List<Integer> lotto=new ArrayList<>();
    //자식클래스의 객체를 통해서 인터페이스 객체를 얻어올 수 있다.

    //6개의 숫자를 랜덤 출력
    public void setup(){
        /*
        1.Math.random() -> 난수를 만들어주는 메서드 -> 중복된 숫자가 자주나옴
         */
        Random random=new Random();
        while(bonus==null) {//보너스 번호가 설정이 안됨
            int num=random.nextInt(45)+1;
            //번호를 하나 뽑아낼때마다 lotto배열의 내용을 비교
            if(!lotto.contains(num)){//중복된 숫자가 아니라면
                if(lotto.size()<6) {
                    lotto.add(num); // 뽑은 숫자를 lotto배열에 저장
                }else {//lotto.size()>=6
                    bonus=num; // 6개가 다 차고 중복되지 않으면 나머지 보너스
                }//else
            }//outer if
        }//while
        Collections.sort(lotto);//랜덤으로 뽑은 숫자를 오름차순 정렬
        System.out.println(lotto.size());
    }
    @Override
    public String toString() {
        return "당첨번호"+lotto+", 보너스 번호"+bonus;
    }

    public static void main(String[] args) {
        ListLotto lotto=new ListLotto();
        lotto.setup(); //6개의 번호를 구함
        System.out.println(lotto);
    }
}
