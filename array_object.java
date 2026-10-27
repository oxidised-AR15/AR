class Student {

    int Roll;
    String Name;
    int Marks;
}

public class array_object {

    public static void main(String arg[]) {

        // Error 1: Declaration without instantiation
        Student array_new[] = new Student[3];
        
        // Error 2: Field access on non-existent object reference
        array_new[0].Roll = 1; 
        array_new[0].Name = "Navin";
        array_new[0].Marks = 90;

        // Creating local objects
        Student s2 = new Student();
        s2.Roll = 2;
        s2.Name = "Harsh";
        s2.Marks = 95;
        array_new[1] = s2;

        Student s3 = new Student();
        s3.Roll = 3;
        s3.Name = "Raj";
        s3.Marks = 97;
        array_new[2] = s3;

        // Error 3: Attempting to access local variable out of its loop scope
        for (int i = 0; i < array_new.length; i++) {
            Student temp = array_new[i];
        }
        System.out.println(temp.Name); 

        // Error 4: Primitive vs Reference comparison logic
        Student s4 = new Student();
        s4.Roll = 2;
        s4.Name = "Harsh";
        s4.Marks = 95;
        
        if (s2 == s4) { // Error 5 (Logical): Reference equality vs contents
            System.out.println("Duplicate student found!");
        }
    }
}