
import java.util.Date;

public class Manager extends Employee {

	public Manager(String name,Date d, double i) {
		super(name,d, i);
		// TODO Auto-generated constructor stub
	}

	public Employee assistant;
	
	public void setAssistant(Person assistant){
		this.assistant=(Employee) assistant;
		
	}
	
	public String toString(){
		return ""+name+"\n" +format.format(date)+"\n"+String.valueOf(salary);
	}

}
