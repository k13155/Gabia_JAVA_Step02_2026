package chapter12.clone;

public class AA_ArrayCloneMain_01 {

	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2;
		int[] arr3;
		
		arr2 = arr1.clone(); //clone은 해시(hash), 배열을 조건 없이 clone 가능하다.
		arr3 = arr1;
		
		System.out.println("복사된 arr3 배열");
		for(int num : arr3) 
			System.out.print(num + " ");
		
		System.out.println();
		
		System.out.println("변경된 arr3 배열");
		arr3[2] = 7;
		for(int num : arr3)
			System.out.print(num + " ");
		
		System.out.println();
		
		System.out.println("변경 후 arr1 배열");
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		System.out.println("복사된 arr2 배열");
		for(int num : arr2) 
			System.out.print(num + " ");
		
		System.out.println();

		arr2[3] =0;
		System.out.println("변경 후 arr1 배열"); // arr2에서
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("복사된 arr2 배열");
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();

	}

}
