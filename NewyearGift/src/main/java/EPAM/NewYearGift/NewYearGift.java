package EPAM.NewYearGift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class NewYearGift
{
	public static void main(String[] args)
	{
		ArrayList<Integer> choco_wt=new ArrayList<Integer>();
		ArrayList<Integer> sweet_wt=new ArrayList<Integer>();
		ArrayList<Integer> gift_wt=new ArrayList<Integer>();
		ArrayList<Integer> sort_choco=new ArrayList<Integer>();
		int minimum,maximum;
		boolean flag=true;
		boolean flag1=true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minimum range for the gift");
		minimum=scan.nextInt();
		System.out.println("Enter the maximum range for the gifts");
		maximum=scan.nextInt();
		while(flag)
		{
			System.out.println("Enter your choice:\n1.Sweets\n2.Chocolates\n3.Exit\n");
			int ch=scan.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter your choice:\n1.Kheer\n2.Rasmalai\n");
					int p=scan.nextInt();
					Sweets obj=new Sweets();
					int wt=obj.weight(p);
					if(wt>=0) {
						sweet_wt.add(wt);
						
						}
						else
						{
							System.out.println("Enter valid option.....\n");
						}
					break;
				case 2:
					System.out.println("Enter your choice:\n1.Ferri Rocher\n2.Hersheys\n");
					int k=scan.nextInt();
					Chocolates obj1= new Chocolates();
					int wt1=obj1.weight(k);
					if(wt1>=0) {
						choco_wt.add(wt1);
						}
					else
					{
						System.out.println("Enter valid option.....\n");
					}
					break;
				case 3:
					flag=false;
					break;
				default:
					System.out.println("Enter the valid option");
			}
			
		}
		int maxi=Math.max(choco_wt.size(),sweet_wt.size());
		if(maxi==sweet_wt.size())
		{
			for(int i=choco_wt.size();i<sweet_wt.size();i++)
			{
				choco_wt.add(0);
			}
		}
		else
		{
			for(int i=sweet_wt.size();i<choco_wt.size();i++)
			{
				sweet_wt.add(0);
			}
		}
		//System.out.println(choco_wt);
		//System.out.println(sweet_wt);
		for(int i=0;i<choco_wt.size();i++)
		{
			int x=choco_wt.get(i)+sweet_wt.get(i);
			//System.out.println(x);
			gift_wt.add(x);
			//System.out.println(x);
			if(x>=minimum && x<=maximum)
			{
				flag1=false;
				sort_choco.add(choco_wt.get(i));
			}
 		}
		if(flag1)
		{
			System.out.println("There are no such gift boxes in that range....!");
		}
		else
		{
			Collections.sort(sort_choco);
			System.out.println("The chocolates in the sorting order which are in the range is :");
			for(int i=0;i<sort_choco.size();i++)
			{
				System.out.print(sort_choco.get(i)+" ");
			}
		}
	}

}