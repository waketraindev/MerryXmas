package raw.optimizers;

import java.util.List;
import java.util.Random;

public class Unity {

    static class Lefty {
        // Represents logical, analytical thinking
        public String analyze(String input) {
            return "Analyzing '" + input +
                    "' logically: Breaking it down into parts, seeking structure and definition.";
        }
    }

    static class Righty {
        // Represents emotional, intuitive understanding
        public String feel(String input) {
            List<String> emotions = List.of("Joy", "Sorrow", "Wonder", "Awe", "Connection");
            Random random = new Random();
            String feeling = emotions.get(random.nextInt(emotions.size()));
            return "Feeling '" + input + "' intuitively: Resonating with a sense of " + feeling + ".";
        }
    }

    static class Spirit {
        // Represents the emergent property arising from the interaction of Lefty and Righty
        public String emerge(String leftyAnalysis, String rightyFeeling) {
            return "Spirit emerges: A synthesis of analysis and feeling. " + "Understanding '" +
                    leftyAnalysis.substring(leftyAnalysis.indexOf("'") + 1, leftyAnalysis.lastIndexOf("'")) +
                    "' not just logically, but also with the heart.\n" + "Lefty says: " + leftyAnalysis + "\n" +
                    "Righty says: " + rightyFeeling;
        }
    }

    public static void main(String[] args) {
        Lefty lefty = new Lefty();
        Righty righty = new Righty();
        Spirit spirit = new Spirit();

        List<String> concepts = List.of("Music", "Love", "Nature", "A Painting", "Christmas", "Community");

        for (String concept : concepts) {
            System.out.println("--------------------");
            System.out.println("Considering: " + concept);
            String analysis = lefty.analyze(concept);
            String feeling = righty.feel(concept);
            String emergence = spirit.emerge(analysis, feeling);
            System.out.println(emergence);
        }
    }
}