package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	private Double percentage;
	

	public Employee(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Double increaseSalary(double percentage) {
		
		salary += salary * percentage / 100.0;
		return salary;
		
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary ;
	}
}