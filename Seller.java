
public class Seller extends Person {
	private int prodCate;

	Seller(int prodCate) {
		this.prodCate = prodCate;
	}

	public void showMenu() {
		theProductMenu.showMenu();
	}


	public ProductMenu CreateProductMenu() {
		if(prodCate == 1){
			this.theProductMenu = new MeatProductMenu();
			return this.theProductMenu;
		} else{
			this.theProductMenu = new ProduceProductMenu();
			return this.theProductMenu;

		}
	}

}
