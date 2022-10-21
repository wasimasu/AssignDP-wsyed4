public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;


	public void visitFacade(Facade facade) {
		System.out.println("As expected, Printing the product inside facade "+ facade.getProduct());
	}
	public void visitTrading(Trading trading) {
		System.out.println("If the trading object has data, we can print it and compare the dates with the current date."+trading);
	}

	public void visitProduct(Product product) {
		System.out.println("Trading for the product "+product.getName()+" is "+product.getTrading());
	}


}
