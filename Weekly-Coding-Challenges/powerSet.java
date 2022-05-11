public class powerSet {
    
    public static void main(String[] args){
        char[] set = {'j', 'a', 'v', 'a', 'c', 'o', 'd', 'e'};
        PowerSet(set, 8);

    }

    public static void PowerSet(char[] powerSet, int length){

        long setLength = (long)Math.pow(2, length);

        for(int count = 0; count < setLength; count++){
            for(int i = 0; i < length; i++){
                if((count & (1 << i)) > 0){
                    System.out.print(powerSet[i]);
                }
            }
            System.out.print(" ");
        }

    }
}
