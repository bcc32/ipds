// Aaron Zeng 20120215
// Chapter 03 Exercise 14

public class Employee
{
    // instance variables
    private String firstName, lastName;
    private double salary;

    // constructor
    public Employee( String fn, String ln, double sal )
    {
        setFirstName( fn );
        setLastName( ln );
        setSalary( sal );
    }

    // set methods
    public void setFirstName( String fn )
    {
        firstName = fn;
    }

    public void setLastName( String ln )
    {
        lastName = ln;
    }

    public void setSalary( double sal )
    {
        if ( sal > 0 )
            salary = sal;
    }

    // get methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public double getSalary()
    {
        return salary;
    }

    // yearly salary
    public double getYearlySalary()
    {
        return 12 * salary;
    }
}
