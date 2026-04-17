public class GradeClassifier {

    public String classify(int score) {
        if (score >= 90) {
            return "Xuất sắc";
        } else if (score >= 75) {
            return "Giỏi";
        } else if (score >= 60) {
            return "Khá";
        } else if (score >= 50) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public void printResults(int[] scores) {
        for (int score : scores) {
            String grade = classify(score);
            System.out.println("Điểm: " + score + " -> " + grade);
        }
    }

    public static void main(String[] args) {
        GradeClassifier classifier = new GradeClassifier();
        int[] scores = {95, 80, 65, 55, 40};
        classifier.printResults(scores);
    }
}