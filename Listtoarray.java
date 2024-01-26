package Task12;
import java.util.ArrayList;
public class Listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating ArrayList
		ArrayList<String> list=new ArrayList<String>();
//Adding elements in list
		list.add("Hi");
		list.add("Hello");
		list.add("All");
		list.add("How");
		list.add("are");
		list.add("you");
		System.out.println("Arraylist :" +list);
//Creating a new array of string type
		String[]arr=new String[list.size()];
//Converting list to array
		list.toArray(arr);
		System.out.println("Array:");
		for(String x:arr)
	   {
			System.out.println(x+ " ");
	   }

	}

}
