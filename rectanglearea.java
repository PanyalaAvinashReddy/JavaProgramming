import java.util.Scanner;
class rectanglearea{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("length = ");
		int length = sc.nextInt();
		System.out.print("breadth = ");
		int breadth = sc.nextInt();
		
		
		int area = length*breadth;
		System.out.println("area of rectangle is : " + area);
	}
}	