package test1;

import test.Address;
import test.Person;

public class Student extends Person {

    Student()
    {
    super();
    }
    public void print()
    {
        System.out.println(getName()+getAge()+getAddress());
    }
}
