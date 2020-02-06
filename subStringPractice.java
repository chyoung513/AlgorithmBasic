import java.util.Scanner;

public class subStringPractice {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i < N; i++){
            String s1 = in.nextLine();
            String s2 = in.nextLine();

            boolean[] alpabetMap = new boolean[26];
            for(char c : s1.toCharArray()){
                alpabetMap[c-'a'] = true;
            }
            for(char c : s2.toCharArray()){
                if(alpabetMap[c-'a']){
                    System.out.println("has substring");
                    break;
                }
            }
        }
    }
}
