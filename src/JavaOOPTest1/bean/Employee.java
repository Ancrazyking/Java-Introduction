package JavaOOPTest1.bean;

/**
 * @author afeng
 * @date 2018/7/28 10:22
 **/
public class Employee
{
    /**
     * 由于用的是包装类,如果税前小于2000的话,get返回值为null.
     */
    private String name;
    private Double salary;

    private Double subsidy;
    /**
     * 个人所得税
     */
    private Double personalIncomeTax;


    public Employee(){}
    public Double getPersonalIncomeTax()
    {
        return personalIncomeTax;
    }

    public void setPersonalIncomeTax(Double personalIncomeTax)
    {
        this.personalIncomeTax = personalIncomeTax;
    }

    public Employee(String name, Double salary, Double subsidy)
    {
        this.name = name;
        this.salary = salary;
        this.subsidy = subsidy;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public Double getSubsidy()
    {
        return subsidy;
    }

    public void setSubsidy(Double subsidy)
    {
        this.subsidy = subsidy;
    }

    /**
     * 税前收入
     *
     * @return
     */
    public Double getSalaryFont()
    {
        return salary + subsidy;
    }

    /**
     * 税后收入
     *
     * @return
     */
    public Double getSalaryBack()
    {
        if (this.getSalaryFont() < 2000)
        {
            return this.getSalaryFont();
        } else if ((this.getSalaryFont() - 2000) > 0 && this.getSalaryFont() - 2000 <= 500)
        {
            this.personalIncomeTax = (this.getSalaryFont() - 2000) * 0.05;
            return this.getSalaryFont() - personalIncomeTax;
        } else if ((this.getSalaryFont() - 2000) > 500 && this.getSalaryFont() - 2000 <= 2000)
        {
            this.personalIncomeTax = (this.getSalaryFont() - 2000) * 0.1;
            return this.getSalaryFont() - personalIncomeTax;
        } else if ((this.getSalaryFont() - 2000) > 2000 && this.getSalaryFont() - 2000 <= 5000)
        {
            this.personalIncomeTax = (this.getSalaryFont() - 2000) * 0.15;
            return this.getSalaryFont() - personalIncomeTax;

        }else if((this.getSalaryFont() - 2000) > 5000 && this.getSalaryFont() - 2000 <= 20000){
            this.personalIncomeTax = (this.getSalaryFont() - 2000) * 0.2;
            return this.getSalaryFont() - personalIncomeTax;
        }else{
            this.personalIncomeTax = (this.getSalaryFont() - 2000) * 0.3;
            return this.getSalaryFont() - personalIncomeTax;
        }

    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", subsidy=" + subsidy +
                '}';
    }
}
