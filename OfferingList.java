import java.util.ArrayList;
import java.util.List;

public class OfferingList extends ArrayList {

	private OfferingIterator offeringIterator;
	private List<Offering> offList;

	public OfferingList() {
		offList = new ArrayList<>();
	}

	protected Trading trading;


	public ListIterator createIterator() {
		return new OfferingIterator(this.offList);
	}
}
