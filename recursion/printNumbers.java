package recursion;

public class printNumbers {

    public static void printNaturalNumbers(int n){
        //base case
        if(n==1){
            System.out.print(n + " ");
            return;
        }

        // recursion
        System.out.print(n + " ");
        printNaturalNumbers(n-1);

       

    }
    public static void main(String[] args) {
        printNaturalNumbers(4);
    }
}