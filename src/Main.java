public class Main
{
    public static void main(String[] args)
    {
        FirstClass f = new FirstClass("Muhammad" , "Atif");
        
        String lastName = f.getLastName();      // putting that text and saving it in any variable
        
        System.out.println(lastName);           // printing that variable.
        
        System.out.println(f.firstName);        // 1st class fields in constructor can show by simple calling using 1st class object
    }
}