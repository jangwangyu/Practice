package toy;
import java.util.ArrayList;
import java.util.List;
public class MemoryMemberServiceImpl implements MemberService{
    private static List<MemberVO> memberList;
    public MemoryMemberServiceImpl(){
        memberList = new ArrayList<>();
    }
    public static List<MemberVO> getMemberList(){
        return memberList;
    }

    //정보조회
    @Override
    public boolean memberSearch(String id) {
        List<MemberVO> list = getMemberList();
        for (MemberVO member : list) {
            if(member.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    //회원가입
    @Override
    public void memberInsert(MemberVO vo) {
        System.out.println("MemberServiceImpl.memberInsert");
        List<MemberVO> list = getMemberList();
        list.add(vo);
    }

    @Override
    public MemberVO memberRead(String id) {
        System.out.println("MemberServiceImpl.memberRead");
        List<MemberVO> list = getMemberList();
        MemberVO result = new MemberVO();
        for(MemberVO member : list){
            if(member.getId().equals(id)){
                result.setId(member.getId())
                        .setPw(member.getPw())
                        .setName(member.getName())
                        .setEmail(member.getEmail())
                        .setRegisterDate(member.getRegisterDate());
                break;
            }
        }
        return result;
    }

    //회원정보 수정
    @Override
    public void memberUpdate(MemberVO vo) {
        System.out.println("MemberServiceImpl.memberUpdate");
        List<MemberVO> list = getMemberList();
        MemberVO result = null;
        for (MemberVO member : list){
            if(member.getId().equals(vo.getId())){
                result.setPw(member.getPw())
                        .setName(member.getName())
                        .setEmail(member.getEmail());
                break;
            }
        }
    }
    //회원정보 삭제
    @Override
    public boolean memberDelete(String id) {
        System.out.println("MemberServiceImpl.memberDelete");
        List<MemberVO> list= getMemberList();
        for(MemberVO member : list){
            if(member.getId().equals(id)){
                list.remove(member);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<MemberVO> memberAll() {
        System.out.println("MemberServiceImpl.memberAll");
        return getMemberList();
    }


}
