class sumofn{
	public static void main(String[] args){
		int n = 10;
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println("\n"+sum);
	}
}