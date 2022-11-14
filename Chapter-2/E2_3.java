public class E2_3 {
    public static void main(String[] args) {
        String s="Mississippi";
        System.out.println("Length = "+s.length());
        s=s.replace("i","ii");
        System.out.println("Length = "+s.length());
        String s1 = s.replace("ss","s");
        System.out.println("Length = "+s1.length());
    }
}
