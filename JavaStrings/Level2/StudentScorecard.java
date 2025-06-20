package JavaStrings.Level2;

import java.util.Random;

public class StudentScorecard {
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            marks[i][1] = rand.nextInt(41) + 60; // Chemistry (60-100)
            marks[i][2] = rand.nextInt(41) + 60; // Math (60-100)
        }
        return marks;
    }
    public static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3]; // Total, Avg, Percentage
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;

            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double perc = stats[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.printf("%-5s %-8s %-10s %-8s %-8s %-10s %-10s %-8s\n",
                "ID", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-5d %-8d %-10d %-8d %-8.0f %-10.2f %-10.2f %-8s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        int students = 10;
        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
    }
}

