package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

//----For later???-----//
//for (String key : map.keySet()) {     String value = map.get(key); }

public class GradesApplication {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            HashMap<String, Student> students = new HashMap<>();

            Student student1 = new Student("James Spicer");
            student1.addGrade(99);
            student1.addGrade(100);
            student1.addGrade(82);

            Student student2 = new Student("Victor Bernal");
            student2.addGrade(76);
            student2.addGrade(85);
            student2.addGrade(69);

            Student student3 = new Student("Shane Dymond");
            student3.addGrade(89);
            student3.addGrade(82);
            student3.addGrade(91);

            Student student4 = new Student("Dylan Manuel");
            student4.addGrade(100);
            student4.addGrade(100);
            student4.addGrade(100);

            students.put("Jspicy", student1);
            students.put("BBB", student2);
            students.put("President", student3);
            students.put("HAckerzZ", student4);

            System.out.println("\nHello! Welcome to the grades program\n");
            System.out.println("Please select a student github username from the list below, or type in a student name you are looking for\n");
            System.out.println("Jspicy[1] | BBB[2] | President[3] | HAckerzZ[4]\n");


            int usrNum;
            //String usrNm = "string";
            while((usrNum = userInput.nextInt()) != -1) {
                if (usrNum == 1) {
                    System.out.println(students.get("Jspicy").getName());
                    System.out.println(students.get("Jspicy").getGradeAverage());
                } else if (usrNum == 2) {
                    System.out.println(students.get("BBB").getName());
                    System.out.println(students.get("BBB").getGradeAverage());
                } else if (usrNum == 3) {
                    System.out.println(students.get("President").getName());
                    System.out.println(students.get("President").getGradeAverage());
                } else if (usrNum == 4) {
                    System.out.println(students.get("HAckerzZ").getName());
                    System.out.println(students.get("HAckerzZ").getGradeAverage());
                } else if (usrNum != 1) {
                    System.out.println("No such user exists");
                }
            }


//            String usrNm;
//            usrNm = userInput.nextLine();
//            while(usrNm.equals(students)){
//                if (usrNum == 1) {
//                    System.out.println(students.get("Jspicy").getName());
//                    System.out.println(students.get("Jspicy").getGradeAverage());
//                } else if (usrNum == 2) {
//                    System.out.println(students.get("BBB").getName());
//                    System.out.println(students.get("BBB").getGradeAverage());
//                } else if (usrNum == 3) {
//                    System.out.println(students.get("President").getName());
//                    System.out.println(students.get("President").getGradeAverage());
//                } else if (usrNum == 4) {
//                    System.out.println(students.get("HAckerzZ").getName());
//                    System.out.println(students.get("HAckerzZ").getGradeAverage());
//                } else if (usrNum != 1 && usrNum != 2 && usrNum != 3 && usrNum != 4) {
//                    System.out.println("No such user exists");
//                }
//            }
    }
}

/*
            Student student1 = new Student("James Spicer");
            student1.addGrade(99);
            student1.addGrade(100);
            student1.addGrade(82);
            System.out.println(student1.getName());
            System.out.println(student1.getGradeAverage());

            Student student2 = new Student("Victor Bernal");
            student2.addGrade(76);
            student2.addGrade(85);
            student2.addGrade(69);
            System.out.println(student2.getName());
            System.out.println(student2.getGradeAverage());

            Student student3 = new Student("Shane Dymond");
            student3.addGrade(89);
            student3.addGrade(82);
            student3.addGrade(91);
            System.out.println(student3.getName());
            System.out.println(student3.getGradeAverage());

            Student student4 = new Student("Dylan Manuel");
            student4.addGrade(100);
            student4.addGrade(100);
            student4.addGrade(100);
            System.out.println(student4.getName());
            System.out.println(student4.getGradeAverage());

            System.out.println(students.get("Jspicy").getName());
            System.out.println(students.get("Jspicy").getGradeAverage());
*/