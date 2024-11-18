/**
 * A sortable DoublyLinkedList.  The fields and the DLLNode class in the
 * COMP232DoublyLinkedList class are protected fields and can be accessed
 * directly in this class.
 * 
 * @author William Goble
 * @author Dickinson College
 * 
 */
public class COMP232SortableLinkedList<E extends Comparable<E>> extends COMP232DoublyLinkedList<E> {

	/**
	 * Implementation of insertion sort for the LinkedList. The elements of the
	 * list will be sorted according to the order imposed by their compareTo
	 * method.
	 */
	public void insertionSortList() {
		int i = 1;
		while (i < size()) {
			int j = i;
			E temp = get(j);

			// Shift elements in the sorted part of the list to the right if they are greater than temp
			while (j > 0 && get(j - 1).compareTo(temp) > 0) {
				set(j, get(j - 1)); // shift element at j-1 to j
				set(j - 1, temp);
				j--;
			}
			i++;
		}
	} 
	}

