/**
 * The abstract class of the list to be iterated 
 */
public class ClassProductList extends ArrayList {

	private ProductIterator productIterator;

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	public void accept(NodeVisitor visitor) {

	}

}
