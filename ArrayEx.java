public class ArrayEx {
    static int[] reverseArray(int[] a){
        int[] arrReversed = new int[a.length];

        for(int i = 0, j = a.length - 1; i < a.length; i++, j--){
            arrReversed[j] = a[i];
        }
        return arrReversed;
    }
    public static void main(String[] args){
        int[] arr = {1, 4, 3, 2};

        for(int arrItem : arr){
            System.out.println(arrItem);
        }

        int[] result = reverseArray(arr);

        System.out.println(">>> Output of Reverse Array");

        for(int resItem : result){
            System.out.println(resItem);
        }
    }
}
