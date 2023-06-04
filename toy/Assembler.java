package toy;

public class Assembler {
    public MemberService getMemberService(){
        return new MemoryMemberServiceImpl();
    }
}
