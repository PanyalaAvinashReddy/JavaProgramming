public class patterns {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i<=num ; i++){
            for(int j = 0; j<i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a = 1; a <= num; a++){
            for(int b = 0;b<a;b++){
                System.out.print(b+1);
            }
            System.out.println();
        }

        for(int i = num; i > 0 ;i--){
            for(int j=0; j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        for(int i=num; i>0;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
