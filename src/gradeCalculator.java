
public class gradeCalculator {
    public String gradeOf(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 65) {
            return "C+";
        } 
        return null;
    }
}
