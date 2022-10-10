import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[][] arr = new int[a][a];
    for(int i=0; i<arr.length; i++){
     for(int j=0; j<arr.length; j++){
         arr[i][j] = sc.nextInt();

     }
    }
    // System.out.print(Arrays.toString(arr));
     for(int i=0; i<arr.length; i++){
     for(int j=0; j<arr.length; j++){
        System.out.print(arr[j][i]+" ");
     }
     System.out.println();
    }
}
}