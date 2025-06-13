class MostFreqChar
{
 public static void main(String[] args)
 {
 String input = "Java is aprogramming language";
 char mostFreqChar = findMostFreqChar(input);
 System.out.println("Most Frequent Character: " +
mostFreqChar);
 }
 public static char findMostFreqChar(String str)
 {
 int[] frequency = new int[287];
 for (int i = 0; i < str.length(); i++)
 {
 frequency[str.charAt(i)]++;
 }
 char mostFreqChar = ' ';
 int maxFrequency = 0;
 for (int i = 0; i < str.length(); i++)
 {
 if (frequency[str.charAt(i)] > maxFrequency)
 {
 maxFrequency = frequency[str.charAt(i)];
 mostFreqChar = str.charAt(i);
 }
 }
 return mostFreqChar;
 }
}
