import java.util.ArrayList;
class Arraylist
{
public static void main(String []args)
{
	ArrayList<String>car=new ArrayList<String>();
	car.add("Volvo");
    car.add("BMW");
    car.add("Ford");
    car.add("Mazda");
	System.out.println(car);	
	System.out.println(car.size());
	car.set(1,"kia");
	System.out.println(car);
	car.remove(0);
	System.out.println(car);
	car.clear();
	System.out.println(car);
	for(int i=0;i<car.size();i++)
	{
		System.out.println(car.get(i));
	}
}
}