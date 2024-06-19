class sorting{
	public static void main(String[] args){
		int[] num = {10,8,6,5,3,2,1,80};
		
		for(int i=0; i<num.length; i++){
			for(int j=i+1; j<num.length; j++){
			if(num[i]>num[j]){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
			}
			System.out.println(num[i]);
		}
	}
}