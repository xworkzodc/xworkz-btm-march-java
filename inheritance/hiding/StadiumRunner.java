class StadiumRunner{

public static void main(String[] values)
{
	Stadium stadium=new Stadium();
	stadium.type="Outdoor";
	stadium.name="Chinnaswamy";
	stadium.noOfSeats=20000;
	
	stadium.openGate();
	
	stadium.openGate(true);
	
	
	Stadium stadium1=new IndoorStadium();
	stadium1.type="Indoor";
	stadium1.name="Kanteerava";
	stadium1.noOfSeats=4000;
	
	stadium1.openGate();//
	
	stadium1.openGate(false);
	
	
	
	
}

}