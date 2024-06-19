class primenum{
	public static void main(String[] args){
		int num = 7;
		boolean tag = false;
		for(int i = 2; i<num/2; i++){
			if(num%i==0){
				tag = true;
				break;
			}
		}
		if(!tag){
			System.out.println("Prime Number");
		}else{
			System.out.println("not prime number");
		}	
	}
}