import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class MeatProductMenu extends ProductMenu {




	public void showAddButton() {

	}


	public void showRadioButton() {

	}

	public void showViewButton() {

	}

	public void showMenu() {
		File file = new File(
				"textFiles/ProductInfo.txt");

		System.out.println("Factory Method also is used here");

		try {
			BufferedReader br
					= new BufferedReader(new FileReader(file));
			Scanner sc = new Scanner(file);
			String strk;

			while (sc.hasNextLine()){
				strk = sc.nextLine();
				String[] dict = strk.split(":");
				if(dict[0].equals("Meat")){
					System.out.println(dict[1]);
				}

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public void showLabels() {

	}

	public void showComboxes() {

	}

}
