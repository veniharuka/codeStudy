import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++)
			arr[i] = scan.nextInt();
		
		int count = 1;		// 오른쪽에서 보이는 갯수
		int maxHeight = arr[arr.length-1];	// 가장 높은 막대기의 높이
	
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i] > maxHeight) {
				count ++;
				maxHeight = arr[i];
			}
		}
		
		System.out.println(count);
		scan.close();
	}

}