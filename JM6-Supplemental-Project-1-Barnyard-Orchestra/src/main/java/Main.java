import java.util.*;

class Main {
    public static void main(String[] args) {

      // Set up map to match the animals to their sounds 
      Map<String, String> animalSounds = new HashMap<>();
      animalSounds.put("cow", "moo");
      animalSounds.put("pig", "oink");
      animalSounds.put("sheep", "bahhh");
      animalSounds.put("chicken", "baawk");
      animalSounds.put("frog", "ribbit");
      animalSounds.put("dog", "bark");
      animalSounds.put("cat", "meow");

      // Set up an ArrayList to store animal players 
      ArrayList<AnimalPlayer> animals  = new ArrayList<>();

      // Get info on animals and frequency from the user and store in ArrayList
      for (int i = 0; i < 3; i++) {
        Scanner in = new Scanner(System.in);
  
        System.out.print("What animal do you want to add to the orchestra? (Enter cow, pig, sheep, chicken, frog, dog or cat)" );
        String animal = in.nextLine();
        
        System.out.print("How often should " 
                         + animal + " speak? (Enter time in seconds) ");
        Double seconds = in.nextDouble();
        
        int interval = (int)(seconds * 1000); // convert time in seconds to milliseconds 
        AnimalPlayer a1 = new AnimalPlayer(animalSounds.get(animal), interval);
        animals.add(a1);
      }

      // Program each player to start 
      for(int i = 0; i < animals.size(); i++){
        animals.get(i).init();
      }


    }
}