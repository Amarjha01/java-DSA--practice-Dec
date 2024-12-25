package string;

public class palindrome {

    public static boolean ispalindrome(String str){
       for(int i =0; i<str.length()/2; i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i))
        return false;
       }
       return true;
    }

    
public static float  getshortestpath(String path){
    int x =0; int y =0;
for(int i=0; i<path.length(); i++){
    char dir = path.charAt(i);
    if(dir=='s'){
        y--;
    }else if(dir=='E'){
        x++;
    }else if(dir=='W'){
        x-- ;
    }else if(dir =='N'){
        y++;
    }

}
int x2 = x*x;
int y2 = y*y;

return (float)Math.sqrt(x2+y2);
}

    public static void main(String[] args) {
        // String palindrome = "an";
        // System.out.println(ispalindrome(palindrome));
        String path = "NSS";
        System.out.print(getshortestpath(path));
    }
}
