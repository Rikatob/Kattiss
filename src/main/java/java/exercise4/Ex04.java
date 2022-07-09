package java.exercise4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ex04 {

    public ArrayList<String> ex04(Program program){
       return program.courses.stream()
                .flatMap(course -> course.students.entrySet().stream())
               .distinct()
               .map(student -> {
                   String epost = "";
                   epost += student.getValue().firstName.charAt(0);  // to get the first letter in firstname.
                   epost += student.getValue().lastName.charAt(0);   // get the first letter in lastname.
                   epost += student.getKey() %100;                   // student id modulo 100 to get the two last numbers in the ID.  192 % 100 = 92, 10092 % 100 = 92.
                   epost += "@hk.no";
                   return epost;
               })
                .collect(Collectors.toCollection(ArrayList<String>::new));
    }
}
