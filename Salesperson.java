
/**
 * Concreate class Salesperson, to used for any person in sales
 * and extends Employee 
 *
 * @author Kian Frawley
 * @version 11/8/21
 */
public class Salesperson extends Employee implements SalaryConstants 
{
    // instance variables 
    private int sales;

    /**
     * No-arg Constructor for objects of class Salesperson
     * 
     * @throw NotPositiveNumberException if input is less then 0.0
     */
    public Salesperson() throws NotPositiveNumberException
    {
      this(0,"","",0.0);
    }
    /**
     * Constructor for object of type salesperson. Passes name,address, and salary to super 
     * and sales to set method.
     * 
     * @param sales Sales made by salesperson
     * @param name Name of the employee          
     * @param address Address of the employee.
     * @param salary Salary of the employee.
     * 
     * @throw NotPositiveNumberException if input is less then 0.0
     */
    public Salesperson(int sales,String name,String address,double salary) throws NotPositiveNumberException
    {
      super(name,address,salary);
      setSales(sales);
    }
    /**
     * Set method for data field sales
     * 
     * @param sales Amount of sales made by the salesperson.
     * 
     * @throw NotPositiveNumberException if input is less then 0.0
     */
    public void setSales(int sales) throws NotPositiveNumberException
    {
        if(sales >= 0.0)
        {
        this.sales = sales;
        }
        else {
            throw new NotPositiveNumberException();
        }
    }
    /**
     * Get method for data field sales
     * 
     * @return Sales made by salesperson
     */
    public int getSales()
    {
        return this.sales;
    }
    /**
     * Get method that makes abstract method geAdditionalIncome concrete
     * and is used to return any additionalIncome from the seller.
     *
     * @return the product of data field sales and Constant COMMISSION_RATE  
     */
     @Override
    public double getAdditionalIncome()
    {
        return sales * COMMISSION_RATE;
    }
}
