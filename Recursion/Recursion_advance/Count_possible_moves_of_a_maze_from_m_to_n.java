package Recursion.Recursion_advance;

/* 
concider the it as a matrix

we are only allow to do either right or down:
right=(i+1,j)
down=(i,j+1),
so if we add all possible rights and down it will obviously return count 
of total paths weher the conditions are met
*/

public class Count_possible_moves_of_a_maze_from_m_to_n {
    public static int count(int i, int j,int m, int n) {
        if (i == m || j==n){
            /*we have reached the end or the indices are bening 
            exceeded from there we do not have any move so return zero*/
            return 0;
        }
        
        if (i >= m-1 && j==n-1){
            /*we have reached the boundry and from the boundry 
            there is only one possible way which we have alredy seen*/
            return 1;
        }
        //for down movement
        int down=count(i+1,j,m,n);

        //for right movement
        int right=count(i,j+1,m,n);

        //total possible paths
        return down+right;

    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(count(0,0,m, n));

    }
}
