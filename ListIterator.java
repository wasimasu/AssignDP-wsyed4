/**
 * The abstract iterator class in this class declares some iterating functions 
 * that need to be implemented in the concrete iterator classes. 
 */
public abstract interface ListIterator {

	/**
	 * If in the iterator there exists the "next", return true; else return false. 
	 */
	public abstract boolean hasNext();

	/**
	 * If hasNext, return the next Item, move the current Item to the next item. Else return null.
	 */
	public abstract Object Next();

	/**
	 * Set the current item to the location before the first item. 
	 */
	public abstract void MoveToHead();

	/**
	 * Remove the current item from the list.
	 */
	public abstract void Remove();

}
