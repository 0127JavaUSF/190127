package groupsix;

public class GroupSixStringMethods {
	
	
	public static void main(String[] args) {
		
	String groupSix = "group six is literally the best";
	
	//groupSix.hashCode();
	
	System.out.println(groupSix.hashCode()); // Returns a hash code for this string.
	
	System.out.println(groupSix.indexOf(
			"i" )); //Returns the index within this string of the 
	                //first occurrence of the specified character.
	
	
	System.out.println(groupSix.indexOf("i",8)); // Returns the index within this string of the first occurrence 
	                                              //of the specified character, starting the search at the specified index.
	
	int x = groupSix.indexOf("i", 100);    //tests to see if the line of code works
	if(x == -1 ) {
		System.out.println("This doesn't work");
		
	}
	else
	{
		System.out.println(x);
	}
	
	//System.out.println(groupSix.indexOf("i",100)); 
	
	System.out.println(groupSix.indexOf("best")); // Returns the index within this 
	                                              //string of the first occurrence of the specified substring.
	
	}
		
	}


