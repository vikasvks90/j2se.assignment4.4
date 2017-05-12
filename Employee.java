/**
* <h1>Employee</h1>
* This program implements an application that
* simply demonstrates the inheritance concept
* grossSalary method has been overridden in Manager and Trainee classes
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/

package session4;

public class Employee {
	
	public int basicSalary ;
	int grossSalary;
	
	public int grossSalary(){
		return grossSalary;
	}
	
	public static void main(String[] args)
	{
		Manager manager = new Manager(20000);
		Trainee trainee = new Trainee(10000);
		System.out.println("Basic Salary of manager is: "+manager.basicSalary);
		System.out.println("Gross Salary of manager is: "+manager.grossSalary());
		System.out.println("Basic Salary of trainee is: "+trainee.basicSalary);
		System.out.println("Gross Salary of trainee is: "+trainee.grossSalary());
	}	

}

class Manager extends Employee{
	
	public Manager(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public int grossSalary() {
		int travelAllowances = basicSalary*15/100;
		grossSalary = basicSalary + travelAllowances;
		return grossSalary;
		
	}
	
}

class Trainee extends Employee{
	public Trainee(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	@Override
	public int grossSalary() {
		int travelAllowances = basicSalary*10/100;
		grossSalary = basicSalary + travelAllowances;
		return grossSalary;
	}
	
}