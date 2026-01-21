package week3_conditions_in_java;
public class GradeCalculator {
    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String getGradeSwitch(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(getGrade(85));       
        System.out.println(getGradeSwitch(85)); 
        System.out.println(getGradeSwitch(92)); 
        System.out.println(getGradeSwitch(58)); 
    }
}
