package w12.JavaCollectionn;

public class Barang {
	
    private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private long priceItem;
    private String productName;

    public String toString() {
        return  productName+" | "+quantity+" | "+weight+" | "+
                city.getDestination()+" | "+servicePackage.getService()+" | "+
                servicePackage.getValue()+" | "+((priceItem*quantity)+servicePackage.getValue());
    }
}
