package Info123;

public class DemoForEach {
public static void main(String[] args)
{
	String bike1="Ktm1";
	String bike2="Ktm2";
	String bike3="Ktm3";
	String bike4="Ktm4";
	String bikes[]= {bike1,bike2,bike3,bike4};
	System.out.println("Subscript value =3 ="+bikes[3]);
	System.out.println("ARRAY LENGTH="+bikes.length);
	System.out.println("IN FOR LOOP");
	for(int i=0;i<bikes.length;i++)
	{
		System.out.println(bikes[i]);
	}
	System.out.println("IN FOR EACH LOOP");
	for(String element:bikes) {
		System.out.println(element);
	}
}
}
