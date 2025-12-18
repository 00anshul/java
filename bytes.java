public class bytes {
    public static void main(String[] args) {
        byte a = 10;   // valid
        byte b = 20;   // valid
        // byte c = 200; // ❌ Error: out of range (-128 to 127)
int sum = a+b;
        System.out.println(sum);
    }
}