public class tryout {
//    static int[] fun(){
//        return new int[][]{1,2,3}{4,5,6};
//    }
    public static void main(String[] args) {
//        int arr1[] = fun();
        int[][] arr = {{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
