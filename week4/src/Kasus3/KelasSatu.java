package Kasus3;

class KelasSatu
{
	{
		System.out.println(11);			//initializer block, created sama class
	}
	
	static{
		System.out.println(2);			//static constructor, only once
	}
	
	public KelasSatu(int i){			//constructor overloading, param
		System.out.println(3);
	}
	
	public KelasSatu(){					//constructor overloading, param
		System.out.println(4);
	}
}