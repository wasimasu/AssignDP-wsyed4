import java.util.Scanner;

public class Facade {
	Scanner sc = new Scanner(System.in);
	private int UserType;

	private Product theSelectedProduct;

	private int nPCateg;


	private ClassProductList ProdList;


	private Person thePerson;


	public Product getProduct(){
		return theSelectedProduct;
	}

	public void addTrading() {

	}
	public boolean login() {
		Login log = new Login();
		log.login();
		this.UserType = log.getUserType();
		createUser(new UserInfoItem());
		return false;
	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}


	public void discussBidding() {

	}


	public void submitBidding() {

	}



	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ClassProductList CL = new ClassProductList();
		CL.accept(remind);

	}
	public void createProductList() {

	}
	public void createUser(UserInfoItem userinfoitem) {
		if(UserType == 0){
			System.out.println("What do you want to buy? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nPCateg=choice;
			Buyer B = new Buyer(nPCateg);
			B.CreateProductMenu();
			B.showMenu();

		}else{
			System.out.println("What do you want to sell? \n 1. Meat \n 2. Produce");
			int choice = Integer.parseInt(sc.nextLine());
			nPCateg=choice;
			Seller seller = new Seller(nPCateg);
			seller.CreateProductMenu();
			seller.showMenu();

		}
		System.out.println("Accessing visitor pattern for product list");
		remind();

	}

	public void attachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
