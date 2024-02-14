public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String inputString = "A surprising life is one with few expectations.";
        
        String stringWithoutSpaces = inputString.replaceAll("\\s", "");
        
        System.out.println("Original string: " + inputString);
        System.out.println("A surprising life is one with few expectations.: " + stringWithoutSpaces);
    }
}
