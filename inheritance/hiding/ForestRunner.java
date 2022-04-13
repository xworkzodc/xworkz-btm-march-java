class ForestRunner{

public static void main(String[] values)
{
	
	Forest forest=new Forest();
	System.out.println(forest.type);//TEMPERATURE
	System.out.println(forest.noOfReserviour);//20
	
	// variable from parent 
	Forest forest1=new BandipuraForest();
	System.out.println(forest1.type);//TEMPERATURE
	System.out.println(forest1.noOfReserviour);//20
	
	BandipuraForest forest2=new BandipuraForest();
	
	System.out.println(forest2.type);//TEMPERATURE
	System.out.println(forest2.noOfReserviour);//35
	
	BandipuraForest forest3=(BandipuraForest)forest1;
	System.out.println(forest3.noOfReserviour);//35
	
	
	
}

}