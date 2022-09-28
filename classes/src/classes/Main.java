package classes;

public class Main {

	public static void main(String[] args) {
		//referance type - - - - - bellekte 2 yer var; stack / heap - - - - - garbage collector (GC)
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value (değerler stackte oluşuyor)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3}; 
		//int[] sayilar1 = {1,2,3};  şeklinde de olur ancak üstteki daha okunaklı
		int[] sayilar2 = new int[] {4,5,6}; 
		
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}
	

}