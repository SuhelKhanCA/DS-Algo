// 2D arrays declarations and initializations
package Lec12;

import java.util.Arrays;

class Example12b{
    public static void main(String args[]){
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        // arr[0] = {1,2}; ====>> Arrays constants can only be used in initializers
        
        /*Initializing value through each random acccess */
        arr[0][0] = 2;
        arr[0][1] = 1;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 11;
        arr[2][1] = 17;
        arr[2][2] = 15;
        arr[2][3] = 13;

        System.out.println("Array is :" + Arrays.toString(arr));    
    }
}