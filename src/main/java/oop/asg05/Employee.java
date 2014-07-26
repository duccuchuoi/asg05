import java.util.Date;


public class Employee extends Person {
	public double salary;
	
	public Employee(String name,Date d, double i){
		super(name,d,i);
		salary=i;
		
	}


	public double getSalary(){
		return salary;
	}
	
	public String toString(){
		return "\n"+name+"\n"+format.format(date)+"\n"+String.valueOf(salary);
		
	}

}
