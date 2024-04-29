
package Vector;

public class evenodd {

	public static void main(String[] args) {

		int arr[]= {1,3,5,2,4,6,11,12,15,16};
		System.out.println("Even numbers");
		for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0){
			System.out.println(arr[i]);
		}
			
		}
		System.out.println("Odd numbers");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0){
				System.out.println(arr[i]);
			}
		}
				

	}

}
