public class primePractice {

    public static boolean isPrime(int n){
        //1이나 우수이면 소수가 아니다
        if((n & 1) == 0 || n == 1){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int[] arr = {1, 2, 3, 12, 5, 6, 7, 9, 10};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 || isPrime(arr[i])){
                System.out.println( arr[i] + ": Prime");
            }else{
                System.out.println(arr[i] + ": Not Prime");
            }
        }
    }
}
