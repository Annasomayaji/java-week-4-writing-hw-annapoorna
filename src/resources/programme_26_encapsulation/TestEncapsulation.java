package resources.programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
    //setting values of the variables
        obj.setName("Annu");
        obj.setAge(18);
        obj.setRollNo(50);
        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());
        // Direct access of rollNo is not possible due to     encapsulation
        // System.out.println("Prime's rollNo : " +     obj.geekName);


    }
}
