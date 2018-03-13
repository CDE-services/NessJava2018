package persons;

import shapes.*;

public class TestSort {    
    public static void main(String[] args){
    	//Array of person
        Person[] persons = new Person[5];
        persons[0] = new Person("Jano","Modry");
        persons[1] = new Person("Fero","Zeleny");
        persons[2] = new Person("Zuza","Modra");
        persons[3] = new Person("Jano","Zeleny");
        persons[4] = new Person("Anna","Modra");
        
        Shape[] shapes = new Shape[5];
        shapes[0] = new Point(0, 1, 5);
        shapes[1] = new Point(0, 1, 3);
        shapes[2] = new Point(0, 1, 1);
        shapes[3] = new Point(0, 1, 8);
        shapes[4] = new Point(0, 1, 6);
        
        //Sorting
        ArraySort as = new ArraySort();
        as.sort(persons);
        
        as.sort(shapes);
        
        //Printing sorted array
        for(Person p : persons) {
            System.out.println(p);
        }
        
        //Printing sorted array
        for(Shape s : shapes) {
            System.out.println(s);
        }
    }
}
