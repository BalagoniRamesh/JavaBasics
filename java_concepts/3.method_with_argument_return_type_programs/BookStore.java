class BookStore 
{
	public static int calculateProfitRupee(int profitpercentage, int costprice) 
	{
		int calculateProfitRupee=(profitpercentage*costprice)/100; //20
		return calculateProfitRupee;
	}
	public static void printSellingPrice(int profitpercentage, int costprice, int profitRupees) 
	{
		int printSellingPrice=costprice+profitRupees; //220
		System.out.println("A woman will purchase the book for "+costprice+"Rs and sells for the price of "+printSellingPrice+"Rs and got the profit of "+profitpercentage+"%"); //200,220,10
	}
	public static void main(String[] args) 
	{
		int result = calculateProfitRupee(10, 200);
		printSellingPrice(10, 200, result);
	}
}

/*
A woman will purchase the book for 200Rs and sells for the price of 220Rs and got the profit of 10%
*/