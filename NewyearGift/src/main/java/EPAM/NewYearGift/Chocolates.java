package EPAM.NewYearGift;

class  Chocolates implements Interface
{

	public int weight(int chocolate_ch) {
		int weight=0;
		if(chocolate_ch==1)
				weight=30;
		else if(chocolate_ch==2)
			weight=40;
		else
			weight=-9999;
				
		return weight;
	}
	
	
	
}