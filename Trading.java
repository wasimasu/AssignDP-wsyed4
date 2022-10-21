public class Trading {

	private Product product;

	private OfferingList offList;

	public void accept(NodeVisitor visitor) {
		visitor.visitTrading(offList.trading);
	}

}
