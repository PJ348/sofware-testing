
public class gradeCalculator {
    private static final int[] MIN = {80, 75, 70, 65, 60, 55, 50};
    private static final String[] GRADE = {"A", "B+", "B", "C+", "C", "D+", "D"};

    public String gradeOf(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("คะแนนติดลบไม่ได้");
        }
        if (score > 100) {
            throw new IllegalArgumentException("คะแนนมากกว่า100ไม่ได้");
        }

        for (int i = 0; i < MIN.length; i++) {
            if (score >= MIN[i]) {
                return GRADE[i];
            }
        }
        return "F";
    }
}

