package com.practice.linkedlist;

public class LinkedListPractice {
ListNode head;
int length =0;
	class ListNode{
		ListNode next;
		Object data;
		
		public ListNode(Object data) {
			this.data = data;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}
		
		
	}
	public static void main(String [] args) {
		LinkedListPractice list = new LinkedListPractice();
		list.insert(list,10);
		list.insert(list, 20);
		list.insert(list,30);
		list.insert(list,40);
		list.insert(list,100);
		System.out.println("Data at 2nd pos = "+list.head.next.next.data);
		list.insertAtPosition(list, 1000, 2);
		System.out.println("New data at 2nd pos = "+list.head.next.next.data);
        System.out.println("Data at head of list= " +list.head.data);
		//inserting at beginning
		list.insertAtBeginning(list, 120);
		System.out.println("After inserting at beginning data at head of list= "+list.head.data);
		ListNode n = list.head;
		while(n.next != null) {
			n=n.next;
			
		}
		System.out.println("List data before inserting at end= "+n.data);
	    list.insertAtEnd(list,180);
	    list.insertAtPosition(list, 1002,12);
	    list.insert(list, 12004);
	    list.insert(list, "Dubchodi");
	    ListNode ln = list.head;
	    while(ln.next != null) {
	    	ln=ln.next;
			
		}
	   
	    System.out.println("List data after inserting at end= "+ln.data);
        System.out.println("Size of linked list is :"+list.length);
        System.out.println("List :- "+list.toString());
	}
	
	public void insert(LinkedListPractice linkedList,Object data) {
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		
		if(linkedList.head == null) {
			linkedList.head = newNode;
			length++;
		}
		else {
			ListNode lastNode = linkedList.head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
			length++;
		}
		
	}
	
	public void insertAtBeginning(LinkedListPractice list,Object data) {
		ListNode newNode = new ListNode(data);
		if(list.head == null) {
			newNode = list.head;
			length++;
		}
		else {
			newNode.next =list.head;
			list.head = newNode;
			length++;
		}
	}
	
	public void insertAtEnd(LinkedListPractice list,Object data) {
		ListNode newNode = new ListNode(data);
		if(list.head == null) {
			newNode = list.head;
			newNode.next = null;
			length++;
		}
		else {
			ListNode lastNode = list.head;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			
			  lastNode.next= newNode;
			  length++;
		      
		}
	}
	
	public void insertAtPosition(LinkedListPractice list,Object data,int position) {
		ListNode newNode = new ListNode(data);
		if(list.head == null) {
			newNode = list.head;
			newNode.next = null;
			length++;
		}
		else {
			if(position > length) {
				position = length;
				insertionAtPosOperation(list, position, newNode);
			}
			else if(position ==0) {
			   insertAtBeginning(list, data);
			}
			else {
			insertionAtPosOperation(list, position, newNode);
			}
		}
	}

	private void insertionAtPosOperation(LinkedListPractice list, int position, ListNode newNode) {
		ListNode temp=list.head;
		for(int i =0 ;i<position-1;i++) {
			temp = temp.next;
		}
		newNode.next =temp.next;
		temp.next = newNode;
		length++;
	}

	public String toString() {
		String listOutput = "[";
		if(head == null) {
			listOutput = listOutput+"]";
			return listOutput;
		}
		else {
			listOutput=listOutput+head.data;
			ListNode temp = head.next;
			while(temp != null) {
				listOutput = listOutput +"," +temp.data;
				temp = temp.next;
			}
			return listOutput+"]";
		}
	}
}
