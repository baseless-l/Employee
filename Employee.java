
/**
 * Abstract class Employee, will be extended by any class that 
 * wishes to impliment its data fields and methods or to be used 
 * as a point of compairsion.
 *
 * @author Kian R Frawley
 * @version 11/8/21
 */
public abstract class Employee
{
    // instance variables 
    private String name;
    private String address;
    private double salary;
   /**
   * Constructor for class Employee, this will pass data fields to 
   * set methods for validation.
   * 
   * @param name Name of the employee.          
   * @param address Address of the employee.
   * @param salary Salary of the employee.
   * 
   * @throw NotPositiveNumberException if input is less then 0.0
   * */
    public Employee(String name,String address, double salary) throws NotPositiveNumberException
    {
        setName(name);
        setAddress(address);
        setSalary(salary);
    }
   /**
   * Set method for data field name and takes name as an argument.
   * 
   * @param name Name of the employee.
   **/
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Set method for data field address and takes address as an argument
     * 
     * @param address Address of the employee.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
     /**
     * Set method for data field salary and takes salary as an argument
     * 
     * @param address Address of the employee.
     * 
     * @throw NotPositiveNumberException if input is less then 0.0
     */
    public void setSalary(double salary) throws NotPositiveNumberException
    {
        if(salary >= 0.0)
        {
            this.salary = salary;
        }
        else{
            throw new NotPositiveNumberException();
        }
    }
    /**
     * Get method for data field name
     * 
     * @return name Name of employee.
     */
    public String getName()
    {
        return name;
    }
     /**
     * Get method for data field address
     * 
     * @return address Address of employee.
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * Get method for data field salary
     * 
     * @return salary Salary of employee.
     */
    public double getSalary()
    {
        return salary;
    }
    /**
     * Abstract method to be made concrete to calculate any additional income.
     */
    public abstract double getAdditionalIncome();
    /**
     * get method that returns the employee salary plus any additional income. 
     * Requires getAdditionalIncome() to be concreate.
     * 
     * @return the employee salary plus any additional income.
     */
    public double getTotalSalary()
    {
        return salary + getAdditionalIncome();
    }
     /**
     * toString method for any Employee object.  
     * 
     * @return string that contains name,address,salary, and getTotalSalary().
     */
    public String toString()
    {
      StringBuilder output = new StringBuilder();
      output.append("Employee Name: ");
      output.append(name);
      output.append("\n Employee Address: ");
      output.append(address);
      output.append("\n Employee Salary: ");
      output.append(salary);
      output.append("\n Total Employee Salary: ");
      output.append(getTotalSalary());
      
      return output.toString();
    }
    
}
