class evennum{
	public static void main(String[] args){
		System.out.print("EvenNumbers are : ");
		for(int i = 0; i<=50; i++){
			if(i%2==0){
				System.out.print(i + " ");
			}
		}
		System.out.print("\n"+"OddNumbers are : ");
		for(int i=0; i <= 50; i++){
			if(i%2 != 0){
				System.out.print(i+" ");
			}
		}
	}
}