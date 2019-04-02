public class gcdLcmPractice {

    public static int gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a >= b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        return a + b;
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    
    public static void main(String[] args){
        System.out.println("최대공약수 : " + gcd(60, 48));
        System.out.println("최소공배수 : " + lcm(8, 10));
    }
}
