public class Palindrome {
  public static void main(String[] args) {
    String str = "Radar",revstr ="";
    int strlen = str.length();
    for(int i=(strlen-1);i>=0;--i){
        revstr = revstr+str.charAt(i);
    }
    if(str.toLowerCase().equals(revstr.toLowerCase())){
        System.out.println(str+" is a Palindrome String");
    }else{
        System.out.println(str+" is not a palindrome string");
    }
  }
}
