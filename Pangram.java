# Pangram
import java.io.*;
import java.util.*;


public class Pangram 
{
  public static void main(String[] args)
  {  int d=0;
    Scanner s1 = new Scanner(System.in);
    String s = s1.next();
    int n = 26; 
    if(s.length() < n){
      d=-1;
    }
    for(char c = 'A'; c <= 'Z' ; c++){
      if((s.indexOf(c) < 0) && (s.indexOf((char)(c + 32)) < 0)){
        d=-1;
      }
      else
      d=1;
    }
    if(d == -1)
    System.out.print("not pangram");
    else
    System.out.print("pangram");
    
  }
}
