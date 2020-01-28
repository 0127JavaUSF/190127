import java.util.regex.PatternSyntaxException;

public class AtefJi {

    public static void main(String[] args)
    {
        String myString = "Mary had a little lamb"; // Create a string

            int lastlocation = myString.lastIndexOf("lamb", 18); // locate the string in backward
            System.out.println("the location of little is: " + lastlocation);// print the location of the string
        int len = myString.length(); //find the length of a string
        System.out.println("the length of the string is: " + len); //print the length of the string
        try {
            if (myString.matches("(.*)Mary had a little lamb(.*)") == true) {  //verifies if the regex matches the string
                System.out.println("matches with regex");
            } else {
                System.out.println("does not match");
            }
        }
        catch (PatternSyntaxException e){
            e.printStackTrace();
        }

        int index = 3;
        int offSetPoint = -10;
        try {
            int offsetTotal = myString.offsetByCodePoints(index, offSetPoint); //add or subtracts the index by the offsetpoints
            System.out.println("offsetTotal: " + offsetTotal);
        }
        catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
