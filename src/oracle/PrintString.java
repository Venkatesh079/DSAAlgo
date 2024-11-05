package oracle;

public class PrintString {

    public static void main(String[] args) {

       stringWithtwoRepeatingChars("ab4cd2ef0gh1");
      // stringWithtwoRepeatingChars("abb4cd2e4f0");



    }

    private static void stringWithRepeatingChars(String s){

        StringBuilder input = new StringBuilder(s);
        StringBuilder output = new StringBuilder();



        for (int i = 0; i <input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar) && Character.isDigit(input.charAt(i + 1)))
            {
                int count = Character.getNumericValue(input.charAt(i + 1));
                output.append(String.valueOf(currentChar).repeat(Math.max(0, count)));

            }
            i++;
        }
        System.out.println(output);
        }

    private static void stringWithtwoRepeatingChars(String s){

        StringBuilder input = new StringBuilder(s);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i <input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar) && !Character.isDigit(input.charAt(i + 1))){

                char nextChar = input.charAt(i+1);
                if (Character.isLetter(nextChar) && Character.isDigit(input.charAt(i + 2))){
                    int count = Character.getNumericValue(input.charAt(i + 2));
                    output.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
                    i++;

                }
            }
        }
        System.out.println(output);

    }

}
