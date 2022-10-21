public class Buyer extends Person {
	private int prodcateg;

	Buyer(int prodcateg) {
		this.prodcateg = prodcateg;
	}

	public void showMenu() {
			theProductMenu.showMenu();


	}



	public ProductMenu CreateProductMenu() {
		if(prodcateg == 1){
			this.theProductMenu = new MeatProductMenu();
			return this.theProductMenu;
		} else{
			this.theProductMenu = new ProduceProductMenu();
			return this.theProductMenu;

		}
	}

}
