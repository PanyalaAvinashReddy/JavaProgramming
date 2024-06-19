class sumofarray{
	public static void main(String[] args){
		int[] num = {1,3,5,7};
		
		int sum = 0;
		
		for(int i=0; i <num.length; i++){
			
			sum = sum + num[i];
		}
		System.out.println(sum);
		// to find the average of the arrays
		int avg = sum/num.length;
		System.out.println(avg);
	}
}