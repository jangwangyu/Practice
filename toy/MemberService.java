
package toy;

import java.util.List;

public interface MemberService {
    boolean memberSearch(String id);
    void memberInsert(MemberVO vo);
    MemberVO memberRead(String id);
    void memberUpdate(MemberVO vo);
    boolean memberDelete(String id);
    List<MemberVO> memberAll();//배열
}
