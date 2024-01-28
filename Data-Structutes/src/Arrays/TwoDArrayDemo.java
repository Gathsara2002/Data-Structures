package Arrays;

import java.util.Arrays;

/**
 * @author : Gathsara
 * created : 1/28/2024 -- 12:23 PM
 **/

public class TwoDArrayDemo {
    public static void main(String[] args) {

        //Initializing 2D array
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '+';
            }
        }

        //print 2D array
        System.out.println(Arrays.deepToString(board));

        //initialize with default values
        char[][] boardTwo = new char[][]{
                new char[]{'*', '*', '*'},
                new char[]{'*', '*', '*'},
                new char[]{'*', '*', '*'}
        };

        System.out.println(Arrays.deepToString(boardTwo));
    }
}
