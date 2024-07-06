class ShoppingCart 
{
	public static void main(String[] args) 
	{
		ShoppingCart obj=new ShoppingCart();
		obj.checkOut();
	}

	//non-static methods 
	public void addItem()
	{
		System.out.println("addItem");
		calculateTotal(); //sm
	}
	public void removeItem()
	{
		System.out.println("removeItem ");
		calculateTotal(); //sm
	}
	public void checkOut()
	{
		System.out.println("checkout");
		addItem(); //nsm
		removeItem(); //nsm
		generateInvoice(); //sm
	}

	//static methods
	public static void calculateTotal()
	{
		System.out.println("Total");
	}
	public static void generateInvoice()
	{
		System.out.println("Invoice");
	}
}
