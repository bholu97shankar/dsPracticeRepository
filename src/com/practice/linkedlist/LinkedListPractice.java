package com.practice.linkedlist;

public class LinkedListPractice<T> {
	ListNode<?> head;
	int length = 0;

	static class ListNode<T> {
		ListNode<?> next;
		Object data;

		public ListNode(Object data) {
			this.data = data;
		}

		public ListNode<?> getNext() {
			return next;
		}

		public void setNext(ListNode<?> next) {
			this.next = next;
		}

	}

	public static void main(String[] args) {
		LinkedListPractice<String> list = new LinkedListPractice<String>();
		System.out.println("Size of linked list is :" + list.size()+" and list is: "+list.toString());
		
		list.insert(list, "10");
		list.insert(list, "20");
		list.insert(list, "Bhola");
		list.insert(list, "Dubey");
		list.insert(list, "Vishluddin");

		System.out.println("Data at 2nd pos = " + list.head.next.next.data);
		list.insertAtPosition(list, "Noob", 2);
		System.out.println("New data at 2nd pos = " + list.head.next.next.data);
		System.out.println("Data at head of list= " + list.head.data);
		// inserting at beginning
		list.insertAtBeginning(list, "Ankur");
		System.out.println("After inserting at beginning data at head of list= " + list.head.data);
		ListNode<?> n = list.head;
		while (n.next != null) {
			n = n.next;

		}
		System.out.println("List data before inserting at end= " + n.data);
		list.insertAtEnd(list, "Saroj");
		list.insertAtPosition(list, "Arshpreet", 12);
		/* list.insert(list, 12004); */
		
		ListNode<?> ln = list.head;
		while (ln.next != null) {
			ln = ln.next;

		}

		System.out.println("List data after inserting at end= " + ln.data);
		System.out.println("Size of linked list is :" + list.size());
		System.out.println("List :- " + list.toString());
	}

	public void insert(LinkedListPractice<?> linkedList, T data) {
		ListNode<?> newNode = new ListNode<T>(data);
		newNode.next = null;

		if (linkedList.head == null) {
			linkedList.head = newNode;
			length++;
		} else {
			ListNode<?> lastNode = linkedList.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
			length++;
		}

	}

	public void insertAtBeginning(LinkedListPractice<?> list, T data) {
		ListNode<?> newNode = new ListNode<T>(data);
		if (list.head == null) {
			newNode = list.head;
			length++;
		} else {
			newNode.next = list.head;
			list.head = newNode;
			length++;
		}
	}

	public void insertAtEnd(LinkedListPractice<?> list, T data) {
		ListNode<?> newNode = new ListNode<T>(data);
		if (list.head == null) {
			newNode = list.head;
			newNode.next = null;
			length++;
		} else {
			ListNode<?> lastNode = list.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}

			lastNode.next = newNode;
			length++;

		}
	}

	public void insertAtPosition(LinkedListPractice<?> list, T data, int position) {
		ListNode<?> newNode = new ListNode<T>(data);
		if (list.head == null) {
			newNode = list.head;
			newNode.next = null;
			length++;
		} else {
			if (position > length) {
				position = length;
				insertionAtPosOperation(list, position, newNode);
			} else if (position == 0) {
				insertAtBeginning(list, data);
			} else {
				insertionAtPosOperation(list, position, newNode);
			}
		}
	}

	private void insertionAtPosOperation(LinkedListPractice<?> list, int position, ListNode<?> newNode) {
		ListNode<?> temp = list.head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
	}

	public String toString() {
		String listOutput = "[";
		if (head == null) {
			listOutput = listOutput + "]";
			return listOutput;
		} else {
			listOutput = listOutput + head.data;
			ListNode<?> temp = head.next;
			while (temp != null) {
				listOutput = listOutput + "," + temp.data;
				temp = temp.next;
			}
			return listOutput + "]";
		}
	}
	
	public int size()
	{
		int size =0;
		if(head ==null) {
			size =0;
			return size;
		}
		else {
			size=1;
			ListNode<?> tempNode = head;
			while(tempNode.next !=null) {
				tempNode=tempNode.next;
				size++;
			}
			return size;
		}
	}
}
