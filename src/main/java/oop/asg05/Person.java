import  java.text.SimpleDateFormat;
import java.util.Date;
public class Person {
	
	public String name;
	public String birthday;
	public Date date;
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	public Person(String name, Date date, double i){
		this.name=name;
		this.date=date;
		i=0;
	}
	
	public String getname(){
		return name;
	}

	public String toString(){
		return "" + name+format.format(date);
	}
}
