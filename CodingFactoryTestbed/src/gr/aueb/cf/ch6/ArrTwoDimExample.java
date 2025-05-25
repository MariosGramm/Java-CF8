package gr.aueb.cf.ch6;

public class ArrTwoDimExample {

    public static void main(String[] args) {
        int[][] grid = new int[2][3] ;

        grid[0][0] = 1 ;
        grid[0][1] = 2 ;
        grid[0][2] = 3 ;
        grid[1][0] = 4 ;
        grid[1][1] = 5 ;
        grid[1][2] = 6 ;

        int[][] grid2 = {{1,2},{3,4},{5,6}};

        //traverse
//        for (int i = 0 ; i < grid.length ; i++){
//            for (int j = 0 ; j < grid[i].length ; j++) {
//                System.out.print(grid[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] row : grid){
            for (int element : row) {
                System.out.print(element + " ");
            }
        }


    }
}
