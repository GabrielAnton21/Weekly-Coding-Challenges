//  This is the solution to the Magic Index weekly coding challenge

//  Author: Gabriel Anton
//  Date: 5/11/22
 
 
 class MagicIndex {
    
    
    
    public static void main(String[] args){
        int[] A = {0,1,3,5,6,4,2};
        magicIndex(A);
        
        int[] M = {0,1,2,3,4,5,6};
        magicIndex(M);
        
    }

    public static void magicIndex(int[] Array){
        Boolean isMagicIndex = false;
        for(int i = 0; i<Array.length; i++){
            if(Array[i] == i){
                isMagicIndex = true;
            }
            else{
                isMagicIndex = false;
            }
        }
        for (int element: Array) {
            System.out.print(element);
        }
        System.out.println(" ");
        System.out.println("It is " + isMagicIndex + " that this is a magic index.");
    }
}