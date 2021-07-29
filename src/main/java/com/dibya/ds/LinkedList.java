package com.dibya.ds;// Java program to get intersection point of two linked list

class LinkedList {

	static Node head1, head2,head3;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/*function to get the intersection point of two linked
	lists head1 and head2 */
	int getNode()
	{
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return _getIntesectionNode(d, head1, head2);
		}
		else {
			d = c2 - c1;
			return _getIntesectionNode(d, head2, head1);
		}
	}

	/* function to get the intersection point of two linked
	lists head1 and head2 where head1 has d more nodes than
	head2 */
	int _getIntesectionNode(int d, Node node1, Node node2)
	{
		int i;
		Node current1 = node1;
		Node current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current2;
			current2 = current2.next;
		}

		return -1;
	}

	/*Takes head pointer of the linked list and
	returns the count of nodes in the list */
	int getCount(Node node)
	{
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		// creating first linked list
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		// creating second linked list
		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);

//		System.out.println("The node of intersection is " + list.getNode());

		Node rev = list.reverseList(head2);
		while (rev !=null){
			System.out.println(rev.data);
			 rev =rev.next;
		}

		list.head3 = new Node(3);
		list.head3.next = new Node(6);
		list.head3.next.next = new Node(9);
		list.head3.next.next.next = new Node(6);
		list.head3.next.next.next.next = new Node(3);
		boolean isPalindrome = list.isPalindrome(head3);
		if(isPalindrome)
			System.out.println("List is palindrome");
	}

	public boolean isPalindrome(Node head){
		if(head ==null || head.next ==null){
			return  true;
		}
		Node slow =head;
		Node fast = head;

		//Find middle element of linked list
		while (fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		//Reverse the right half
		slow.next = reverseList(slow.next);

		//move slow to right half
		slow = slow.next;

		//compare both halfs
		while (slow != null){
			if(head.data != slow.data){
				return false;
			}
			head = head.next;
			slow = slow.next;
		}

		return true;
	}

	private Node reverseList(Node head) {
		Node prev = null;
		Node next = null;
		while (head!=null){
			next = head.next;
			head.next = prev;
			prev = head;
			head=next;
		}
		return prev;
	}
}

// This code has been contributed by Mayank Jaiswal
