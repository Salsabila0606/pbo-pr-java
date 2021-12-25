package GenericProgrammingLap;

class Test<T>  { 
	
	T obj; 
	
        Test(T obj) { 
            this.obj = obj; 
        } 
        
	//Generic Method
        public T getObject() { 
            return this.obj; 
        } 
} 

// Driver class to test above 
public class GenericMethodClassMethod { 
	
    public static void main (String[] args) 
    { 
    	
    // instance of String type 
   	Test <String> sObj = new Test<String>("Salsabila Putri Prameswari"); 
   	System.out.println(sObj.getObject()); 
    	
	// instance of Integer type 
	Test <Integer> iObj = new Test<Integer>(201511029); 
	System.out.println(iObj.getObject()); 
	
    } 
}