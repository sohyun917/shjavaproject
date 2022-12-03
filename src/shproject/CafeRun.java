package shproject;

public class CafeRun {
	public static void main(String [] args) {
		CafeInventory cInven = new CafeInventory();
		EXIT :
		while(true) {
			int choice = cInven.printMenu();
			switch(choice) {
				case 1 :
					cInven.inOutStock();
					break;
				case 2 :
					cInven.stock();
					break;
				case 3 : 
					cInven.checkOrder();
					break;
				case 4 :
					cInven.printGoodBye();
					break EXIT;
				default :
					cInven.printException();
					break;
			}
		}
	}

}
