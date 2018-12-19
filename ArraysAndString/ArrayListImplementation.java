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
		System.out.println(aLL.get(2555));
	}
}

class MyArrayList {
	public int length = 0;
	int arr[] = new int[16];
	public int capacity = 16;
	
	public int get(int index) {
		if (index >= length) throw new java.lang.RuntimeException("Index out of bounds Exception");
		return arr[index];
	}
	
	public void set(int index, int elem) {
		if (index >= length) throw new java.lang.RuntimeException("Index out of bounds Exception");
		arr[index] = elem;
	}
	
	public boolean IsEmpty() {
		return length == 0 ? true : false;
	}
	
	public int indexOf(int elem) {
		for(int i = 0 ; i < length ; i++) 
			if (arr[i] == elem) return i;
		return -1;
	}
	
	public void remove(int elem) {
		int index = this.indexOf(elem);
		if (index == -1) return;
		
		// Copy for the elements after the element to be removed
		for (int i = index ; i < length ; i++)
			arr[i] = arr[i + 1];
		
		// decrement the size of the array
		length--;
	}
	
	public boolean contains(int elem) {
		for (int i = 0 ; i < length ; i++) 
			if (arr[i] == elem) return true;
		return false;
	}
	
	public void add(int elem) {
		// Check if the array is half filled
		if (length >= (capacity / 2)) {
			arr = Arrays.copyOf(arr, capacity * 2);
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

