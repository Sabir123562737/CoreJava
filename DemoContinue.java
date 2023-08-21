package Info123;

public class DemoContinue {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==4)
			{
				i++;
				continue;
			}
			System.out.println(i);
		}
	}
	
}
