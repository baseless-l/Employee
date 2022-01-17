
/**
 * Class Executive that extents abstract Employee and implements
 * SalaryConstants. Will bee used for any person in the Executive Role.
 *
 * @author Kian R Frawley 
 * @version 11/8/21
 */
public class Executive extends Employee implements SalaryConstants 
{
    /**
     *  No-arg Constructor for objects of class Executive.
     *  
     *  @throw NotPositiveNumberException if input is less then 0.0
     */
    public Executive() throws NotPositiveNumberException
    {
        this("","",0.0);
    }
    /**
     *  Constructor for objects of class Executive that passes 
     *  name,address, and salary to super.
     *  
     * @param name Name of the employee          
     * @param address Address of the employee.
     * @param salary Salary of the employee.
     * @throw NotPositiveNumberException if input is less then 0.0
     */
    public Executive(String name,String address,double salary) throws NotPositiveNumberException
    {
        super(name,address,salary);
    }
    /**
     * Get method that makes abstract method geAdditionalIncome concrete.
     *
     * @return the product of the Executives salary and constant BONUS_RATE. 
     */
    @Override
    public double getAdditionalIncome()
    {
        return getSalary() * BONUS_RATE;
    }
}
