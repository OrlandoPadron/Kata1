package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    /**
     * 
     * @author Orlando Padrón
     */
    
    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1997,3,13);
        Person person = new Person("Orlando", date);
        
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
                
    }
}
