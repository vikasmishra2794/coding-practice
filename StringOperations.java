public class StringOperations {    
    public static String solve(String A) {
        A = A.replaceAll("[a,e,i,o,u]", "#");
        A = A.replaceAll("[A-Z]", "");
        return A;
    }
    public static void main(String[] args) {
        System.out.println(solve("Hello"));
    }
    
}
