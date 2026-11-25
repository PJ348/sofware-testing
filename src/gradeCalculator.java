
public class gradeCalculator {
    public String gradeOf(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 75) {
            return "B+";
        } 
        return null;
    }
}
