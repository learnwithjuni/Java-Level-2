public class Quiz {
  private int score;
  private String name;
  private String[] questions;

  //NOTE:
  //complete the project without this variable
  //then come back and add it later
  private static int numQuizzes; 

  public Quiz() {
    name = "";
    questions = new String[5];
    numQuizzes++;
  }

  public Quiz(String n, int s) {
    name = n;
    score = s;
    numQuizzes++;
  }

  public Quiz(String n, int s, String[] q) {
    name = n;
    score = s;
    questions = q;
    numQuizzes++;
  }

  public int getScore() {
    return score;
  }

  public String getLetterGrade() {
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

  public String toString() {
    int rand = (int)(Math.random() * 5);
    return name + " received a grade of " + getLetterGrade() + " on the quiz. A random question on the quiz was: " + questions[rand];
  }

  public static int getNumQuizzes() {
    return numQuizzes;
  }
}