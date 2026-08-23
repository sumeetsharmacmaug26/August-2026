import java.util.Scanner;

public class ProblemMenu {

    static String S;
    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    static void GradeEvaluation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Marks for maths");
        int math = sc.nextInt();
        System.out.println("Give Marks for Science");
        int Sci = sc.nextInt();
        System.out.println("Give Marks for History");
        int Hist = sc.nextInt();

        int avg = (math + Sci + Hist) / 3;
        System.out.println("Average Marks:" + avg);
        if (avg >= 90) System.out.println("Grade A");
        else if (avg >= 70 && avg <= 89) System.out.println("Grade B");
        else if (avg >= 50 && avg <= 69) System.out.println("Grade C");
        else if (avg >= 30 && avg <= 49) System.out.println("Grade D");
        else System.out.println("Fail");
    }

    static void LeapYearcheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Year");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year");

        } else System.out.println(year + " is not a Leap  year");
    }

    static void DayofWeek() {
        System.out.println("Choose options:\n 1. Monday \n 2. Tuesday \n 3. Wednesday \n 4. Thursday \n 5. Friday \n 6. Saturday \n 7. Sunday  ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The Day is Monday");
                break;
            case 2:
                System.out.println("The Day is Tuesday");
                break;
            case 3:
                System.out.println("The Day is Wednesday");
                break;
            case 4:
                System.out.println("The Day is Thursday");
                break;
            case 5:
                System.out.println("The Day is Friday");
                break;
            case 6:
                System.out.println("The Day is Saturday");
                break;
            case 7:
                System.out.println("The Day is Sunday");
                break;

        }
    }

    static void Initialise() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(S);
    }


    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {

            System.out.println("----Program Menu----");
            System.out.println("Problem 1: Grade Evaluation System");
            System.out.println("Problem 2: Leap Year Check");
            System.out.println("Problem 3: Day of the week");
            System.out.println("Problem 4: Identify Default Values of Variables");
            System.out.println("Case 5: Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---Grade Evaluation System---");
                    GradeEvaluation();
                    break;
                case 2:
                    System.out.println("---Leap Year Check---");
                    LeapYearcheck();
                    break;
                case 3:
                    System.out.println("---Dayof the week---");
                    DayofWeek();
                    break;
                case 4:
                    System.out.println("---Identify Default Values of Variables");
                    Initialise();
                    break;
                case 5:
                    System.out.println("---Exit---");
                    flag = false;
                    break;

            }
        }
    }
}