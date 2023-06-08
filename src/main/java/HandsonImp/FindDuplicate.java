package HandsonImp;

public class FindDuplicate {

	public static void main(String[] args) 
	{
		String a="harshraj";
		char b[]=a.toCharArray();
		int counter=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.println(b[j]);
					counter++;
				}
			}
			
		} System.out.println(counter);
		

	}

}
