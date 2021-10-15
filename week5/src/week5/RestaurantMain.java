package week5;

public class RestaurantMain {

	public static void main(String[] args) {
		
		System.out.println("------Menu Makanan------");
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 1); //stok kosong
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		
		//pesan
		menu.pemesananMakanan("Tahu", 2);	//input pesanan
		System.out.println("\n------Makanan Tersisa------");
		menu.tampilMenuMakanan();
	}

}
