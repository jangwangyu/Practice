public class Change_String{
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replaceAll(":","#");
        System.out.println(b);
    }
}
