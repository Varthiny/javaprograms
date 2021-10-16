
class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 70;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}

/*class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (76 >= 90) {
            grade = 'A';
        } else if (76 >= 80) {
            grade = 'B';
        } else if (76 >= 70) {
            grade = 'C';
        } else if (76 >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}*/