public class Student {
    private String name;
    private int[] grades = new int[5];

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public char getFinalGrade(double average) {
        if (average <= 50) {
            return 'F';
        } else if (average <= 60) {
            return 'E';
        } else if (average <= 70) {
            return 'D';
        } else if (average <= 80) {
            return 'C';
        } else if (average <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void printResults() {
        double average = calculateAverage();
        char finalGrade = getFinalGrade(average);

        System.out.println("Nombre del estudiante: " + name);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Promedio: " + average);
        System.out.println("Calificación: " + finalGrade);
    }
}
