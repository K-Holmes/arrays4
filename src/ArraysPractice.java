public class ArraysPractice {
    public void arraySetup(){
        //1
        System.out.println("Arrays 1-4: Not printed to console");
        double[] winners = new double[18];

        //2: an array of prime numbers
        int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};

        //3
        int[] num = new int[20];
        for (int i: num){
            num[i] = i*2;
        }

        //4
        int[][] maze = new int[30][40];

        //5
        System.out.println("Array 5: Really big array");
        int[][] newMaze = new int[16][32];
        for (int i=0;i<16;i++){
            for(int j=0;j<32;j++){
                newMaze[i][j]= i+j;
                System.out.print(newMaze[i][j]+" ");
            }
            System.out.println();
        }

        //6
        System.out.println("\nArray 6: 2d Array");
        int array6[][]= {{2,3,1},{2,2,1},{0,2,3},{1,0,4}};
        for(int i=0;i<4;i++){
            //visualizes the array line by line
            for(int j=0;j<3;j++){
                System.out.print(array6[i][j]);
            }
            System.out.println();}

        //7
        System.out.println("\nArray 7: Print out final number");
        int array7[][]= {{2,2,2},{2,2,0}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //prints out the last value in the array
                if(array7[i][j]==0&&j==2){
                    System.out.print(array7[i][j]);
                }
            }
        }System.out.println();

        //8
        System.out.println("\nArray 8: Double array values");
        int array8[][]= {{6,4,3},{4,3,2}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //doubles the already established array values
                System.out.print(2*array8[i][j]);
            }
        }System.out.println();

    }
}
