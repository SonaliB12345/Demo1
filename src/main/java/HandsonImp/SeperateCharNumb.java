package HandsonImp;

public class SeperateCharNumb {

	public static void main(String[] args) {
		String a="s%on122a@li";
		char b[]=a.toCharArray();
		String characters="";
		String spec="";
		long Numb=0;
		for(int i=0;i<b.length;i++)
		{
			if(Character.isAlphabetic(b[i]))
			{
				characters=characters+b[i];
			}
			else if(Character.isDigit(b[i]))
			{
				Numb=Numb+b[i];
			}
			else
			{
				spec=spec+b[i];
			}
			
		}
		System.out.println(characters);
		System.out.println(Numb);
		System.out.println(spec);
	}

}
