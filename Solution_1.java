import java.util.Arrays;

class Solution_1 {
    public static void PrintArray(int[] cum) {
        Arrays.sort(cum);
        for (int i = 0; i < cum.length; i++) {
            System.out.print(cum[i] + " ");
        }
    }
    
    public static void squaring(int[] zum,int i) {
        
        while (i == zum.length) {
            PrintArray(zum);
            return;
        }
        zum[i] = (int) Math.pow(zum[i], 2);
        i++;
        squaring(zum,i);

        
        
        

    }

    public void sortedSquares(int[] nums) {
        squaring(nums,0);
      

    }
}