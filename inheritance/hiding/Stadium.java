class Stadium{

//type,name,noOfSeats

		String type;
		String name;
		int noOfSeats;


		// access : static ClassName, ref variable of the class 
		void openGate()
		{
			System.out.println("running openGate() from parent");
		}
		//chage in datatype, sequence , no of parametr
		void openGate(boolean open)
		{
			if(open)
			{
				System.out.println("open gate of stadium \t"+this.name);
			}
			else{
				System.out.println("close gate of stadium"+this.name);
			}
		}
		

}