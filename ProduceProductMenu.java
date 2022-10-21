import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ProduceProductMenu extends ProductMenu {


	public void showAddButton() {

	}


	public void showRadioButton() {

	}


	public void showLabels() {

	}
	public void showMenu() {

		System.out.println("Using Bridge, i am developing this method");
		File file = new File(
				"textFiles/ProductInfo.txt");

		try {
			BufferedReader br
					= new BufferedReader(new FileReader(file));
			Scanner sc = new Scanner(file);
			String str;

			while (sc.hasNextLine()){
				str = sc.nextLine();

				String[] dict = str.split(":");

				if(dict[0].equals("Produce")){
					System.out.println(dict[1]);
				}

			}

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}




	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
