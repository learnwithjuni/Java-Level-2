public class DanceLesson extends Lesson {
  int difficulty;
  String danceType;

  public DanceLesson(int d, int s, int di, String t) {
    super(d, s, "dance");
    difficulty = di;
    danceType = t;
  }
  
  public void setDifficulty(int di) {
    difficulty = di;
  }

  public boolean hasSameDifficulty(DanceLesson d) {
    return difficulty == d.difficulty;
  }

  public boolean easierThan(DanceLesson d) {
    return difficulty < d.difficulty;
  }
}