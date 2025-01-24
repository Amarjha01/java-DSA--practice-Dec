package recursion;


public class decreasingOrder {
    
public static void printDecr(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.print(n+" ");
    printDecr(n-1);
}


public static void prindIncre(int n){
    if(n==1){
        System.out.print(1+" ");
        return;
    }
    prindIncre(n-1);
    System.out.print(n+" ");
}
    public static void main(String[] args){
       
        printDecr(87);
        prindIncre(33);
    }
}
