
package studentinformationsystem2;

public class StudentInformationSystem2 {
        public static void main(String[] args) {
        System.out.println("Name: Muhammad Iqbal Izzuddin bin Arshad"); 
        System.out.println("Student ID: S84758"); 
        System.out.println("Programme: Bachelor of Computer Science (Software Engineering) ");
        float M1 = 80, M2 = 90;
        float total = M1 + M2;  //total fullMark= 200
        String grade;
        if (total >= 180){
        grade = "A";
            }else if (total >= 160){
            grade = "B";
                }else if (total >= 140) {
                        grade = "C";
                        }else
                        grade = "fail";
        System.out.println("Total Mark = "+total);
        System.out.println("Grade : "+grade);
    }
    
}
