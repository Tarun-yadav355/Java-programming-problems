public class tut44class {
    public static void main(String[] args) {
        String a = "Mera naam h lakhan";

        int n = a.length();
        int m =a.replaceAll("a", "").length();

        int total = n-m;
        System.out.println("Total is "+total);
    }
}
