
import java.util.Date;

public class Peopletest {
	public static void main (String[] args){
		


		Employee newbie = new Employee("Newbie",new Date(2/10/1989),1000000);
		
		Manager boss = new Manager("boss",new Date(2/23/1986),4000000);
		
		boss.setAssistant(newbie);
		
		Manager biggerBoss = new Manager("biggerBoss",new Date(3/12/1969),10000000);
		biggerBoss.setAssistant(boss);
		
		System.out.println(newbie);
		System.out.println(boss);
		System.out.println(biggerBoss);
		
		Person person[]= new Person [3];
		person[0]=newbie;
		person[1]=boss;
		person[2]=biggerBoss;
		for(int i=0;i<3;i++){
			System.out.println("\n\n"+person[i]);
		}
		

	}

}
