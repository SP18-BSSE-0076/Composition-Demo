public class FirstClass
{
    String firstName;

    private final SecondClass s; // declare 2nd class object and make it final.
    
    public FirstClass(String firstName , String lastName)// in 1st class constructor
    {                                                    // we initialize
        this.s = new SecondClass();                      // 2nd class constructor
        
        s.setLastName(lastName);    // using 2nd class object we call 2nd class method
        
        this.firstName = firstName;
    }
    
    public String getLastName()     // calling gettor method of 2nd class field 
    {
        return s.lastName;      // returning 2nd class object with field
    }
}