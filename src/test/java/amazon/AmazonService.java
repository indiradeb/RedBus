package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AmazonService {

	//private 
	private  static String productNumber;
	private static int cart;
	private static int count=0;
	 static Scanner input1 = new Scanner(System.in);
	 static List<String> ar = new ArrayList<String>();
	//int n = input.nextInt(); 
	//constructer
	public AmazonService()
	{
		display();
	}
	//checkout
	//search
	
	//Add products
	public static void addproducts(){
		
	}
	
	//view/display the items the items
	public static void display() {


	char ch;
    System.out.println("To view the available items click anynumber except 0");
    Scanner input = new Scanner(System.in);
	int val = input.nextInt(); 
	
	while(val!=0) {
		System.out.println("Items in the wbesite");
		System.out.println("1.Electronics1\n2.Home decor\n3.Kitchen\n4.Gardening");
		System.out.println("Select the catageory....");
		//Scanner input = new Scanner(System.in);
		int n = input.nextInt(); 
		
		switch(n)
		{
		case 1: System.out.println("Display the items of the Electronics category");
		         System.out.println("1.Phones\n2.TVs\n3.Laptos\n4.Ipads");
		         int m = input.nextInt();
		         electronicsItemsDisplay(m);
		         
		         break;
		case 2: System.out.println("Display the items of the Home Decor category");
				System.out.println("1.Vases\n2.Sofas\n3.Beds\n4.CoffeeTables");
				int h = input.nextInt();
				homeDecorItemsDisplay(h);
				break;
		case 3:  System.out.println("Display the items of the Kitchen category");
				 System.out.println("1.Stove\n2.Fridge\n3.Grinder\n4.Crockery");
				 int k = input.nextInt();
				 kitchenItemsDisplay(k);
				 break;
		case 4:	System.out.println("Display the items of the Gardening category");
		 		System.out.println("1.GardenFurniture\n2.pots\n3.Plants\n4.DogHouse");
		 		int g = input.nextInt();
		 		gardeningItemsDisplay(g); 
		 		break;
		 default: System.out.println("No more items available");
		 break;
		}
			System.out.println("If you want to stop shopping  enter flase");
			
			boolean flag = input.nextBoolean();
			if(flag==false)
			{
				break;
			}
	}
}
	
	public static void gardeningItemsDisplay(int g) {
		switch(g)
		{
		case 1:System.out.println("Price of the GardenFurniture is : $200\nProduct Number is :PR1009823");
				break;
		case 2: System.out.println("Price of the pots is : $600\nProduct Number is :PR1009824");
				break;
		case 3: System.out.println("Price of the Plants is : $2000\nProduct Number is :PR1009825");
				break;
		case 4: System.out.println("Price of the DogHouse is : $500\nProduct Number is :PR1009823");
				break;
		}
		
	}
	public static void homeDecorItemsDisplay(int h) {
		switch(h)
		{
		case 1:System.out.println("Price of the Vases is : $20\nProduct Number is :PR2009832");
				break;
		case 2: System.out.println("Price of the Sofas is : $1600\nProduct Number is :PR2009833");
				break;
		case 3: System.out.println("Price of the Beds is : $3000\nProduct Number is :PR2009834");
		        break;
		case 4: System.out.println("Price of the CoffeeTable is : $250\nProduct Number is :PR2009835" );
				break;
		}
		
	}
	public static void electronicsItemsDisplay(int m)
	{
		switch(m)
		{
		case 1:System.out.println("Price of the pfone is : $200\nProduct Number is :PR3009841");
				break;
		case 2: System.out.println("Price of the TV is : $600\nProduct Number is :PR3009842");
				break;
		case 3: System.out.println("Price of the Laptop is : $2000\nProduct Number is :PR3009843");
				break;
		case 4: System.out.println("Price of the Ipad is : $500\nProduct Number is :PR3009844");
				break;
		}
	}
	
	public static void kitchenItemsDisplay(int k)
	{
		 String str = "PR";
		 int n2; 
		 int proN;
		switch(k)
		{
		case 1:System.out.println("Price of the Stove is : $350");
				System.out.println("Enter the productNumber");
				proN = input1.nextInt();
				productNumber = str+proN;
				System.out.println("If you want to add this product to cart click 1");
				n2=input1.nextInt();
				if(n2==1) {
				addingItemsToCart(productNumber);
				}
				break;
		case 2: System.out.println("Price of the Fridge is : $1500\nProduct Number is :PR4009852");
				System.out.println("Enter the productNumber");
				proN = input1.nextInt();
	      
				productNumber = str+proN;
				System.out.println("If you want to add this product to cart click 1");
				n2=input1.nextInt();
				if(n2==1) {
					addingItemsToCart(productNumber);
				}
				break;
		case 3: System.out.println("Price of the Grinder is : $450\nProduct Number is :PR4009853");
				System.out.println("Enter the productNumber");
				 proN = input1.nextInt();
				productNumber = str+proN;
				System.out.println("If you want to add this product to cart click 1");
				n2=input1.nextInt();
				if(n2==1) {
					addingItemsToCart(productNumber);
				}
				break;
		case 4: System.out.println("Price of the Crockery is : $100\nProduct Number is :PR4009854");
				System.out.println("Enter the productNumber");
				proN = input1.nextInt();
				productNumber = str+proN;
				System.out.println(productNumber);
				System.out.println("If you want to add this product to cart click 1");
				n2=input1.nextInt();
				if(n2==1) {
					addingItemsToCart(productNumber);
				}
				break;
		}
	}
	//update
	//filer the items
	
	
	
	//Add items to shoppingCart
	public static void addingItemsToCart(String pr)
	{
		
		cart++;
		System.out.println("The product Number is : "+pr);
		
	    //	adding items ti list
		ar.add(pr);
		
		System.out.println("Number of prodcuts in the cart: " +cart);
		
		if(cart>1){
		displayCart(cart,ar);
		}
	}
	
	public static void displayCart(int cart,List ar)
	{
		System.out.println("Total items avaiable in the cart: "+cart);
		System.out.println("Product number of the items: ");
		
		String[] myArray = new String[ar.size()];
		ar.toArray(myArray);
		for(String my : myArray)
			System.out.println(my);
	}
	
	//trcak order status
	
	
}
