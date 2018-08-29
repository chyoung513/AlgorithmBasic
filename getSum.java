public class MyClass {
    public static void main(String args[]) {
        int sum = 0;
        
        for(int i = 1 ; i <= 10 ; i++){
            sum = i + sum;
        }

        System.out.println("Sum of 1 to 10 = " + sum);
    }
}
