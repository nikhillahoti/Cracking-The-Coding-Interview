package LinkedList;


// All operations

public class LinkedLst {

	class Node {
		int data;
		Node next;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7,8,9,10, 11,12, 13, 14, 3};
		LinkedLst lst = new LinkedLst();
		Node head = lst.createLinkedList(arr);
		lst.printLinkedList(head);		
		//head = lst.reverseLinkedList(head);
		//lst.printLinkedList(head);
		
		lst.makeCircularLinkedList(head, 3);
		lst.printForCount(head, arr.length );
		
		int repeated = lst.CircularLinkedList(head);
		System.out.println("\n\nThe Repeated Element is " + repeated);
	}
	
	public void printForCount(Node head, int count) {
		Node temp = head;
		System.out.println("Circular Linked List data");
		while(count > 0) {
			System.out.print(temp.data + "\t");
			count--;
			temp = temp.next;
		}
	}
	
	public void makeCircularLinkedList(Node head, int target) {
		Node targetNode = null;
		Node temp = head;
		
		while(temp.next != null) {
			if(temp.data == target) {
				targetNode = temp;
			}
			temp = temp.next;
		}
		temp.next = targetNode;
	}
	
	public int CircularLinkedList(Node head) {
		if(head.next == null) return -1;
		
		Node slowRunner = head.next.next;
		Node fastRunner = head.next.next.next.next.next.next;
		
		while(true) {
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;
			
			if(slowRunner == fastRunner) {
				slowRunner = slowRunner.next;
				fastRunner = fastRunner.next.next.next;	
			}
			
			if(slowRunner.data == fastRunner.data) break;
		}
		return slowRunner.data;
	}
	
	public Node reverseLinkedList(Node head){
		if(head.next == null) return head;

		Node ptr1 = head;
		Node ptr2 = head.next;
		ptr1.next = null;
		
		while(ptr2 != null){
			Node temp = ptr2.next;
			ptr2.next = ptr1;
			ptr1 = ptr2;
			ptr2 = temp;
		}
		return ptr1;			
	}	
	
	
	public Node createLinkedList(int arr[]) {
		
		if(arr.length < 1) return null;
		
		Node head = null, last = null, temp;
		
		for (int i = 0 ; i < arr.length ; i++) {
			temp = new Node();
			temp.data = arr[i];
			temp.next = null;
					
			if(head == null) {
				head = temp;
				last = temp;
			}
			else {
				last.next = temp;
				last = temp;
			}
		}
		return head;
	}
	
	public void printLinkedList(Node head) {
		System.out.println("Linked List data --> ");
		while(head != null) {
			System.out.println(head.data + "\t");
			head = head.next;
		}
	}
	
}

