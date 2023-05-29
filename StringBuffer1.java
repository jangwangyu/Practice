public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer(); // StringBuffer의 객체 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        String result1="";
        result1 += "hello";
        result1 += " ";
        result1 += "jump to java";
        System.out.println(result1);

        StringBuilder st=new StringBuilder();
        st.append("hello");
        st.append(" ");
        st.append("jump to java");
        String result2=st.toString();
        System.out.println(result2);

        StringBuffer sr=new StringBuffer();
        sr.append("jump to java");
        sr.insert(0,"hello ");
        System.out.println(sr.toString());

        StringBuffer sf=new StringBuffer();
        sf.append("Hello jump to java");
        System.out.println(sf.substring(0, 4));


    }
}
