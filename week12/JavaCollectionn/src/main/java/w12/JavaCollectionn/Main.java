package w12.JavaCollectionn;

import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	
	public static void main(String[] args) {
		        
        try {
            Gson gson = new Gson();
            ArrayList<Barang> barang = gson.fromJson(
              new FileReader("D:\\barang.json"), 
              new TypeToken<ArrayList<Barang>>() {}.getType()
            );
            for(int i=0;i<barang.size();i++){
                System.out.println("Barang" + (i+1) + " = " + barang.get(i).toString());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
