

public class recursiveMultiply {
   

    static int recursivemultiply(int opA, int opB){
            if(opB == 0 | opA == 0){
                return 0;
            }
            else if(opB < 0){
                return -(opA + recursivemultiply(opA, opB+1));
            }
            else {
                return opA + recursivemultiply(opA, opB-1);
            }
            
        
        

    }
    public static void main(String[] args){

        System.out.println(recursivemultiply(4, 5));
    }
}

