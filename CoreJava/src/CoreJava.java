public class CoreJava<avg> {

    static void main(String[] args) {


    }

    //1.	Write a code for accepting three numbers and display the lowest number out of three numbers.

    public static int smallest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;

        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
//2.	Write a code to accept student Details like (StudentID, StudentName,
//StudentAge, Marks1, Marks2, Marks3)
    public static void studentDetails(int StudentID, String StudentName,
                                      int StudentAge, int Marks1, int Marks2, int Marks3) {
        int avg = 0;
        int[] marks = {Marks1, Marks2, Marks3};

        for (int i = 0; i < marks.length; i++) {
            avg = avg + marks[i];
        }
        avg = avg / 3;
        if (avg >= 50) {
            System.out.print("PASS");
            return;
        } else {
            System.out.print("FAIL");
            return;
        }
    }
    //3.	Write a function to get grade of 3 subject marks.
    //Grade is based on average of 3 subject marks
    public String findGrade(int class1, int class2, int class3) {
        // check score is within 0-100 or not
        int avg =0;
        int[] marks = {class1, class2, class3};
        for (int i = 0; i < marks.length; i++) {
            avg = avg + marks[i];
        }
        avg = avg / 3;

        if(avg < 0 || avg > 100)
            return "Invalid score"; // or throw exception

        // switch-case
        switch(avg/10) {
            // for >= 90
            case 10:
                return "A+";
            case 9:
                return "A";
            // for >= 80 and <90
            case 8:
                return "A-";
            // for >= 70 and <80
            case 7:
                return "B+";
            // for >= 60 and <70
            case 6:
                return "B";
            // for >= 50 and <60
            case 5:
                return "E";
            // for < 50
            default:
                return "FAIL";
        }
    }


    public static void timesTale(int number){

        for(int i = 1; i <= 10; ++i)
        System.out.println(number + " * " + i +
                " = " + number * i);
    }
    }





