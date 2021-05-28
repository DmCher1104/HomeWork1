package org.run;
import org.some.NumberGenerator;

public class Application{
	public static void main (String[] args){
		System.out.println("Application is working...");
		Person person = new Person();
		String personName = person.getPersonName();
		System.out.println("hi" + personName);
		
		NumberGenerator numbeGenerator = new NumberGenerator();
		int numb = numbeGenerator.getNumber();
		System.out.println("Our number is " + numb);
		System.out.println("Application is ending...");
	}
}