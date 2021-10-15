package week5;

public class Restaurant {
//		private String[] nama_makanan;
//		private double[] harga_makanan;
//		private int[] stok;
		private Makanan[] menuMakanan;	//variabel atas masuk ke class makanan
		private static byte id=0;
		
		public Restaurant() {
//			nama_makanan = new String[10];
//			harga_makanan = new double[10];
//			stok = new int[10];
			menuMakanan = new Makanan[10];
		}
		
//		public void tambahMenuMakanan(String nama, double harga, int stok) {
//			this.nama_makanan[id] = nama;
//			this.harga_makanan[id] = harga;
//			this.stok[id] = stok;
//		}
		
		public void tambahMenuMakanan(String nama, double harga, int stok) {
			this.menuMakanan[id] = new Makanan (nama, harga, stok);
		}
		
		public void tampilMenuMakanan(){
			for(int i =0; i<=id;i++){
				if(!isOutOfStock(i)){
				   //System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);	
				this.menuMakanan[i].pMakanan();
				}
			}
		}
				
		public static void nextId(){
			id++;
		}
		
		private boolean isOutOfStock(int id) {
			// TODO Auto-generated method stub
			return menuMakanan[id].getStok() == 0;
		}
		
		//pesan
		public void pemesananMakanan(String namaMakanan, int jml) {
			for(int i = 0; i <= id; i++) {
				if(namaMakanan.equals(menuMakanan[i].getNama_makanan())) {
					if(menuMakanan[i].getStok() >= jml) {
						System.out.println("Terjual" + " " + menuMakanan[i].getNama_makanan() + " " + "sejumlah" + " " + jml);
						menuMakanan[i].berkurang(jml);
					}else
						System.out.println("Stok makanan" + " " + menuMakanan[i].getNama_makanan() +" " + "kurang, tidak bisa melakukan transaksi !");
				}
			}
		}		
	}