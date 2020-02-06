package EPAM.NewYearGift;
interface Interface
{
	public int weight(int sweetch);
}
class Sweets implements Interface
{
	public int weight(int p) {
		int weight=0;
		if(p==1)
			weight=40;
		else if(p==2)
			weight=30;
		else
			weight=-9999;
		return weight;
	}
}