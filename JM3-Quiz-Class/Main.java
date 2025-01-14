class Main {
  public static void main(String[] args) {

    String[] questions = new String[5];
    questions[0] = "How many states are there in the US?";
    questions[1] = "How many countries are there in the world?";
    questions[2] = "What year did the Revolutionary War start?";
    questions[3] = "Who invented the printing press?";
    questions[4] = "Which planet is closest to the sun?";
    Quiz q = new Quiz("Kendra", 100, questions);

    System.out.println("\n"+q);
    System.out.println("There have now been " + Quiz.getNumQuizzes() + " quizzes taken.");
    System.out.println();

    Quiz q2 = new Quiz("Jake", 80, questions);
    System.out.println(q2);
    System.out.println("There have now been " + Quiz.getNumQuizzes() + " quizzes taken.");
    System.out.println();

    Quiz q3 = new Quiz("Alex", 80, questions);
    System.out.println(q3);
    System.out.println("There have now been " + Quiz.getNumQuizzes() + " quizzes taken.");
  }
}