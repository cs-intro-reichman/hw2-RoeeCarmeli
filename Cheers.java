// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                int repetNum = Integer.parseInt(args[1]);
                int length = cheer.length();
                int i = 0;
                cheer = cheer.toUpperCase();
               
                while (i < length) {
                        Character letter = cheer.charAt(i);
                        if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' || letter == 'I' || letter == 'L'
                        || letter == 'M' || letter == 'N' || letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X')
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                        else System.out.println("Give me a  " + letter + ": " + letter + "!");
                        i++;
                }

                i = 0;
                System.out.println("What does that spell?");
                while (i < repetNum) {
                        System.out.println(cheer + "!!!");
                        i++;
                }
                System.out.println();
        }
}
