class smallestandlargest {
	static void ele(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("the smallest element is : " + min);
	}

	public static void main(String[] args) {
		int[] arr = {10, 40, 89, 90, 110, 202, 30000, 543, 65, -2};
		ele(arr);

//		int small = arr[0];
//		int large = arr[0];
//
//		for(int i=1; i < arr.length; i++){
//			if(arr[i] > large){
//				large = arr[i];
//			}
//			if(arr[i] < small){
//				small = arr[0];
//			}
//		}
//
//		System.out.println("largest element : " + large);
//		System.out.println("smallest element : " + small);
	}
}