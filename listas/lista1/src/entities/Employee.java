package entities;

public class Employee {

	private Integer id;
	private Double salary;
	private String name;
	
	public Employee (String name, Double salary, Integer id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		
	}
	
	public void setName (String name) {
		this.name = name;
		
	}
	
	public String getName () {
		return name;
		
	}
	
	public void setSalary (Double salary) {
		this.salary = salary;
		
	}
	
	public Double getSalary () {
		return salary;
		
	}
	
	public void setId (Integer id) {
		this.id = id;
		
	}
	
	public Integer getId () {
		return id;
		
	}
	
	public void increaseSalary (Double percentage) {
		salary = (salary * percentage) + salary;
		
	}
	
	public String toString () {
		return name + ", " + id + ", " + salary;
		
	}	
}
