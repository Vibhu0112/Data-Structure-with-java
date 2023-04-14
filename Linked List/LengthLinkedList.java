// Recursive Java program to count number of nodes in a linked list

package Linkedlist;

/* Linked list Node*/
class Node {
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

// Linked List class
public class LengthLinkedList {
	Node head; // head of list

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public int getCountRec(Node node)
	{
		// Base case
		if (node == null)
			return 0;

		// Count is this node plus rest of the list
		return 1 + getCountRec(node.next);
	}

	/* Wrapper over getCountRec() */
	public int getCount() { 
        return getCountRec(head); 
    }

	public static void main(String[] args)
	{
		/* Start with the empty list */
		LengthLinkedList llist = new LengthLinkedList();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);

		System.out.println("Count of nodes is "
						+ llist.getCount());
	}

 
}
