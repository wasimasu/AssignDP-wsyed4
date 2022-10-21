import java.util.List;

public class OfferingIterator implements ListIterator {

	private OfferingList offeringList;
	private List<Offering> offe;
	private int pos=0;
	@Override
	public boolean hasNext() {
		return pos < offe.size() && offe.get(pos) != null;

	}

	public OfferingIterator(List<Offering> offe){
		this.offe = offe;
	}

	@Override
	public void MoveToHead() {
		pos=0;
	}

	@Override
	public void Remove() {

	}


	@Override
	public Offering Next() {
		System.out.println("Iterator method is being used here for offering product purchases");

		Offering offering= offe.get(pos);
		pos += 1;
		return offering;
	}



}
