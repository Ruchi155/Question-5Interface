
public class Question5Interface
{
	public static void main(String[] args) 
	{
		BackedGoods[] goods = null;
		goods[0]=new Cookie();
		goods[1]=new CinnamonRoll();
		goods[2]=new Brownie();
		
		for(int i=0;i<3;i++)
		{
			goods[i].getPrice();
			//good[i].getDescription();
			//good[i].getSellByDate();
		}
		
	}

}
