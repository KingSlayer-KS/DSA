package Sorting_types;

public class Selection_sort {
    private static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };

        //Selection_sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }                
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            
        }


        // Time_complixety_of_Selection_sort_is -> O(n^2)
        PrintArray(arr);
    }

}
