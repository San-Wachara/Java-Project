public class TwoDArrays {
    
    public static void main(String[]args){
        int [][] numb = new int[][]{{5,45,47,87,33,65,54},
                                     {67,78,89,90,54,34,4}};
        for(int rows = 0;rows<2;rows++){
            System.out.print("{");
            for(int col =0;col<7;col++){
                System.out.print(numb[rows][col]);
                if(col<=5)
                System.out.print(",");
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.println("The array is over.Thank you");
    }
}
