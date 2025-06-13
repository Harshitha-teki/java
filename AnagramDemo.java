import java.util.Arrays;
class AnagramDemo
{
 public static void main(String[] args)
 {
 String str1 = "LISTEN";
 String str2 = "SILENT";
 str1 = str1.toUpperCase();
 str2 = str2.toUpperCase();
 char[] ch1 = str1.toCharArray();
 char[] ch2 = str2.toCharArray();
 Arrays.sort(ch1);
 Arrays.sort(ch2);
 String srr1 = new String(ch1);
 String srr2 = new String(ch2);
 if (srr1.equals(srr2))
 {
 System.out.println("Anagram");
 }
 else
 {
 System.out.println("Not Anagram");
 }
 }
}
