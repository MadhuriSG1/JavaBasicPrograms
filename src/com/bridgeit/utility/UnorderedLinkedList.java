package com.bridgeit.utility;

import java.util.Comparator;

import com.bridgeit.dataStructure.Node;

public class UnorderedLinkedList<E extends Comparable<E>> implements Comparator<E> {

	public int value = 0;
	public Node<E> start = null;
	public Node<E> end = null;

	private class Node<V> {
		public V element;
		public Node<V> next;
	}

	public UnorderedLinkedList() {

	}

	public void add(E element) {//start-node-node-end(start becomes end)
		if (start == null) {//here we check start is null bcoz if start is null then 
			                       // start node becomes end 
			start = new Node<E>();
			start.element = element;
			start.next = null;
			end = start;
			value++;//count of node increase
			return;
		}
		Node<E> temp = new Node<E>();//newly added  node becomes start 
		temp.element = element;
		temp.next = start;//
		start = temp;
		value++;
	}

	public boolean remove(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0) {//compare when both are not equal
			ptr2 = ptr;  //traverse both pointer
			ptr = ptr.next;
		}
		if (ptr == null) { //it means we traverse till end but we didnt get item so return false
			return false;
		} else {
			if (ptr.next == null) {//last node of list assign end
				end = ptr2;
			}
			ptr2.next = ptr.next;//remove the search node by skiping that node
			value--; //count of node decrease
			return true;
		}
	}

	public boolean search(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0)
		{
			ptr2 = ptr;  //till item found we have to traverse list
			ptr = ptr.next;
		}

		if (ptr == null) { //ptr is last node and points null n we not found item
			return false;
		} else { 
			return true;
		}
	}

	public boolean isEmpty() {
		return value == 0 ? true : false;//node count is zero list is empty
	}

	public int size() {
		return value; //it gives total number of node in list
	}

	public void append(E item) {//we adding element at start but appending element at end
		end.next = new Node<E>();//create end.next new node 
		end.next.element = item;//then store item in new node
		end = end.next;//end points last node
	}

	public int index(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		int index = 0;
		while (ptr != null && compare(ptr.element, item) != 0) {
			ptr2 = ptr;  //till item found we have to traverse list
			ptr = ptr.next;
			index++;
		}

		if (ptr == null) { //we traverse till end but item not found
			return -1;
		} else {
			return index;
		}
	}

	public void insert(int index, E item) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = start;
		while (count != index && ptr != null) {
			ptr2 = ptr;  //traverse till we dont get index and ptr is not null 
			ptr = ptr.next;
		}
		if (ptr == null) {
			return;
		}
		Node<E> temp = new Node<E>();//create temp node
		temp.element = item;//add item
		ptr2.next = temp;//temp is next node of ptr2
		temp.next = ptr;//and ptr becomes temp next
	}

	public E pop() {
		Node<E> ptr = start;
		while (ptr.next.next != null) {
			ptr = ptr.next;
		}
		Node<E> temp = end;
		end = ptr;
		return temp.element;

	}

	public E pop(int index) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && count < index) {
			ptr2 = ptr;
			ptr = ptr.next;
			count++;
		}
		
		if(count==0)
		{
			start=start.next;
			value--;
		}
		
		else if (ptr == null) {
			return null;
		}
		else
		{
			ptr.next=ptr.next;
			value--;
		}
		return ptr.element;
	}
	
	void display()
	{
		Node<E> n = start;
		while(n.next!=null)
		{
			System.out.println(n.element);
			n = n.next;
		}
		System.out.println(n.element);
	}

	@Override
	public int compare(E o1, E o2) {
				return o1.compareTo(o2);
	}

}
