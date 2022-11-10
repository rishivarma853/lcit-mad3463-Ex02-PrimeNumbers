import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("2");
        for(int i = 3;i<100;i+=2) if(checkPrime(i)) System.out.println(i);
    }
    static boolean checkPrime(int num) {
        for(int i=3;i<=Math.sqrt(num);i++) if(num%i==0) return false;
        return true;
    }
}