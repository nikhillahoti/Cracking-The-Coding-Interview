package ArraysAndStrings;

import java.util.Arrays;



public class ArrayListImplementation {
	
	public static void main(String[] args) {
		MyArrayList aLL = new MyArrayList();
		aLL.add(1); aLL.add(2); aLL.add(3); aLL.add(4); aLL.add(1); aLL.add(2); aLL.add(3); aLL.add(4);
		aLL.add(11); aLL.add(12); aLL.add(13); aLL.add(14); aLL.add(11); aLL.add(12); aLL.add(13); aLL.add(14);
		aLL.add(21); aLL.add(22); aLL.add(23); aLL.add(24); aLL.add(21); aLL.add(22); aLL.add(23); aLL.add(24);
		aLL.add(21); aLL.add(22); aLL.add(23); aLL.add(24); aLL.add(21); aLL.add(22); aLL.add(23); aLL.add(24);
		//aLL.printArray();
		aLL.printSizes();
	}
}

class MyArrayList {
	public int length = 0;
	int arr[] = new int[16];
	public int capacity = 16;
	
	public int get(int index) {
		if (index >= length) throw new java.lang.Error("Index out of bounds Exception");
		return arr[index];
	}
	
	public void add(int elem) {
		// Check if the array is half filled
		if (length >= (capacity / 2)) {
			System.out.println("Reached Here 1");
			arr = Arrays.copyOf(arr, capacity * 2);
			System.out.println("Reached Here");
			capacity = capacity * 2;
		}
		arr[length++] = elem;
	}
	
	public void printArray() {
		System.out.println("\n Array Elements are --> ");
		for(int i = 0 ; i < length ; i++) {
			System.out.println(arr[i] + "\t");
		}
	}
	
	public void printSizes() {
		System.out.println("The Size of the Array " + length);
		System.out.println("The Capacity of the Array " + capacity);
	}
}

