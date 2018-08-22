package file;

public class Employee {
	private int id;
	private  String name;
	private double salary;
	private String domain;
	
	public Employee(int id, String name, double salary, String domain) {
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.domain = domain;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDomain() {
		return domain;
	}

}
